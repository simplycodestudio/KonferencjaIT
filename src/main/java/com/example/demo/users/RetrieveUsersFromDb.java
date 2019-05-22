package com.example.demo.users;

import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Properties;


@Repository
public class RetrieveUsersFromDb {
   private Connection conn = null;


    private ArrayList<String> users_list;

    private String JDBC_DRIVER;
    private String DB_URL;
    private String USER;
    private String PASS;

    public String[] getPropValues() throws IOException {
        String result = "";
        InputStream inputStream = null;
        try {
            Properties prop = new Properties();
            String propFileName = "application.properties";

            inputStream = getClass().getClassLoader().getResourceAsStream(propFileName);

            if (inputStream != null) {
                prop.load(inputStream);
            } else {
                throw new FileNotFoundException("property file '" + propFileName + "' not found in the classpath");
            }

            // get the property value and print it out
            DB_URL = prop.getProperty("spring.datasource.url");
            JDBC_DRIVER = prop.getProperty("spring.datasource.driver-class-name");
            USER = prop.getProperty("spring.datasource.username");
            PASS = prop.getProperty("spring.datasource.password");

        } catch (Exception e) {
            System.out.println("Exception: " + e);
        } finally {
            inputStream.close();
        }
        return new String[]{DB_URL, JDBC_DRIVER, USER, PASS};
    }

    public void ConnectToDb() throws Exception {


        Statement stmt = null;
        users_list = new ArrayList<String>();
        try {
            getPropValues();
            Class.forName(JDBC_DRIVER);


            System.out.println("Connecting to database...");
            conn = DriverManager.getConnection(DB_URL, USER, PASS);

            System.out.println("Connected database successfully...");
            stmt = conn.createStatement();
            String sql = "SELECT id, login, email FROM LIST_USERS";
            ResultSet rs = stmt.executeQuery(sql);

            // STEP 4: Extract data from result set

            while (rs.next()) {

                String id = rs.getString("id");
                String login = rs.getString("login");
                String email = rs.getString("email");

                users_list.add(rs.getString("id") + ". " + rs.getString("login") + " - " + rs.getString("email"));

            }

            rs.close();

        } catch (Exception ex) {
            throw ex;
        } finally {
            if (stmt != null) {
                stmt.close();
            }
            if (conn != null) {
                conn.close();
            }
        }
        System.out.println("Goodbye!");
    }


    public ArrayList<String> getUsers_list() {
        return users_list;

    }

    public Connection getConnection() {
        return conn;
    }
}

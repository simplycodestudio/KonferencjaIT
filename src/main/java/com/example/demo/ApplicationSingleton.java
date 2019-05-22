package com.example.demo;

import com.example.demo.users.RetrieveUsersFromDb;
import com.example.demo.models.Users;

import java.sql.Connection;

public class ApplicationSingleton {

    private Users user = null;
    private Connection connection = null;



    private RetrieveUsersFromDb retrieveUsersfromdb = null;
    private ApplicationSingleton() {
    }

    private static class Holder {
        private static final ApplicationSingleton INSTANCE = new ApplicationSingleton();
    }

    public static ApplicationSingleton getInstance() {
        return Holder.INSTANCE;
    }

    public Users getUser() {
        return user;
    }

    public void setUser(Users user) {
        this.user = user;
    }
    public Connection getConnection() {
        return connection;
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }
    public RetrieveUsersFromDb getRetrieveUsersfromdb() {
        return retrieveUsersfromdb;
    }

    public void setRetrieveUsersfromdb(RetrieveUsersFromDb retrieveUsersfromdb) {
        this.retrieveUsersfromdb = retrieveUsersfromdb;
    }
}

package com.example.demo;

import com.example.demo.users.RetrieveUsersFromDb;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication

public class DemoApplication {


	public static void main(String[] args) throws Exception {
		SpringApplication.run(DemoApplication.class, args);
		RetrieveUsersFromDb retrieveUsersfromdb = new RetrieveUsersFromDb();
		connectToDB(retrieveUsersfromdb);




	}
	private static void connectToDB(RetrieveUsersFromDb retrieveUsersfromdb) throws Exception {
		retrieveUsersfromdb.ConnectToDb();
		ApplicationSingleton.getInstance().setRetrieveUsersfromdb(retrieveUsersfromdb);
	}
}






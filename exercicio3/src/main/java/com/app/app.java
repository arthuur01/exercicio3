package com.app;
import static spark.Spark.*;

import com.service.UserService;
public class app {
	public static void main(String[] args) {
		port(8080);
		staticFiles.location("/public");
		
		
		
		post("/insertUser", (request, response) -> UserService.insert(request, response));
        post("/AuthUser", (request, response) -> UserService.autenticate(request, response));
		
	}
}

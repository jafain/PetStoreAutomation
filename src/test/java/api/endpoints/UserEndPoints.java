package api.endpoints;

import static io.restassured.RestAssured.*;

import api.playload.User;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

//UserEndPoints.java
//Create for perform Create, Read, Update, Delete requests the user API (CRUD)

public class UserEndPoints {
	
	public static Response createUser(User payload)
	{
		Response response= given() //For contentType and body see Swagger response in picture Word document
			.contentType(ContentType.JSON)
			.accept(ContentType.JSON)
			.body(payload)
		
		
			.when()
			.post(Routes.post_url);
		
		return response;
		
	}
	
	public static Response readUser(String userName)
	{
		Response response= given() //For contentType and body see Swagger response in picture Word document
		.pathParam("username", userName)
		
		.when()
			.get(Routes.get_url);
		
		return response;
		
	}

	
	public static Response  updateUser(String userName, User payload)
	{
		Response response= given() 
			.contentType(ContentType.JSON)
			.accept(ContentType.JSON)
			.pathParam("username", userName)
			//here we need pathparam but not in createUser above 
			
			.body(payload)
		.when()
			.put(Routes.update_url);
		
		return response;
		
	}
	public static Response  deleteUser(String userName)
	{
		Response response= given() //For contentType and body see Swagger response in picture Word document
				.pathParam("username", userName)
		.when()
			.delete(Routes.delete_url);
		
		return response;
		
	}
	
}

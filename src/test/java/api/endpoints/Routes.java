package api.endpoints;

/*
Swagger URI----https://petstore.swagger.io
Get user(Post): https://petstore.swagger.io/v2/user
Get user (Get): https://petstore.swagger.io/v2/user/{username}
Update user (Put): https://petstore.swagger.io/v2/user/{username}
Delete user (Delete): https://petstore.swagger.io/v2/user/{username}
 */

public class Routes {
//Here we use static because we want access method without creating an object of class.
//We will use static to invoke all variables directly and use Routes instead of creating object of the class
//Every method starting as a static and we use static method to that we can access those methods directly by class name so public static
	public static String base_url = "https://petstore.swagger.io/v2";

	// user module

	// public static String post_url = "https://petstore.swagger.io/v2/user"; //or
	public static String post_url = base_url + "/user";
	public static String get_url = base_url + "/user/{username}";
	public static String update_url = base_url + "/user/{username}";
	public static String delete_url = base_url + "/user/{username}";

	// For example if we want to create another modules like:

	// Store module
	// Here you will create Store module URL's

	// Pet module
	// Here you will create pet module URL's

}

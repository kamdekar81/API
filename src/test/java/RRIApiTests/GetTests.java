package RRIApiTests;

import PojoClasses.CreateUserWithTld;
import PojoClasses.GetUser;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class GetTests {

	List<String> roles = new ArrayList<String>();
	List<String> ipaddresses = new ArrayList<String>();

	String adminuserName = "admin";
	String adminpassword = "password";

	String userName = null;

	GetUser getUserObj = new GetUser();

	public GetTests(String userName) {
		this.userName = userName;
	}

	@Test
public GetUser getUserApi()
{
		//BaseURL or Host
		RestAssured.baseURI="http://localhost:8080";

		return given().
			when().
			auth().basic(adminuserName, adminpassword).
			contentType("application/json").
			get("/admin/api/users/" + userName).
			then().statusCode(200).extract().as(GetUser.class);
}

}

package RRIApiTests;

import PojoClasses.CreateUserWithOutTld;
import PojoClasses.CreateUserWithTld;
import PojoClasses.GetUser;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class PostTests {

	List<String> roles = new ArrayList<String>();
	List<String> ipaddresses = new ArrayList<String>();

	String adminuserName = "admin";
	String adminpassword = "password";

	GetTests getUser;

	GetUser getUserResult = new GetUser();

	@Test
public void addUserApi()
{
		// TODO Auto-generated method stub
		String userName = "user3_rymonthly";
		String password = "password";

		roles.add("ry_monthly");
		ipaddresses.add("127.0.0.1/32");

		CreateUserWithTld user = new CreateUserWithTld();
		user.setAdmin_username(userName);
		user.setAdmin_password(password);
		user.setTld("mytld20");

		user.setRoles(roles);
		user.setIpAddresses(ipaddresses);

		//BaseURL or Host
		RestAssured.baseURI="http://localhost:8080";
		
		Response jspath = given().
		       when().
			   auth().basic(adminuserName,adminpassword).
			   contentType("application/json").
			   body(user).
		       post("/admin/api/users").
			   then().extract().response();

		System.out.println("-----Great Work-----");

		getUser = new GetTests(userName);
	    getUserResult = getUser.getUserApi(
		);

		List<String> resultRoles = getUserResult.getRoles();
		List<String> resultIpaddress = getUserResult.getIpAccessList();

		Assert.assertTrue(getUserResult.getUsername().equalsIgnoreCase(userName));
		Assert.assertTrue(getUserResult.getAuthMethod().equalsIgnoreCase("BCRYPT"));
		Assert.assertTrue(getUserResult.getTld().equalsIgnoreCase("mytld20"));
		Assert.assertTrue(roles.equals(resultRoles));
		Assert.assertTrue(ipaddresses.equals(resultIpaddress));
	}
}

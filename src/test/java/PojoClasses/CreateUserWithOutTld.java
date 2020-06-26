package PojoClasses;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import java.util.List;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class CreateUserWithOutTld {

public String username;
public String password;
public List<String> roles;
public List<String> ipAccessList;


public void setAdmin_username(String admin_username) {
	this.username = admin_username;
}

public void setAdmin_password(String admin_password) {
	this.password = admin_password;
}

public void setRoles(List<String> roles) {
	this.roles = roles;
}

public void setIpAddresses(List<String> ipAddresses) {
	this.ipAccessList = ipAddresses;
}





}

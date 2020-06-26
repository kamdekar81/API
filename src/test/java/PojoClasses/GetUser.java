package PojoClasses;

import java.util.List;

public class GetUser {

public String username;
public String password;
public List<String> roles;
public List<String> ipAccessList;
public String tld;
public List<String> ianaIds;
public String authMethod;

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}

	public List<String> getRoles() {
		return roles;
	}

	public List<String> getIpAccessList() {
		return ipAccessList;
	}

	public String getTld() {
		return tld;
	}

	public List<String> getIanaIds() {
		return ianaIds;
	}

	public String getAuthMethod() {
		return authMethod;
	}
}
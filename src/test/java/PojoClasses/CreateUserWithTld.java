package PojoClasses;

import java.util.List;

public class CreateUserWithTld {

public String username;
public String password;
public List<String> roles;
public List<String> ipAccessList;
public String tld;

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

public void setTld(String tld) { this.tld = tld; }

}
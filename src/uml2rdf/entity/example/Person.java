package uml2rdf.entity.example;

import thewebsemantic.Namespace;
import thewebsemantic.Uri;

@Namespace("http://mydomain/gabriel")
public class Person {
	private Address address;
	private String name;
	private String openid;
	
	public Person(String uri) {
		openid = uri;
	}
	
	@Uri
	public String getOpenid() {
		return openid;
	}
//@Namespace("http://mydomain/gabriel")
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}

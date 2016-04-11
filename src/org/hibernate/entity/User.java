package org.hibernate.entity;
import java.util.HashSet;
import java.util.Set;

public class User {
	private int userid; 				// User类的标识属性
	private String name; 			//name属性
	private String password;			//password属性
	private Set<Address> addresses=new HashSet<Address>(); 				// User类的关联实体属性
	//无参构造方法
	public User() {                                                                   
	}
	//初始化所有User属性的构造方法
	public User(int userid, String name, String password, String type, Address address) {
		this.userid = userid;
		this.name = name;
		this.password = password;
	}
	// userid属性的getter和setter方法
	public int getUseid() {
		return this. userid;
	}
	public void setUseid(int userid) {
		this. userid = userid;
	}
	//name的getter和setter方法
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	//password属性的getter和setter方法
	public String getPassword() {
		return this.password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	//address的getter和setter方法
	public Set<Address> getAddresses() {
		return this.addresses;
	}
	public void setAddresses(Set<Address> addresses) {
		this.addresses = addresses;
	}

}

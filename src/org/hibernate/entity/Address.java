package org.hibernate.entity;

public class Address {
	private int addressid;
	private String addressinfo;
	private User user;
	public Address() {
		// TODO Auto-generated constructor stub
	}
	public Address(int addressid,String addressinfo,User user){
		this.addressid=addressid;
		this.addressinfo=addressinfo;
		this.user=user;
	}
	public int getAddressid() {
		return addressid;
	}
	public void setAddressid(int addressid) {
		this.addressid = addressid;
	}
	public String getAddressinfo() {
		return addressinfo;
	}
	public void setAddressinfo(String addressinfo) {
		this.addressinfo = addressinfo;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
}

package org.hibernate.Test;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.entity.Address;
import org.hibernate.entity.HiberateUtil;

public class Test {
	public static void main(String[] args) {
		Session session=HiberateUtil.getSession();
		session.beginTransaction();
		try {
			Address address1=new Address();
			address1.setAddressinfo("China");
			Address address2=new Address();
			address2.setAddressinfo("America");
			Set<Address> addresses=new HashSet<>();
			addresses.add(address1);
			addresses.add(address2);
			org.hibernate.entity.User user=new org.hibernate.entity.User();
			user.setName("lucy");
			user.setPassword("111");
			address1.setUser(user);
			address2.setUser(user);
			user.setAddresses(addresses);		
			session.save(address1);
			session.save(address2);
			session.save(user);
			session.getTransaction().commit();
		} catch (Exception e) {
			session.getTransaction().rollback();
			e.printStackTrace();
			// TODO: handle exception
		}finally{
			session.close();
		}
	}
}

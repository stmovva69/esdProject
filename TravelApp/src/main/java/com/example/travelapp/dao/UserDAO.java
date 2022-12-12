package com.example.travelapp.dao;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.springframework.stereotype.Component;

import com.example.travelapp.pojo.User;


@Component
public class UserDAO extends DAO  {

//	 public UserDAO() {
//	    }

	    public void save(User user) throws Exception {
	        try {
	            begin();
	            getSession().save(user);
	            commit();
	        } catch (HibernateException e) {
	            rollback();
	            throw new Exception("Could not save user " , e);
	        }
	    }
	    public User login(String username,String password) throws Exception{
	    	try {
	    		getSession();
	    		begin();
	    		Query q=getSession().createQuery("from User where username = :username and password = :password");
	    		q.setParameter("username", username);
	    		q.setParameter("password", password);
	    		User user =(User)q.uniqueResult();
	    		commit();
	    		close();
	    		return user;
	    		
	    	}
	    	catch (HibernateException e) {

				throw new Exception("Could not login " + username, e);
			}
	    }
	    public void delete(User u) throws Exception {
	    	begin();
	    	getSession().delete(u);
	    	commit();
	    }
	
}
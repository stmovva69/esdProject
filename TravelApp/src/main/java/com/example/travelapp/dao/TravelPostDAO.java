package com.example.travelapp.dao;

import java.util.List;
import java.util.ArrayList;

import org.hibernate.HibernateException;
import org.hibernate.query.Query;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.example.travelapp.pojo.TravelPost;

@Component
public class TravelPostDAO extends DAO  {
public TravelPostDAO (){
	
}
	public void save(TravelPost travelPost) throws Exception {
        try {
            begin();
            getSession().save(travelPost);
            commit();
        } catch (HibernateException e) {
            rollback();
            throw new Exception("Could not save TravelPost", e);
        }
    }
    
    public List<TravelPost> list() {
		Query<TravelPost> query = getSession().createQuery("FROM TravelPost");
		List<TravelPost> list= query.list() ;
		//= 
		return list;
	}
    public TravelPost getTravelPostById(String TravelPostID) throws Exception {
		try {
			getSession();
			begin();
			Query q = getSession().createQuery("from TravelPost where id = :tid");
			q.setString("tid",TravelPostID);
				
			TravelPost job = (TravelPost) q.uniqueResult();
			commit();
			close();
			return job;
			
		} catch (HibernateException e) {

			throw new Exception("Could not get Travel Post ", e);
		}
	}
    public TravelPost deletePostByID(String postID ) throws Exception{
    	try {
    		getSession();
    		TravelPost t=getTravelPostById(postID);
    		begin();
    		Query q = getSession().createQuery("delete from TravelPost where id= :tid");
    		q.setInteger("tid", Integer.parseInt(postID));
    		System.out.println(q.executeUpdate());
    		commit();
    		close();
    		return t;
    	} catch (HibernateException e) {

			throw new Exception( e);
		}
    }

}

package com.example.travelapp.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.stereotype.Component;


@Component
@Entity
public class TravelPost {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;

@Column(nullable = false)
private String title;

@Column(nullable = false)
private String body;




public TravelPost(int id, String title, String body) {
	super();
	this.id = id;
	this.title = title;
	this.body = body;
}




public int getId() {
	return id;
}




public void setId(int id) {
	this.id = id;
}




public String getTitle() {
	return title;
}




public void setTitle(String title) {
	this.title = title;
}




public String getBody() {
	return body;
}




public void setBody(String body) {
	this.body = body;
}




public TravelPost() {


}


}
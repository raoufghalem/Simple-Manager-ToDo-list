package com.mlc.frontEnd.Entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Comment {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String comment;
	
	@ManyToOne(cascade=CascadeType.ALL,fetch=FetchType.EAGER)
	private SingleResource singleResource;
	
	public SingleResource getSingleResource() {
		return singleResource;
	}
	public void setSingleResource(SingleResource singleResource) {
		this.singleResource = singleResource;
	}

	
	
	
	public Comment() {}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public Long getId() {
		return id;
	}
	
	
	
	
}

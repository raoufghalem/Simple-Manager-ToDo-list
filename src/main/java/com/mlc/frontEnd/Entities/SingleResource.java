package com.mlc.frontEnd.Entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class SingleResource {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String url;
	
	@JsonIgnore
	@ManyToOne
	private ListOfResources listOfresource;	
	@OneToMany(mappedBy="singleResource")
	private List<Comment> comments;
	@OneToMany(mappedBy="")
	private List<Labels> listOfLabels;
	
	
	public ListOfResources getListOfresource() {
		return listOfresource;
	}


	public void setListOfresource(ListOfResources listOfresource) {
		this.listOfresource = listOfresource;
	}


	public SingleResource() {}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getUrl() {
		return url;
	}


	public void setUrl(String url) {
		this.url = url;
	}


	public List<Comment> getComments() {
		return comments;
	}


	public void setComments(List<Comment> comments) {
		this.comments = comments;
	}


	public List<Labels> getListOfLabels() {
		return listOfLabels;
	}


	public void setListOfLabels(List<Labels> listOfLabels) {
		this.listOfLabels = listOfLabels;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}
	
	
	
	
}

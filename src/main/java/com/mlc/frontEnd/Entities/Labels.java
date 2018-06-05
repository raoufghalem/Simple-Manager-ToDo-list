package com.mlc.frontEnd.Entities;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Labels {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	public void setId(Long id) {
		this.id = id;
	}
	private String labelName;
	private String labelColor;
	
	@ManyToOne
	private SingleResource singleResource;
	@ManyToOne
	private ListOfResources listOfResources;
	
	
	
//	private List<T> contains;
	
	public SingleResource getSingleResource() {
		return singleResource;
	}
	public void setSingleResource(SingleResource singleResource) {
		this.singleResource = singleResource;
	}
	public ListOfResources getListOfResources() {
		return listOfResources;
	}
	public void setListOfResources(ListOfResources listOfResources) {
		this.listOfResources = listOfResources;
	}
	public Labels() {}
	public String getLabelName() {
		return labelName;
	}
	public void setLabelName(String labelName) {
		this.labelName = labelName;
	}
	public String getLabelColor() {
		return labelColor;
	}
	public void setLabelColor(String labelColor) {
		this.labelColor = labelColor;
	}
	public Long getId() {
		return id;
	}
	
	
	
	

}

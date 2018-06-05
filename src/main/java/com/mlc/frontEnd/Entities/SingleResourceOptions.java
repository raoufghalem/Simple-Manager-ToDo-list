package com.mlc.frontEnd.Entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class SingleResourceOptions {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String optionName;
	private String optionValue1;
	private String optionValue2;
	private String optionValue3;
	
	public SingleResourceOptions() {}

	public String getOptionName() {
		return optionName;
	}

	public void setOptionName(String optionName) {
		this.optionName = optionName;
	}

	public String getOptionValue1() {
		return optionValue1;
	}

	public void setOptionValue1(String optionValue1) {
		this.optionValue1 = optionValue1;
	}

	public String getOptionValue2() {
		return optionValue2;
	}

	public void setOptionValue2(String optionValue2) {
		this.optionValue2 = optionValue2;
	}

	public String getOptionValue3() {
		return optionValue3;
	}

	public void setOptionValue3(String optionValue3) {
		this.optionValue3 = optionValue3;
	}

	public Long getId() {
		return id;
	}

	
	
	
	
}

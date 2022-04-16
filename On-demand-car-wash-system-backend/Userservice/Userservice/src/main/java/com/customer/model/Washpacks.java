package com.customer.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="washpackdb")
public class Washpacks {
	
	@Id
	private Integer id;
	private String packagename;
	private Integer Cost;
	private String description;

	
	public Washpacks() {
		super();
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getPackagename() {
		return packagename;
	}
	public void setPackagename(String packagename) {
		this.packagename = packagename;
	}
	public Integer getCost() {
		return Cost;
	}
	public void setCost(Integer cost) {
		Cost = cost;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Override
	public String toString() {
		return "Wash [id=" + id + ", packagename=" + packagename + ", Cost=" + Cost + ", description=" + description
				+ "]";
	}

}
	
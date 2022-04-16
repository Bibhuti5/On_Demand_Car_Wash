package admin.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@Document(collection ="Washerdb")
public class Washers {
	
	@Id
	private int id;
	private String name;
	private String location;
	
	public Washers() {
		super();
	}
	
	public Washers(int id, String name, String location) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "Washers [id=" + id + ", name=" + name + ", location=" + location + "]";
	}

	

}

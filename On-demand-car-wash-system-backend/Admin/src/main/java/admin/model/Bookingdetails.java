package admin.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="Bookingdetailsdb")
public class Bookingdetails {

@Id
    private String carBrand;
    private String carModel;
	private int washpackId;
	private String date;
	private Long contact;
	public String getCarBrand() {
		return carBrand;
	}
	public void setCarBrand(String carBrand) {
		this.carBrand = carBrand;
	}
	public String getCarModel() {
		return carModel;
	}
	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}
	public int getWashpackId() {
		return washpackId;
	}
	public void setWashpackId(int washpackId) {
		this.washpackId = washpackId;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public Long getContact() {
		return contact;
	}
	public void setContact(Long contact) {
		this.contact = contact;
	}
	@Override
	public String toString() {
		return "Bookingdetails [carBrand=" + carBrand + ", carModel=" + carModel + ", washpackId=" + washpackId
				+ ", date=" + date + ", contact=" + contact + "]";
	}

	
	
	
	
	
	
	
	
	
	
}

package com.example.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Company {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int cid;
	private String name;
	private String address;
	private Date establishmentdate;
	private String state;
	private String district;
	private String city;
	private String website;
	private String category;
	private String information;
	private String cfullName;
	private String ccontact;
	private String cgmail;
	private String hrfullName;
	private String hrcontact;
	private String hrgmail;
	
	public Company() {
		
	}

	public Company(int cid, String name, String address, Date establishmentdate, String state, String district,
			String city, String website, String category, String information ,String cfullName, String ccontact, String cgmail,
			String hrfullName, String hrcontact, String hrgmail) {
		
		super();
		this.cid = cid;
		this.name = name;
		this.address = address;
		this.establishmentdate = establishmentdate;
		this.state = state;
		this.district = district;
		this.city = city;
		this.website = website;
		this.category = category;
		this.information = information;
		this.cfullName = cfullName;
		this.ccontact = ccontact;
		this.cgmail = cgmail;
		this.hrfullName = hrfullName;
		this.hrcontact = hrcontact;
		this.hrgmail = hrgmail;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Date getEstablishmentdate() {
		return establishmentdate;
	}

	public void setEstablishmentdate(Date establishmentdate) {
		this.establishmentdate = establishmentdate;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getInformation() {
		return information;
	}

	public void setInformation(String information) {
		this.information = information;
	}

	public String getCfullName() {
		return cfullName;
	}

	public void setCfullName(String cfullName) {
		this.cfullName = cfullName;
	}

	public String getCcontact() {
		return ccontact;
	}

	public void setCcontact(String ccontact) {
		this.ccontact = ccontact;
	}

	public String getCgmail() {
		return cgmail;
	}

	public void setCgmail(String cgmail) {
		this.cgmail = cgmail;
	}

	public String getHrfullName() {
		return hrfullName;
	}

	public void setHrfullName(String hrfullName) {
		this.hrfullName = hrfullName;
	}

	public String getHrcontact() {
		return hrcontact;
	}

	public void setHrcontact(String hrcontact) {
		this.hrcontact = hrcontact;
	}

	public String getHrgmail() {
		return hrgmail;
	}

	public void setHrgmail(String hrgmail) {
		this.hrgmail = hrgmail;
	}

	@Override
	public String toString() {
		return "Company [cid=" + cid + ", name=" + name + ", address=" + address + ", establishmentdate="
				+ establishmentdate + ", state=" + state + ", district=" + district + ", city=" + city + ", website="
				+ website + ", category=" + category + ", information=" + information + ", cfullName=" + cfullName
				+ ", ccontact=" + ccontact + ", cgmail=" + cgmail + ", hrfullName=" + hrfullName + ", hrcontact="
				+ hrcontact + ", hrgmail=" + hrgmail + "]";
	}

	

	

	
}

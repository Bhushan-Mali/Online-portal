package com.example.model;


import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Candidate {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String lookingFor;
	private String title;
	private String fName;
	private String lName;
	private String gender;
	private Date bDate;
	private String email;
	private String contact;
	private String pancard;
	private String aadharcard;
	private String college;
	private String highestEdu;
	private String stream;
	private String grade;
	private String otherDegree;
	private String otherStream;
	private String preEducation;
	private String state;
	private String district;
	private String job;
	private String preDistrict;
	private String yearExp;
	private String relocate;
	private String workExp;
	
	
	public Candidate() {}

	public Candidate(int id, String lookingFor, String title, String fName, String lName, String gender, Date date,
			String email, String contact, String pancard, String aadharcard, String college, String highestEdu,
			String stream, String grade, String otherDegree, String otherStream, String preEducation, String state,
			String district, String job, String preDistrict, String yearExp, String relocate, String workExp
				) {
		super();
		this.id = id;
		this.lookingFor = lookingFor;
		this.title = title;
		this.fName = fName;
		this.lName = lName;
		this.gender = gender;
		this.bDate = date;
		this.email = email;
		this.contact = contact;
		this.pancard = pancard;
		this.aadharcard = aadharcard;
		this.college = college;
		this.highestEdu = highestEdu;
		this.stream = stream;
		this.grade = grade;
		this.otherDegree = otherDegree;
		this.otherStream = otherStream;
		this.preEducation = preEducation;
		this.state = state;
		this.district = district;
		this.job = job;
		this.preDistrict = preDistrict;
		this.yearExp = yearExp;
		this.relocate = relocate;
		this.workExp = workExp;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLookingFor() {
		return lookingFor;
	}

	public void setLookingFor(String lookingFor) {
		this.lookingFor = lookingFor;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Date getDate() {
		return bDate;
	}

	public void setDate(Date date) {
		this.bDate = date;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getPancard() {
		return pancard;
	}

	public void setPancard(String pancard) {
		this.pancard = pancard;
	}

	public String getAadharcard() {
		return aadharcard;
	}

	public void setAadharcard(String aadharcard) {
		this.aadharcard = aadharcard;
	}

	public String getCollege() {
		return college;
	}

	public void setCollege(String college) {
		this.college = college;
	}

	public String getHighestEdu() {
		return highestEdu;
	}

	public void setHighestEdu(String highestEdu) {
		this.highestEdu = highestEdu;
	}

	public String getStream() {
		return stream;
	}

	public void setStream(String stream) {
		this.stream = stream;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public String getOtherDegree() {
		return otherDegree;
	}

	public void setOtherDegree(String otherDegree) {
		this.otherDegree = otherDegree;
	}

	public String getOtherStream() {
		return otherStream;
	}

	public void setOtherStream(String otherStream) {
		this.otherStream = otherStream;
	}

	public String getPreEducation() {
		return preEducation;
	}

	public void setPreEducation(String preEducation) {
		this.preEducation = preEducation;
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

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public String getPreDistrict() {
		return preDistrict;
	}

	public void setPreDistrict(String preDistrict) {
		this.preDistrict = preDistrict;
	}

	public String getYearExp() {
		return yearExp;
	}

	public void setYearExp(String yearExp) {
		this.yearExp = yearExp;
	}

	public String getRelocate() {
		return relocate;
	}

	public void setRelocate(String relocate) {
		this.relocate = relocate;
	}

	public String getWorkExp() {
		return workExp;
	}

	public void setWorkExp(String workExp) {
		this.workExp = workExp;
	}

	@Override
	public String toString() {
		return "Candidate [id=" + id + ", lookingFor=" + lookingFor + ", title=" + title + ", fName=" + fName
				+ ", lName=" + lName + ", gender=" + gender + ", bDate=" + bDate + ", email=" + email + ", contact="
				+ contact + ", pancard=" + pancard + ", aadharcard=" + aadharcard + ", college=" + college
				+ ", highestEdu=" + highestEdu + ", stream=" + stream + ", grade=" + grade + ", otherDegree="
				+ otherDegree + ", otherStream=" + otherStream + ", preEducation=" + preEducation + ", state=" + state
				+ ", district=" + district + ", job=" + job + ", preDistrict=" + preDistrict + ", yearExp=" + yearExp
				+ ", relocate=" + relocate + ", workExp=" + workExp + "]";
	}

	
	
	
	
}

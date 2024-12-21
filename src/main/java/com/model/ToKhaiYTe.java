package com.model;

public class ToKhaiYTe {
	private String name;
	private String birthYear;
	private String sex;
	private String nationality;
	private String cccd;

	private String transport;
	private String transportId;
	private int chairNumber;

	private int startDate;
	private int startMonth;
	private int startYear;

	private int endDate;
	private int endMonth;
	private int endYear;

	private String visitedPlaces;

	private String city;
	private String town;
	private String street;
	private String address;

	private String phone;
	private String email;

	private boolean symptom1;
	private boolean symptom2;
	private boolean symptom3;
	private boolean symptom4;
	private boolean symptom5;
	private boolean symptom6;
	private boolean symptom7;
	private boolean symptom8;

	private boolean history1;
	private boolean history2;

	public ToKhaiYTe() {}

	public ToKhaiYTe(String name, String birthYear, String sex, String nationality, String cccd, String transport,
	                 String transportId, int chairNumber, int startDate, int startMonth, int startYear, int endDate,
	                 int endMonth, int endYear, String visitedPlaces, String city, String town, String street,
	                 String address, String phone, String email, boolean symptom1, boolean symptom2, boolean symptom3,
	                 boolean symptom4, boolean symptom5, boolean symptom6, boolean symptom7, boolean symptom8,
	                 boolean history1, boolean history2) {
		this.name = name;
		this.birthYear = birthYear;
		this.sex = sex;
		this.nationality = nationality;
		this.cccd = cccd;
		this.transport = transport;
		this.transportId = transportId;
		this.chairNumber = chairNumber;
		this.startDate = startDate;
		this.startMonth = startMonth;
		this.startYear = startYear;
		this.endDate = endDate;
		this.endMonth = endMonth;
		this.endYear = endYear;
		this.visitedPlaces = visitedPlaces;
		this.city = city;
		this.town = town;
		this.street = street;
		this.address = address;
		this.phone = phone;
		this.email = email;
		this.symptom1 = symptom1;
		this.symptom2 = symptom2;
		this.symptom3 = symptom3;
		this.symptom4 = symptom4;
		this.symptom5 = symptom5;
		this.symptom6 = symptom6;
		this.symptom7 = symptom7;
		this.symptom8 = symptom8;
		this.history1 = history1;
		this.history2 = history2;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBirthYear() {
		return birthYear;
	}

	public void setBirthYear(String birthYear) {
		this.birthYear = birthYear;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public String getCccd() {
		return cccd;
	}

	public void setCccd(String cccd) {
		this.cccd = cccd;
	}

	public String getTransport() {
		return transport;
	}

	public void setTransport(String transport) {
		this.transport = transport;
	}

	public String getTransportId() {
		return transportId;
	}

	public void setTransportId(String transportId) {
		this.transportId = transportId;
	}

	public int getChairNumber() {
		return chairNumber;
	}

	public void setChairNumber(int chairNumber) {
		this.chairNumber = chairNumber;
	}

	public int getStartDate() {
		return startDate;
	}

	public void setStartDate(int startDate) {
		this.startDate = startDate;
	}

	public int getStartMonth() {
		return startMonth;
	}

	public void setStartMonth(int startMonth) {
		this.startMonth = startMonth;
	}

	public int getStartYear() {
		return startYear;
	}

	public void setStartYear(int startYear) {
		this.startYear = startYear;
	}

	public int getEndDate() {
		return endDate;
	}

	public void setEndDate(int endDate) {
		this.endDate = endDate;
	}

	public int getEndMonth() {
		return endMonth;
	}

	public void setEndMonth(int endMonth) {
		this.endMonth = endMonth;
	}

	public int getEndYear() {
		return endYear;
	}

	public void setEndYear(int endYear) {
		this.endYear = endYear;
	}

	public String getVisitedPlaces() {
		return visitedPlaces;
	}

	public void setVisitedPlaces(String visitedPlaces) {
		this.visitedPlaces = visitedPlaces;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getTown() {
		return town;
	}

	public void setTown(String town) {
		this.town = town;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public boolean isSymptom1() {
		return symptom1;
	}

	public void setSymptom1(boolean symptom1) {
		this.symptom1 = symptom1;
	}

	public boolean isSymptom2() {
		return symptom2;
	}

	public void setSymptom2(boolean symptom2) {
		this.symptom2 = symptom2;
	}

	public boolean isSymptom3() {
		return symptom3;
	}

	public void setSymptom3(boolean symptom3) {
		this.symptom3 = symptom3;
	}

	public boolean isSymptom4() {
		return symptom4;
	}

	public void setSymptom4(boolean symptom4) {
		this.symptom4 = symptom4;
	}

	public boolean isSymptom5() {
		return symptom5;
	}

	public void setSymptom5(boolean symptom5) {
		this.symptom5 = symptom5;
	}

	public boolean isSymptom6() {
		return symptom6;
	}

	public void setSymptom6(boolean symptom6) {
		this.symptom6 = symptom6;
	}

	public boolean isSymptom7() {
		return symptom7;
	}

	public void setSymptom7(boolean symptom7) {
		this.symptom7 = symptom7;
	}

	public boolean isSymptom8() {
		return symptom8;
	}

	public void setSymptom8(boolean symptom8) {
		this.symptom8 = symptom8;
	}

	public boolean isHistory1() {
		return history1;
	}

	public void setHistory1(boolean history1) {
		this.history1 = history1;
	}

	public boolean isHistory2() {
		return history2;
	}

	public void setHistory2(boolean history2) {
		this.history2 = history2;
	}
}

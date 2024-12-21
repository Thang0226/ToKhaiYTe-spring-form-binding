package com.service;

import com.model.ToKhaiYTe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FormService implements IFormService {

	@Autowired
	private ToKhaiYTe form;

	private int[] years = intList(1924, 2025);
	private String[] sexes = {"Nam", "Nữ", "Khác"};
	private String[] nationalities = {"Việt Nam", "Trung Quốc", "Thái Lan"};
	private String[] transports = {"Tàu bay", "Tàu thuyền", "Ô tô", "Khác"};
	private int[] months = intList(1, 12);
	private int[] dates = intList(1, 31);
	private String[] cities = {"Hà Nội", "Đà Nẵng", "Hồ Chí Minh"};
	private String[] towns = {"Quận 1", "Quận 2", "Quận 3"};
	private String[] streets = {"Phố 1", "Phố 2", "Phố 3"};

	@Override
	public ToKhaiYTe getForm() {
		return form;
	}

	@Override
	public void setForm(ToKhaiYTe inputForm) {
		form.setName(inputForm.getName());
		form.setBirthYear(inputForm.getBirthYear());
		form.setSex(inputForm.getSex());
		form.setCccd(inputForm.getCccd());
		form.setNationality(inputForm.getNationality());
		form.setTransport(inputForm.getTransport());
		form.setTransportId(inputForm.getTransportId());
		form.setChairNumber(inputForm.getChairNumber());
		form.setStartDate(inputForm.getStartDate());
		form.setEndDate(inputForm.getEndDate());
		form.setStartMonth(inputForm.getStartMonth());
		form.setEndMonth(inputForm.getEndMonth());
		form.setStartYear(inputForm.getStartYear());
		form.setEndYear(inputForm.getEndYear());
		form.setVisitedPlaces(inputForm.getVisitedPlaces());
		form.setCity(inputForm.getCity());
		form.setTown(inputForm.getTown());
		form.setStreet(inputForm.getStreet());
		form.setAddress(inputForm.getAddress());
		form.setPhone(inputForm.getPhone());
		form.setEmail(inputForm.getEmail());

		form.setSymptom1(inputForm.isSymptom1());
		form.setSymptom2(inputForm.isSymptom2());
		form.setSymptom3(inputForm.isSymptom3());
		form.setSymptom4(inputForm.isSymptom4());
		form.setSymptom5(inputForm.isSymptom5());
		form.setSymptom6(inputForm.isSymptom6());
		form.setSymptom7(inputForm.isSymptom7());
		form.setSymptom8(inputForm.isSymptom8());
		form.setHistory1(inputForm.isHistory1());
		form.setHistory2(inputForm.isHistory2());
	}

	@Override
	public int[] getYears() {
		return years;
	}

	private int[] intList(int num1, int num2) {
		int[] nums = new int[num2 - num1 + 1];
		for (int i = 0; i < nums.length; i++) {
			nums[i] = num1 + i;
		}
		return nums;
	}

	@Override
	public String[] getSexes() {
		return sexes;
	}

	@Override
	public String[] getNationalities() {
		return nationalities;
	}

	@Override
	public String[] getTransports() {
		return transports;
	}

	@Override
	public int[] getMonths() {
		return months;
	}

	@Override
	public int[] getDates() {
		return dates;
	}

	@Override
	public String[] getCities() {
		return cities;
	}

	@Override
	public String[] getTowns() {
		return towns;
	}

	@Override
	public String[] getStreets() {
		return streets;
	}
}

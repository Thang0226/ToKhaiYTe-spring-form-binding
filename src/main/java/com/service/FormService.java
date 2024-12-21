package com.service;

import com.model.ToKhaiYTe;
import org.springframework.stereotype.Service;

@Service
public class FormService implements IFormService {

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
		return null;
	}

	@Override
	public void setForm(ToKhaiYTe form) {

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

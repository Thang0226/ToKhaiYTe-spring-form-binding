package com.controller;

import com.model.ToKhaiYTe;
import com.service.FormService;
import com.service.IFormService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/form")
public class FormController {
	@Autowired
	private IFormService formService;

	@GetMapping("/create")
	public String showForm(Model model) {
		ToKhaiYTe Form = new ToKhaiYTe();
		model.addAttribute("form", Form);
		return "create";
	}

	@PostMapping("/save")
	public String saveForm(@ModelAttribute("form") ToKhaiYTe Form, Model model) {
		formService.setForm(Form);
		model.addAttribute("message", "KHAI BÁO THÀNH CÔNG");
		return "index";
	}

}
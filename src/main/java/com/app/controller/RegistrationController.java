package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.app.entity.RegistrationEntity;
import com.app.model.MobileIsNotMatch;
import com.app.model.RegistrationService;
import com.app.utill.EmailService;

@Controller
public class RegistrationController {
	
	@Autowired
	private RegistrationService service;
	
	@Autowired
	private EmailService email;
	// 
	@RequestMapping("/view")
	public String viewCreatePage() {
		return "menu";
	}
	@RequestMapping("/viewpage")
	public String CreatePage() {
		return "CreatePage";
	}
	
	@RequestMapping("/saveReg")
	public String saveReg(RegistrationEntity registration , ModelMap model)  {
		service.saveData(registration);
//		registration.setEmail("mauryasangam308@gmail.com");
//		email.sendEmail(registration.getEmail(), "ka yar", "ha yar");
		model.addAttribute("save", "record is save ");
		return "CreatePage";
	}
	
	@RequestMapping("/list")
	public String viewAllData(ModelMap model) {
		List<RegistrationEntity> allData = service.findAllData();
		model.addAttribute("model", allData);
		return "viewAllData";
	}
	@RequestMapping("/deleteById")
	public String deleteById(Integer id) {
		service.deleteByID(id);
		return "redirect:/list";
	}
	
	@RequestMapping("/updateById")
	public String updateregById(Integer id , ModelMap model) {
		RegistrationEntity allData = service.UpdateRegById(id);
		model.addAttribute("allData", allData);
		return "UpdateReg";
	}
	
	@RequestMapping("/UpdateReg")
	public String updateReg(RegistrationEntity registration ,  ModelMap model) {
		service.updateReg(registration);
	   	List<RegistrationEntity> allData = service.findAllData();
		model.addAttribute("allData", allData);
		return "redirect:/list";
	}
//	@GetMapping("/reg/{id}")
//	public void getById(@PathVariable Integer id ) {
//		service.getRegById(id);
//		
//	}
}

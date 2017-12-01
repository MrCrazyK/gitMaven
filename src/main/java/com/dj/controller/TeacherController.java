package com.dj.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dj.entity.Teacher;
import com.dj.service.TeacherService;

@Controller
@RequestMapping("/teacher")
public class TeacherController {
	@Autowired
	private TeacherService teacherService;
	
	@RequestMapping("/login.do")	
	public  String findTeachers(Model model) {
		List<Teacher> teachers = teacherService.findTeachers();
		System.out.println(teachers);
		model.addAttribute("teachers",teachers);
		return "index";
	}
}

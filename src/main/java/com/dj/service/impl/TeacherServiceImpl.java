package com.dj.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dj.dao.TeacherMapper;
import com.dj.entity.Teacher;
import com.dj.service.TeacherService;
@Service("teacherService")
public class TeacherServiceImpl implements TeacherService {
	@Autowired
	private TeacherMapper teacherMapper;

	
	public List<Teacher> findTeachers() {
		// TODO Auto-generated method stub
		return teacherMapper.findTeachers();
	}
	
}

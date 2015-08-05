package com.excilys.aflak.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.excilys.aflak.core.Student;
import com.excilys.aflak.persistence.impl.StudentDAO;

@Service
@Transactional(readOnly = true)
public class StudentService {

	@Autowired
	private StudentDAO studentDao;

	public List<Student> list() {
		return studentDao.list();
	}

	@Transactional(readOnly = false)
	public void create(Student student) {
		studentDao.create(student);
	}
}

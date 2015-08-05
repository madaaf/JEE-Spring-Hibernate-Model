package com.excilys.aflak.persistence.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.excilys.aflak.core.QStudent;
import com.excilys.aflak.core.Student;
import com.excilys.aflak.persistence.IStudentDAO;
import com.mysema.query.jpa.JPQLQuery;
import com.mysema.query.jpa.hibernate.HibernateQuery;

@Repository
public class StudentDAO implements IStudentDAO {

	@Autowired
	SessionFactory sessionFactory;

	public List<Student> list() {
		QStudent qStudent = QStudent.student;
		JPQLQuery query = new HibernateQuery(sessionFactory.getCurrentSession());
		return query.from(qStudent).list(qStudent);
	}

	@Override
	public void create(Student student) {
		sessionFactory.getCurrentSession().save(student);
	}
}

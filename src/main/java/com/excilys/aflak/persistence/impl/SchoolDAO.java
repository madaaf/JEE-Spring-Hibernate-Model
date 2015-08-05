package com.excilys.aflak.persistence.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.excilys.aflak.core.QSchool;
import com.excilys.aflak.core.School;
import com.excilys.aflak.persistence.ISchoolDAO;
import com.mysema.query.jpa.JPQLQuery;
import com.mysema.query.jpa.hibernate.HibernateQuery;

@Repository
public class SchoolDAO implements ISchoolDAO {

	@Autowired
	SessionFactory sessionFactory;

	@Override
	public List<School> list() {
		QSchool qSchool = QSchool.school;
		JPQLQuery query = new HibernateQuery(sessionFactory.getCurrentSession());
		return query.from(qSchool).list(qSchool);
	}

	@Override
	public void create(School school) {
		sessionFactory.getCurrentSession().save(school);
	}

}

package com.excilys.aflak.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.excilys.aflak.core.School;
import com.excilys.aflak.persistence.impl.SchoolDAO;

@Service
@Transactional(readOnly = true)
public class SchoolService {

	@Autowired
	private SchoolDAO schoolDao;

	public List<School> list() {
		return schoolDao.list();
	}

	@Transactional(readOnly = false)
	public void create(School school) {
		schoolDao.create(school);
	}

}

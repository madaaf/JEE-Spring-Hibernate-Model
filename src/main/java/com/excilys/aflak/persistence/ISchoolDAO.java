package com.excilys.aflak.persistence;

import java.util.List;

import com.excilys.aflak.core.School;

public interface ISchoolDAO extends ICrudDAO<School> {

	public List<School> list();
}

package com.excilys.aflak.core;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Student")
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Long id;
	@Column(name = "name")
	private String name;

	//
	// @ManyToOne(fetch = FetchType.EAGER, optional = true)
	// @JoinColumn(name = "school_id", referencedColumnName = "id")
	// private School school;

	public Student() {
	}

	public Student(Long id, String name, School school) {
		super();
		this.id = id;
		this.name = name;
		// this.school = school;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}

	// public School getSchool() {
	// return school;
	// }
	//
	// public void setSchool(School school) {
	// this.school = school;
	// }

}

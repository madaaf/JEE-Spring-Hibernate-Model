package com.excilys.aflak.webservice;

import java.util.List;

import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.excilys.aflak.core.Student;
import com.excilys.aflak.service.StudentService;

@RestController
@RequestMapping("/api")
public class RestService {

	@Autowired
	private StudentService studentService;

	@Produces({ MediaType.APPLICATION_JSON })
	@RequestMapping(value = "/students", method = RequestMethod.GET)
	public List<Student> list() {
		return studentService.list();
	}

	@Produces({ MediaType.APPLICATION_JSON })
	@RequestMapping(value = "/test", method = RequestMethod.GET)
	public String test() {
		return "ook test";
	}

	@Produces({ MediaType.APPLICATION_JSON })
	@RequestMapping(value = "/100/100", method = RequestMethod.GET)
	public String image1() {
		return "images/flagEN.png";
	}

	@Produces({ MediaType.APPLICATION_JSON })
	@RequestMapping(value = "/50/50", method = RequestMethod.GET)
	public String image2() {
		return "images/flagFr.png";
	}

}

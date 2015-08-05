package com.excilys.aflak.webapp;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.excilys.aflak.client.ClientStudentService;
import com.excilys.aflak.core.School;
import com.excilys.aflak.core.Student;
import com.excilys.aflak.service.StudentService;

@Controller
@Transactional
@RequestMapping({ "/file", "/" })
public class PageController {
	private static Logger logger = LoggerFactory
			.getLogger(PageController.class);

	@Autowired
	private StudentService studentService;

	@Autowired
	private ClientStudentService clientStudentService;

	@RequestMapping(method = RequestMethod.GET)
	public String get(ModelMap model) {

		School school = new School(1L, "victor duruy");
		Student student1 = new Student(1L, "mada", school);
		studentService.create(student1);
		Student student2 = new Student(2L, "dania", school);
		studentService.create(student2);
		Student student3 = new Student(3L, "omar", school);
		studentService.create(student3);
		List<Student> students = studentService.list();

		for (Student student : students) {
			System.out.println(student.toString());
		}
		model.addAttribute("students", students.toArray());

		List<Student> clientStudents = new ArrayList<Student>();
		clientStudents = clientStudentService.list();
		model.addAttribute("clientStudents", clientStudents);

		String image1 = clientStudentService.iamge1();
		String image2 = clientStudentService.iamge2();
		model.addAttribute("image1", image1);
		model.addAttribute("image2", image2);

		return "file";
	}
}

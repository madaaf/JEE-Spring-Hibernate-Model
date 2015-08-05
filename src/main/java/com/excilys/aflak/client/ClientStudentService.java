package com.excilys.aflak.client;

import java.util.List;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.Response;

import org.glassfish.jersey.jackson.JacksonFeature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.excilys.aflak.core.Student;

@Component
public class ClientStudentService {

	private static final String ROOT = "http://localhost:8080/testExam/api";
	private static final String URI = "/students";
	private static final String image1 = "/50/50";
	private static final String image2 = "/100/100";

	Logger logger = LoggerFactory.getLogger(ClientStudentService.class);

	public List<Student> list() {
		Client client = ClientBuilder.newClient()
				.register(JacksonFeature.class);
		WebTarget webTarget = client.target(ROOT + URI);
		Invocation.Builder invocationBuilder = webTarget.request();
		Response response = invocationBuilder.get();
		List<Student> students = response
				.readEntity(new GenericType<List<Student>>() {
				});
		for (Student student : students) {
			System.out.println(student.toString());
		}

		return students;
	}

	public String iamge1() {
		Client client = ClientBuilder.newClient()
				.register(JacksonFeature.class);
		WebTarget webTarget = client.target(ROOT + image1);
		Invocation.Builder invocationBuilder = webTarget.request();
		Response response = invocationBuilder.get();
		String ok = response.readEntity(String.class);
		return ok;
	}

	public String iamge2() {
		Client client = ClientBuilder.newClient()
				.register(JacksonFeature.class);
		WebTarget webTarget = client.target(ROOT + image2);
		Invocation.Builder invocationBuilder = webTarget.request();
		Response response = invocationBuilder.get();
		String ok = response.readEntity(String.class);
		return ok;
	}
}

package com.umsl.course_service;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest
@ActiveProfiles("test") // This tells Spring Boot to load application-test.properties
class CourseServiceApplicationTests {

	@Test
	void contextLoads() {
	}
}
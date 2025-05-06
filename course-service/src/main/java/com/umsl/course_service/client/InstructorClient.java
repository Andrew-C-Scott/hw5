package com.umsl.course_service.client;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import com.umsl.course_service.dto.InstructorDto;
@FeignClient(name = "instructor-service")
public interface InstructorClient {
    @GetMapping("/instructor/{name}")
    InstructorDto getByName(@PathVariable("name") String name);
}

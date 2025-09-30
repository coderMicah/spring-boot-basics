package com.mika.demo.course;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {

    @RequestMapping("/courses")
    public List<Course> getAll() {
        return Arrays.asList(
                new Course(1, "Learn AWS", "in28minutes"),
                new Course(2, "Learn JS", "Brad Traversy"),
                new Course(3, "Learn Laravel", "Adam Wathan"),
                new Course(4, "Learn Typescript", "Matt Poccok"));
    }

}

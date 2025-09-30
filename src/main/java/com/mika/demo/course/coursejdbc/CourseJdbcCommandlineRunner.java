package com.mika.demo.course.coursejdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.mika.demo.course.Course;

@Component
public class CourseJdbcCommandlineRunner implements CommandLineRunner {

    @Autowired
    private CourseJDBCRepository repository;

    @Override
    public void run(String... args) throws Exception {
        repository.insert(new Course(1, "Learn AWS", "Ranga Karachi"));
        repository.insert(new Course(2, "Learn Spring Boot", "Mika Ishengoma"));
        repository.insert(new Course(3, "Learn Java", "James Gosling"));

        repository.deleteById(2);
        System.out.println(repository.getById(1));
        System.out.println(repository.getById(3));
    }

}

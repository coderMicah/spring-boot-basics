package com.mika.demo.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import com.mika.demo.course.coursespringjpa.CourseSpringJpaRepository;

@Component
public class CourseCommandlineRunner implements CommandLineRunner {

    // @Autowired
    // private CourseJDBCRepository repository;

    // @Autowired
    // private CourseJpaRepository repository;

    @Autowired
    private CourseSpringJpaRepository repository;

    @Override
    public void run(String... args) throws Exception {
        repository.save(new Course(1L, "Learn AWS", "John Doe"));
        repository.save(new Course(2L, "Learn Spring Boot", "Jane Doe"));
        repository.save(new Course(3L, "Learn Java", "James Gosling"));

        // repository.deleteById(2L);
        System.out.println(repository.findById(1L));
        System.out.println(repository.findById(3L));

        System.out.println(repository.findByAuthor("Jane Doe"));
        System.out.println(repository.findByName("Learn Java"));
    }

}

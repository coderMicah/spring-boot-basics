package com.mika.demo.course.coursespringjpa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mika.demo.course.Course;

public interface CourseSpringJpaRepository extends JpaRepository<Course, Long> {
    List<Course> findByAuthor(String author);

    List<Course> findByName(String name);
}

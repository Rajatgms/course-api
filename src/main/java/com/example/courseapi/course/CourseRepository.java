package com.example.courseapi.course;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CourseRepository extends CrudRepository<Course, String> {

    @Query("SELECT c FROM Course c WHERE c.topic.id =:id")
    public List<Course> findByTopicId(@Param("id") String id);
}

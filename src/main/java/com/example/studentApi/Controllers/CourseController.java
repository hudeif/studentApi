package com.example.studentApi.Controllers;

import com.example.studentApi.Interfaces.ICourse;
import com.example.studentApi.Models.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("course")
@CrossOrigin(maxAge = 3600)
public class CourseController {
    @Autowired
    ICourse iCourse;
    @GetMapping("/list")
    public List getList(){
        return iCourse.findAll();
    }

    @GetMapping("/{id}")
    public Course getCourse(@PathVariable("id") Integer id){
        return iCourse.findById(id).get();
    }

    @PostMapping("/add")
    public void add(@RequestBody Course course){
        iCourse.save(course);
    }

    @PutMapping("/update")
    public void update(@RequestBody Course course){
        iCourse.save(course);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable("id") Integer id){
        iCourse.deleteById(id);
    }
}

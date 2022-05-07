package com.example.studentApi.Controllers;

import com.example.studentApi.Interfaces.ICourse;
import com.example.studentApi.Interfaces.IStudent;
import com.example.studentApi.Models.Course;
import com.example.studentApi.Models.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("student")
@CrossOrigin(maxAge = 3600)
public class StudentController {
    @Autowired
    IStudent iStudent;
    @GetMapping("/list")
    public List getList(){
        return iStudent.findAll();
    }

    @GetMapping("/{id}")
    public Student getStudent(@PathVariable("id") Integer id){
        return iStudent.findById(id).get();
    }

    @PostMapping("/add")
    public void add(@RequestBody Student student){
        iStudent.save(student);
    }

    @PutMapping("/update")
    public void update(@RequestBody Student student){
        iStudent.save(student);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable("id") Integer id){
        iStudent.deleteById(id);
    }
}

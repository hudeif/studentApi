package com.example.studentApi.Controllers;

import com.example.studentApi.Interfaces.ICourse;
import com.example.studentApi.Interfaces.IEnrollment;
import com.example.studentApi.Models.Course;
import com.example.studentApi.Models.Enrollment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("enrollment")
@CrossOrigin(maxAge = 3600)
public class EnrollmentController {
    @Autowired
    IEnrollment iEnrollment;

    @GetMapping("/list")
    public List<Enrollment> getList(){
        return iEnrollment.findAll();
    }

    @GetMapping("/{id}")
    public Enrollment getDetails(@PathVariable("id") Integer id){
        return iEnrollment.findById(id).get();
    }

    @PostMapping("/add")
    public void add(@RequestBody Enrollment enrollment){
        iEnrollment.save(enrollment);
    }

    @PutMapping("/update")
    public void update(@RequestBody Enrollment enrollment){
        iEnrollment.save(enrollment);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable("id") Integer id){
        iEnrollment.deleteById(id);
    }
}

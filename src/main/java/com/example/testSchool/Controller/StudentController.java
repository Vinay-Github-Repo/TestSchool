package com.example.testSchool.Controller;

import com.example.testSchool.Model.Student;
import com.example.testSchool.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    StudentService studentService;

    @PostMapping("/create-student")
    public Student createStudent(@RequestBody Student student){
        return studentService.createStudent(student);
    }

    @GetMapping("/get-all-student")
    public List<Student> getAllStudents(){
        return studentService.getAllStudents();
    }

    @GetMapping("/get-student-by-id/{id}")
    public Student getStudentById(@PathVariable int id){
        return studentService.getStudentById(id);
    }

    @DeleteMapping("/delete-by-id/{id}")
    public String deleteById(@PathVariable int id){
        return studentService.deleteById(id);
    }

    @PutMapping("update-by-id/{id}")
    public Student updateById(@PathVariable int id, @RequestBody Student student){
        return studentService.updateById(id, student);
    }

}

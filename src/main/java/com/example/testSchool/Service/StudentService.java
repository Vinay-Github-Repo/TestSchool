package com.example.testSchool.Service;

import com.example.testSchool.Model.Student;
import com.example.testSchool.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;//ORM Object Retional Mapping


    public Student createStudent(Student student) {
        return studentRepository.save(student);
    }

    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    public Student getStudentById(int id) {
        return studentRepository.findById(id).get();
    }

    public String deleteById(int id) {
        studentRepository.deleteById(id);
        return "Student has been deleted";
    }

    public Student updateById(int id, Student student) {
        Student s = studentRepository.findById(id).get();
        s.setAge(student.getAge());
        s.setName(student.getName());
        s.setGrade(student.getGrade());
        s.setContact_info(student.getContact_info());
        return studentRepository.save(s);
    }
}

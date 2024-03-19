package com.nighthawk.spring_portfolio.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import com.nighthawk.spring_portfolio.mvc.linkr.InternshipRepository;
import com.nighthawk.spring_portfolio.mvc.linkr.Student;
import com.nighthawk.spring_portfolio.mvc.linkr.StudentRepository;

import org.springframework.ui.Model;

import java.util.List;
import java.util.Optional;

@Controller

public class UserController {
    @Autowired
    StudentRepository employeeRepository;

    @GetMapping("/api/users")
    public String UsersAPI(Model model){
        List<Student> allStudent = StudentRepository.findAll();
        model.addAttribute("employees", allStudent);
        
        return "linkradmin";
    }
}

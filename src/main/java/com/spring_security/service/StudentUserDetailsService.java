package com.spring_security.service;

import com.spring_security.entity.Student;
import com.spring_security.repo.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.util.Optional;



public class StudentUserDetailsService implements UserDetailsService {

    @Autowired
    StudentRepository studentRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
       Optional<Student> student = studentRepository.findByUsername(username);
       Student student1 = student.orElseThrow(()-> new UsernameNotFoundException("User Name not Found"));

        return new LoginStudent(student1) ;
    }
}

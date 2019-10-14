package edu.mum.cs.cs425.lab8versiontwo.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import edu.mum.cs.cs425.lab8versiontwo.model.Student;
import edu.mum.cs.cs425.lab8versiontwo.service.StudentService;

@Controller

public class StudentController {
	
	StudentService studentService;
	
	@Autowired
	public StudentController(StudentService studentService) {
		super();
		this.studentService = studentService;
	}


	@GetMapping(value = {"/eRegistrar/student/list"})  // the certain urls are mapped to the next method.
    public String listStudents(Model model) {
		List<Student> students = studentService.getAllStudents();
		model.addAttribute("students", students);
		return "student/list";
//        ModelAndView modelAndView = new ModelAndView();
//        modelAndView.addObject("students", studentService.getAllStudents());
//        modelAndView.setViewName("student/list");
//        return modelAndView;
    }
	
	@GetMapping(value = {"/eRegistrar/student/new"})
    public String displayNewStudentForm(Model model) {
        model.addAttribute("student", new Student());
        return "student/new";
        
    }
	
	@PostMapping(value = {"/eRegistrar/student/new"})
    public String addNewStudent( @ModelAttribute("student") Student student)
                                      
	{
//        if (bindingResult.hasErrors()) {
//            model.addAttribute("errors", bindingResult.getAllErrors());
//            return "student/new";
//        }

        studentService.addNewStudent(student);
        return "redirect:/eRegistrar/student/list";
    }
//	
//	
//	 @GetMapping(value = {"/eRegistrar/student/edit/{studentId}"})
//	    public String editStudent(@PathVariable Long studentId, Model model) {
//	        Student student= studentService.findById(studentId);
//	        if (student != null) {
//	            model.addAttribute("student", student);
//	            return "student/edit";
//	        }
//	        return "student/list";
//	    }
//	 
//	 @PostMapping(value = {"/eRegistrar/student/edit"})
//	    public String updateStudent(@Valid @ModelAttribute("student") Student student,
//	                                BindingResult bindingResult, Model model) {
//	        if (bindingResult.hasErrors()) {
//	            model.addAttribute("errors", bindingResult.getAllErrors());
//	            return "student/edit";
//	        }
//	        student = studentService.update(student);
//	        return "redirect:/eRegistrar/student/list";
//	    }
//	 
//	 @GetMapping(value = {"/eRegistrar/student/delete/{studentId}"})
//	    public String deleteStudent(@PathVariable Long studentId, Model model) {
//		    studentService.deletStudentById(studentId);
//	        return "redirect:/elibrary/book/list";
//	    }

	

}

package net.madhu.springboot.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import ch.qos.logback.core.net.SyslogOutputStream;
import net.madhu.springboot.bean.Student;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("students")
public class StudentController {

    // http://localhost:8080/student
    @GetMapping("student")
    public ResponseEntity<Student> getStudent(){
        Student student = new Student(
          1,
          "Madhu",
          "Manepalli"
        );
        return ResponseEntity.ok()
        		.header("custom-header","Madhu")
        		.body(student);
        		
    }

    // http://localhost:8080/students
    @GetMapping
    public ResponseEntity< List<Student>> getStudents(){
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Madhu", "Manepalli"));
        students.add(new Student(2, "DHanu", "Andey"));
        students.add(new Student(3, "Eswar", "pallapothu"));
        students.add(new Student(4, "Nutan", "Mallepudi"));
        return ResponseEntity.ok(students);
    }

    // Spring BOOT REST API with Path Variable
    // {id} - URI template variable
    // http://localhost:8080/students/1/Madhu/Manepalli
    @GetMapping("{id}/{first-name}/{last-name}")
    public ResponseEntity<Student> studentPathVariable(@PathVariable("id") int studentId,
                                       @PathVariable("first-name") String firstName,
                                       @PathVariable("last-name") String lastName){
        Student student = new Student(studentId, firstName, lastName);
        return ResponseEntity.ok(student);
    }

    // Spring boot REST API with Request Param
    //  http://localhost:8080/students/query?id=1&firstName=Mahdu&lastName=Manepalli
    @GetMapping("query")
    public ResponseEntity<Student> studentRequestVariable(@RequestParam int id,
                                          @RequestParam String firstName,
                                          @RequestParam String lastName){
        Student student = new Student(id, firstName, lastName);
        return ResponseEntity.ok(student);
    }
    // Spring boot REST API that handles HTTP POST REQUEST
    // PostMapping and RequestBody
    //http://localhost:8080/students/create
    
    @PostMapping("create")
    //@ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Student> createstudent(@RequestBody Student student) {
    	System.out.println(student.getId());
    	System.out.println(student.getFirstName());
    	System.out.println(student.getLastName());
    	
    	return new ResponseEntity<>(student,HttpStatus.CREATED);
    	
    }
    
    // Spring boot REST API that handles HTTP PUT REQUEST - update
   
    @PutMapping("{id}/update")
    public ResponseEntity<Student> updateStudent(@RequestBody Student student,@PathVariable("id")int studentId) {
    	System.out.println(student.getFirstName());
    	System.out.println(student.getLastName());
    	return ResponseEntity.ok(student);
    }
    
    // Spring boot REST API that handles HTTP DELETE REQUEST - delete
    
    @DeleteMapping("{id}/delete")
    public ResponseEntity<String> deleteStudent(@PathVariable("id") int studentId) {
    	System.out.println(studentId);
    	return ResponseEntity.ok("student deleted successfully") ;
    }
       
    
}

package edu.mum.cs.cs425.lab7;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import edu.mum.cs.cs425.lab7.domainModel.Classroom;
import edu.mum.cs.cs425.lab7.domainModel.Course;
import edu.mum.cs.cs425.lab7.domainModel.Student;
import edu.mum.cs.cs425.lab7.domainModel.Transcript;
import edu.mum.cs.cs425.lab7.repository.ClassroomRepository;
import edu.mum.cs.cs425.lab7.repository.StudentRepository;
import edu.mum.cs.cs425.lab7.repository.TranscriptRepository;

@SpringBootApplication
public class Lab7Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Lab7Application.class, args);
	}
	
		@Autowired	
         StudentRepository studentRepository;
//		@Autowired
//		 ClassroomRepository classroomRepository;
//		@Autowired
//		 TranscriptRepository transcriptRepository;
//		
		List<Student> studentList = new ArrayList<>();
		
		
		
		void saveStudent() {
			
			Student s1 = new Student("000-61-0001", "Salina", "Afework", "Aklilu", 3.8f, LocalDate.of(2019, 2, 9));
			Student s2 = new Student("000-62-0002", "Bisrat", "Agg", "Akli", 3.4f, LocalDate.of(1989, 2, 5));
			studentList.add(s1);
			studentList.add(s2);
			
			Transcript tr1 = new Transcript("Masters");
			Transcript tr2 = new Transcript("Masters");
			
			List<Course> cList = Arrays.asList(new Course( "SWE"), new Course("MPP"));
			
			
			s1.setcList(cList);
			s2.setcList(cList);

   		    s1.setTranscript(tr1);
			s2.setTranscript(tr2);
			
			Classroom cl1 = new Classroom("Mc-512", 113);
			cl1.setsList(studentList);
			
			studentRepository.save(s1);
			studentRepository.save(s2);
			
		}
		
		@Override
		public void run(String... args) throws Exception {
			
			saveStudent();
		}
		
}

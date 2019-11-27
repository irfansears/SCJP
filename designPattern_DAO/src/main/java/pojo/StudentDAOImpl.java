package pojo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StudentDAOImpl implements StudentDAO{

//	List<Student> students;
	
//	direct adding 1 where you cannpt modify it
	List<Student> students=Arrays.asList( new Student(1,"N1","C1"),new Student(2,"N2","C3"));
//	students.add   // cannot add
	
	
	public StudentDAOImpl() {
		students = new ArrayList<Student>();
		Student student1= new Student(1,"Robert","Nashivlle");
		students.add(student1);
		
//		direct adding
		students.add(new Student(2,"Irfan","Pune"));
	}

	public List<Student> getAllStudents() {
		return students;
	}

	public Student getStudent(int rollno) {
		return students.get(rollno);
	}


}

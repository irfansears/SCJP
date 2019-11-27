package pojo;

import java.util.ArrayList;
import java.util.List;

public class StudentDAOImpl implements StudentDAO{

	List<Student> students;
	public StudentDAOImpl() {
		students = new ArrayList<Student>();
		Student student1= new Student(1,"Robert","Nashivlle");
		students.add(student1);
		students.add(new Student(2,"Irfan","Pune"));
	}

	public List<Student> getAllStudents() {
		return students;
	}

	public Student getStudent(int rollno) {
		return students.get(rollno);
	}


}

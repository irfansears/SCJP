package pojo;

import java.util.List;

public interface StudentDAO {

	public List<Student> getAllStudents();
	public Student getStudent(int rollno);
	
}

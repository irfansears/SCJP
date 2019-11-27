package pojo;

public class StudentDemo {

	public static void main(String[] args) {

		StudentDAO studentDao = new StudentDAOImpl();
		
		for(Student student:studentDao.getAllStudents()){
			
			System.out.println(student.getRollno()+" "+student.getName()+" "+student.getCity());
		}
		
		
//		System.out.println(studentDao.getStudent(0).rollno);
	}

}

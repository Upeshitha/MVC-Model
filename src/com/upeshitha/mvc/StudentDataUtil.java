package com.upeshitha.mvc;

import java.util.ArrayList;
import java.util.List;

/**
 * This class describes the students details
 * @version   20 May 2021
 * @author    Eranda Upeshitha
 */
public class StudentDataUtil {
	
	public static List<Student> getStudentsDeatailsList() {
		
		List<Student> studentsList = new ArrayList<>();
		studentsList.add(new Student("Eranda", "Upeshitha", "upeshitha@email.com"));
		studentsList.add(new Student("Kasun", "Kumara", "kasun@email.com"));
		studentsList.add(new Student("Shamal", "silwa", "shamal@email.com"));
		studentsList.add(new Student("Kavidu", "Sirimal", "kavidu@email.com"));
		
		return studentsList;
	}

}

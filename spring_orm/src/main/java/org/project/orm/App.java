package org.project.orm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

import org.project.orm.dao.StudentDao;
import org.project.orm.entities.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
		StudentDao studentDao=context.getBean("studentDao",StudentDao.class);
		boolean go=true;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		while(go) {
			System.out.println("****************************************************************");
			System.out.println("Press 1 for add new Student");
			System.out.println("Press 2 for for display all Students");
			System.out.println("Press 3 for get detail of single Student");
			System.out.println("Press 4 for delete Student");
			System.out.println("Press 5 for update Student");
			System.out.println("Press 6 for exit");
			System.out.println("****************************************************************");
			try {
				int input=Integer.parseInt(br.readLine());
				switch (input) {
				case 1:
					//add student
					System.out.println("-------------------------------------");
					System.out.println("Enter User ID: ");
					int uid=Integer.parseInt(br.readLine());
					System.out.println("Enter user name: ");
					String uName=br.readLine();
					System.out.println("Enter user city: ");
					String uCity=br.readLine();
					Student s=new Student(uid,uName,uCity);
					int r=studentDao.insert(s);
					System.out.println("student added with ID: "+r);
					System.out.println("-------------------------------------");
					break;
				case 2:
					//display all student
					System.out.println("-------------------------------------");
					List<Student> students=studentDao.getAllStudent();
					for (Student student : students) {
						System.out.println("Name: "+student.getStudentName());
						System.out.println("ID: "+student.getStudentId());
						System.out.println("City: "+student.getStudentCity());
						System.out.println("-------------------------------------");
					}
					break;
				case 3:
					//get single student data
					System.out.println("-------------------------------------");
					System.out.println("Enter User ID: ");
					int userId=Integer.parseInt(br.readLine());
					Student stu=studentDao.getStudent(userId);
					if(stu==null) {
						System.out.println("No Student with ID: "+userId+" Exists!");
					}
					else {
						System.out.println("Name: "+stu.getStudentName());
						System.out.println("ID: "+stu.getStudentId());
						System.out.println("City: "+stu.getStudentCity());
					}
					System.out.println("-------------------------------------");
					break;
				case 4:
					//delete student
					System.out.println("-------------------------------------");
					System.out.println("Enter User ID: ");
					userId=Integer.parseInt(br.readLine());
					s=studentDao.getStudent(userId);
					if(s==null) {
						System.out.println("No Student with ID: "+userId+" Exists!");
					}
					else {
						studentDao.deleteStudent(userId);
						System.out.println("Student with ID: "+userId+" Deleted Successfully!");
					}				
					System.out.println("-------------------------------------");
					break;
				case 5:
					//update the student
					System.out.println("-------------------------------------");
					System.out.println("Enter User ID: ");
					uid=Integer.parseInt(br.readLine());
					s=studentDao.getStudent(uid);
					if(s==null) {
						System.out.println("No Student with ID: "+uid+" Exists!");
					}
					else {
						System.out.println("Set new user name: ");
						uName=br.readLine();
						System.out.println("Set new user city: ");
						uCity=br.readLine();
						s=new Student(uid,uName,uCity);
						studentDao.updateStudent(s);
						System.out.println("Student with ID: "+uid+" Updated Successfully!");
					}
					System.out.println("-------------------------------------");
					break;
				case 6:
					//exit
					go=false;
					break; 
				default:
					System.out.println("Invalid Key Pressed!!!");
					System.out.println("Please Try Again!");
					
				}
			
			}catch (Exception e) {
				e.getMessage();
			}
		}
		System.out.println("Application Terminated Successfully!!!");
		System.out.println("Thank U for using My Application");
	}
}

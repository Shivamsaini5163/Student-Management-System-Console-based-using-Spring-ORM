package org.project.orm.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.project.orm.entities.Student;
import org.springframework.orm.hibernate5.HibernateTemplate;

public class StudentDao {
	
	private HibernateTemplate hibernateTemplate;
	
	@Transactional
	//save student
	public int insert(Student student) {
		//insert
		Integer i=(Integer)this.hibernateTemplate.save(student);
		return i;
	}

	//get the single data(object)
	public Student getStudent(int studentId) {
		Student student=this.hibernateTemplate.get(Student.class,studentId);
		return student;
	}
	
	//get all student(all rows)
		public List<Student> getAllStudent() {
			List<Student> students=this.hibernateTemplate.loadAll(Student.class);
			return students;
	}
		
	//deleting the data
		@Transactional
		public void deleteStudent(int studentId) {
			Student student=this.hibernateTemplate.get(Student.class, studentId);
			this.hibernateTemplate.delete(student);
	}
	
	//update student
		@Transactional
	public void updateStudent(Student student) {
		this.hibernateTemplate.update(student);
	}
	
	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	
}

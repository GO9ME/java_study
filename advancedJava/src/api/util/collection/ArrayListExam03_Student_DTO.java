package api.util.collection;

import java.util.ArrayList;

public class ArrayListExam03_Student_DTO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student1 = new Student(1, "장동건", 100, 98, 88);
		Student student2 = new Student(2, "이민호", 89, 100, 100);
		Student student3 = new Student(3, "김범룡", 95, 89, 100);
		
		ArrayList<Student> list = new ArrayList<>();
		list.add(student1);
		list.add(student2);
		list.add(student3);
		for(Student s : list) {
			System.out.println(s);
		}
		

	}

}

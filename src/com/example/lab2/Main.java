package com.example.lab2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String args[]) {
		
		List<Student> al = new ArrayList<Student>();//student type만 들어갈 수 있다.
		
		System.out.println("Student List (ordered by name)");
		Student s1 = new Student(101,"Kim",23);
		al.add(s1);
		Student s2 = new Student(102,"Choi",21);
		al.add(s2);
		al.add(new Student(103,"Park",25));
		al.add(new Student(104,"Park1",26));
		al.add(new Student(105,"Park2",27));
		al.add(new Student(106,"Park3",28));
		al.add(new Student(107,"Park4",25));
		al.add(new Student(108,"Park5",23));
		al.add(new Student(109,"Park6",21));
		al.add(new Student(110,"Park7",24));
		
		
		Collections.sort(al);
		
		for(Student s : al) {
			System.out.println(s.toString());
		}
		
		System.out.println("Student List (reverse ordered by name");
		
		Collections.sort(al,Collections.reverseOrder());
		
		for(int i=0; i<al.size(); i++) {
			System.out.println(al.get(i).toString());
		}
	}
}

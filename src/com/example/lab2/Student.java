package com.example.lab2;

	public class Student implements Comparable <Student> {
		int nol;
		String name;
		int age;

		public Student(int nol, String name, int age) {
			super();
			this.nol = nol;
			this.name = name;
			this.age = age;
		}

		public int getNol() {
			return nol;
		}

		public void setNol(int nol) {
			this.nol = nol;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}

		@Override
		public String toString() {
			return "Student [nol=" + nol + ", name=" + name + ", age=" + age + "]";
		}

		@Override
		public int compareTo(Student o) {
			// TODO Auto-generated method stub
			return name.compareTo(o.name);
		}
	}

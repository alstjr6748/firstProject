package com.yedam.object;

public class Student {

		private String studentId;
		private String studentName;
		private String sex;
		private int studentScore;
		
		void setStudentId(String stuId) {
			this.studentId = stuId;
		}
		String getStudentId() {
			return studentId;
		}
		void setStudentName(String stuName) {
			this.studentName = stuName;
		}
		String getStudentName() {
			return studentName;
		}
		void setSex(String sex) {
			this.sex = sex;
		}
		String getSex() {
			return sex;
		}
		void setStudentScore(int stuScore) {
			this.studentScore = stuScore;
		}
		int getStudentScore() {
			return studentScore;
		}
}

package com.hspedu.extend_;

public class Student {
 public String name;
 public int age;
 private double score;
 public String setName(String name) {
	 return name;
 }
 public void setScore(double score) {
	 this.score=score;
 }
 public int setAge(int age) {
	 return age;
 }
 public void showInfo() {
	 System.out.println("学生名"+name+"年龄"+age+"成绩"+score);
 }
}

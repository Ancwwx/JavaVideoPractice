package com.hspedu.Object_;

public class ToString_ {
	public static void main(String[] args) {
		Monster monster=new Monster("小妖怪","巡山的",1000);
		System.out.println(monster.toString());
	}
}
class Monster{
	private String name ;
	private String job;
	private double sal;
	
	public Monster(String name,String job,double sal) {
		this.name=name;
		this.job=job;
		this.sal=sal;
		
	}

	@Override
	public String toString() {
		return "Monster [name=" + name + ", job=" + job + ", sal=" + sal + "]";
	}
	

}
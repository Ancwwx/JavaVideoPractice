package com.hspedu.encap;

public class Account {
	private String name;
	private double balance;
	private String passWord;
	public Account() {

	}

	public Account(String name, Double balance, String passWord) {

		this.setName(name);
		this.setBalance(balance);
		this.setPassWord(passWord);
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (name.length() >= 2 && name.length() <= 4) {
			this.name = name;
		} else {
			System.out.println("名字长度错误，应为（2-4）输出默认名字");
			this.name = "无名氏";
		}
	}

	public Double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		if (balance > 20) {
			this.balance = balance;
		} else {
			System.out.println("余额必须大于20,输出默认余额0");
			
		}
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		if (passWord.length() == 6) {
			this.passWord = passWord;
		} else {
			System.out.println("密码必须是六位数,输出默认密码000000");
			this.passWord="000000";
		}

	}

	public void info() {
		System.out.println("信息为 name=" + name + " balance=" + balance + " passWord=" + passWord);
	}
}

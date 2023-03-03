package com.hspedu.encap;

public class AccountTest {
	public static void main(String[] args) {
		Account account = new Account();
		account.setBalance(19.0);
		account.setName("jake");
		account.setPassWord("000001");
		account.info();
	}
}

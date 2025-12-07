package com.mayur.interfaces;

// Interface Variables (public static final)
interface AppCofig{
	int MAX_USERS = 100; // public final static by defualt 
}
public class Code03 {
	public static void main(String[] args) {
		System.out.println(AppCofig.MAX_USERS);
	}
}

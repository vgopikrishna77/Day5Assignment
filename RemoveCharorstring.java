package com.DiffStrings;
import java.util.*;
public class RemoveCharorstring {

	public static void main(String[] args) {
		Scanner c=new Scanner(System.in);
		String s,s2;
		s=c.nextLine();
		s2=c.nextLine();
		char ck=c.next().charAt(0);
		String cl=String.valueOf(ck);
		
		removecahr(s,cl);
		substring(s,s2);
		// TODO Auto-generated method stub

	}
	static void removecahr(String s,String cl) {
	
	
		String s1=s.replace(cl,"");
		System.out.println(s1);
	}
	static void substring(String s,String s2) {
		String s1=s.replace(s2,"");
		System.out.println(s1);
	}

}

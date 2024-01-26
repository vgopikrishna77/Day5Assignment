package com.DiffStrings;
import java.util.*;
public class Vowelcounting {

	public static void main(String[] args) {
		String s;
		Scanner c=new Scanner(System.in);
		s=c.nextLine();
		fun(s);
		// TODO Auto-generated method stub

	}
	static void fun(String s) {
		int len=s.length();
		int b[]=new int[len];
		char ch[]=new char[len];
		int visited=-1;
		int k;
		int i,j;
		for(i=0;i<len;i++) {
			ch[i]=s.charAt(i);}
		for(i=0;i<len;i++) {
			 if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u' || s.charAt(i)=='A' || s.charAt(i)=='E' || s.charAt(i)=='I' || s.charAt(i)=='O' || s.charAt(i)=='U' ) {
					
		k=1;
		for(j=i+1;j<len;j++) {
			if(ch[i]==ch[j]) {
				k++;
				b[j]=visited;
			
			}
			
		}
		if(b[i]!=visited) {
			b[i]=k;
		}
		}}
		for(i=0;i<b.length;i++) {
			if(b[i]!=0 && b[i]!=-1) {
				System.out.println(s.charAt(i)+" "+b[i]);
			}
		}
		
		
	}

}

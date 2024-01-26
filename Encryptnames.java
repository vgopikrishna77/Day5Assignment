package com.DiffStrings;
import java.util.*;
public class Encryptnames {

	public static void main(String[] args) {
		Scanner c=new Scanner(System.in);
		String s[]=new String[2];
		String k[]=new String[2];
		char  ch;
		String m,l = "",z="" ,X="",Y,v;
		for(int i=0;i<2;i++) {
			s[i]=c.nextLine();
			s[i]=s[i].substring(0, 1).toUpperCase()+s[i].substring(1);
			//s[i]=s[i].substring(0, 1).toUpperCase()+s[i].substring(1);
		}
		for(int i=0;i<2;i++) {
			m=s[i];
			//System.out.println(m.split(" ")[0]);
		l=m.split(" ")[0];
		
		
		for(int j=0;j<l.length();j++) {
		 
			ch=l.charAt(j);
			ch=(char) (ch+1);
			X=String.valueOf(ch);
			System.out.print(X);
			
		}
		System.out.println("");
		for(int j=0;j<l.length();j++) {
			 
			ch=l.charAt(j);
			ch=(char) (ch-1);
			
			z=String.valueOf(ch);
			System.out.print(z);
			
		}
		


		}
			}}

	



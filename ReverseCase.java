package com.DiffStrings;


import java.util.Scanner;

public class ReverseCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s;
		Scanner c=new Scanner(System.in);
		s=c.nextLine();
		fun(s);
		vowelsreverse(s);
		allreverse(s);
		extraWords(s);
		reverseWords(s);
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
	static void vowelsreverse(String s) {
		int len=s.length();
		char k;
		
		int i;
		String t=" ",l=" ",m=" ";
		
		for(i=len-1;i>=0;i--) {
		k=s.charAt(i);
			t=t+k;
			
		}
		for(i=0;i<len;i++) {
			 if(t.charAt(i)=='a' || t.charAt(i)=='e' || t.charAt(i)=='i' || t.charAt(i)=='o' || t.charAt(i)=='u'  ) {
			 
				System.out.println( k=t.charAt(i));
				 m=m+k;
				
			 
			 }
			 
			 else if( t.charAt(i)=='A' || t.charAt(i)=='E' || t.charAt(i)=='I' || t.charAt(i)=='O' || t.charAt(i)=='U' ) {
				 
					 k=t.charAt(i);
					 l=l+k;
					 
				 }
			 }
			 
						
		System.out.print(t+"\n");
		
		System.out.println(m.toUpperCase());
		System.out.println(l.toLowerCase());
	}
	static void allreverse(String s) {
		int len=s.length();
		char k;
		char c[]=new char[len];
		
		int i;
		String t=" ",l=" ",m;
		
		for(i=len-1;i>=0;i--) {
		k=s.charAt(i);
			t=t+k;
			
		}
		for(i=0;i<=len;i++) {
			 if(t.charAt(i)>='a'  && t.charAt(i)<='z' ) {
			 
				k=t.charAt(i);
				m=String.valueOf(k);
				l=l+m.toUpperCase();
				
				 
			 
			 }
			 
			 else if( t.charAt(i)>='A' && t.charAt(i)<='Z'  ) {
				 
					 k=t.charAt(i);
					 m=String.valueOf(k);
					
					 l=l+m.toLowerCase();
					 
				 }
			 }
			 
						
		
		System.out.println(l);
	}
	static void extraWords(String s) {
		int i;
		String k[]=s.split(" ");
		for(i=0;i<k.length;i++) {
			System.out.println(k[i]);
		}
	}
	static void reverseWords(String s) {
		int i,j,l;
		char o;
		String m,n=" ";
		String k[]=s.split(" ");
		
		for(i=0;i<k.length;i++) {
			m=k[i];
			
			l=m.length();
			for(j=l-1;j>=0;j--) {
				o=m.charAt(j);
				n=n+o;
			}
			n=n+" ";
		}
		
			System.out.println(n);
			
		
	}
		
	}



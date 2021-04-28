package com.mph.view;
import java.util.Scanner;

public class JavaStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*String s1 = new String("hello");
		String s2 = new String("hello");
		if(s1.equals(s2)) {
			System.out.println("two strings are equal");
		}
		else
		{
			System.out.println("two strings are equal");
		}
		String str = "john, jennie, jim";
		System.out.println("the given string is: "+str);
		int len = str.length();
		System.out.println("the length of the string is:"+len);
		System.out.println(str.charAt(0)+" "+str.charAt(len-1));
		if(str.contains("jim"))
		{
			System.out.println("stringis there");
		}
		else
		{
			System.out.println("string is not  there");
		}
		String s4 = str.replace('j','k');
		System.out.println(s4);
		String s5 = str.toUpperCase();
		System.out.println(s5);
		String s6 = str.toLowerCase();
		System.out.println(s6);
		
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("enter string 1");
		String str1 = sc.next();
		System.out.println("enter second string");
		String str2 = sc.next();
		System.out.println(str1);
		System.out.println(str1.length());
		
		System.out.println(str2);
		System.out.println(str1.concat(str2));
		System.out.println(str1.replace('r','n'));
		
		
		String[]  str = new String[5];
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter array of strings");
		for(int i=0;i<str.length;i++)
		{
			str[i]=sc.next();
		}
		System.out.println("the given strings are");
		for(int i=0;i<str.length;i++) {
			
		
		
		System.out.println(str[i]+" ");
		}
		String original;
		String rev="";
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string to be reversed");
		original = sc.next();
		int len = original.length();
		for(int i=len-1;i>=0;i--)
		{
			rev=rev+original.charAt(i);
		}
		System.out.println("original string is"+" "+original);
		System.out.println("reversed string is:"+" "+rev);
		
		
		String str = "hello-welcome-to-java-program";
		String a[] = str.split("-");
		for(int i=0; i<a.length; i++)
		{
			System.out.println(" "+a[i]);
		}*/
		StringBuffer sb = new StringBuffer("ramakrishna");
		//System.out.println(sb);
		//System.out.println(sb.append("rk"));\
		sb.append("rk");
		System.out.println(sb);
		sb.delete(8,10);
		System.out.println(sb);
		
		
		
		
		
		
		

}
}

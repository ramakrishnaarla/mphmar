package com.mph.view;

class Java11Eg {

	
	public static void main(String[] args) {
		String str = "Welcome to Java11";
		System.out.println(str);
		
		var str2=999;
		//str2 ="Hi"; //Compilation error
		System.out.println(str2);

		final var text="Rose";
		//text="Lilly";
		System.out.println(text);


		//var myvar =null; // Compilation error
		//var lamb  =() -> System.out.println("hi");  // Compilation error


		System.out.println("     ".isBlank());
		
		System.out.println("  Good Afternoon   ".strip());
		System.out.println("  Good Afternoon   ".stripTrailing());
		System.out.println("  Good Afternoon   ".stripLeading());
		System.out.println("Java".repeat(5));
		System.out.println("Hello\nJava\nWelcome\nGood".lines().count());

	}

}
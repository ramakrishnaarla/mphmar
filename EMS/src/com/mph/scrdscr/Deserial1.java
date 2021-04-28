package com.mph.scrdscr;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import com.mph.model.Employee;


public class Deserial1 {
	public static void main(String[] args) {
		Employee st = null;
	
			try (FileInputStream fis = new FileInputStream("rk.txt");
					ObjectInputStream ois = new ObjectInputStream(fis)) {
				st =(Employee)ois.readObject();
				fis.close();
				ois.close();
			} catch (ClassNotFoundException | IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(st.getEid());
		System.out.println(st.getEname());
		System.out.println(st.getSalary());
		
	}

}

package com.mph.controller;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

import com.mph.dao.EmployeeDao;
import com.mph.model.Employee;
import com.mph.model.Manager;
import com.mph.model.Salary;


public class EmployeeController implements EmployeeInterface {
	Employee emp;
	Salary sal;
	EmployeeDao empdao = new EmployeeDao();
	List<Employee> emplist = new ArrayList<Employee>();
	public List addEmployee()
	{
		emp = new Employee();
		Scanner  sc = new Scanner(System.in);
		System.out.println("Enter the Eid");
		int eno = sc.nextInt();
		emp.setEid(eno);
		System.out.println("Enter the Ename ");
		String enam = sc.next();
		emp.setEname(enam);
		
		sal= new Salary();
		
		System.out.println("Enter basic Salary");
		int basic = sc.nextInt();
		sal.setBasic(basic);
		System.out.println("Enter DA");
		int da = sc.nextInt();
		sal.setDa(da);
		System.out.println("Enter HRA");
		int hra = sc.nextInt();
		sal.setHra(hra);
		System.out.println("Enter PF");
		int pf= sc.nextInt();
		sal.setPf(pf);
		
		sal.setGross(basic, da, hra);
		sal.setNet(sal.getGross(),pf);
		emp.setSalary(sal);
		empdao.insertEmp(emp);
		System.out.println("Employee "  + eno + "Succesfully added");
		return emplist;
	}
		
		
		//emplist.add(emp);
		//System.out.println(emp.getEid() + " " + emp.getEname());	
		//System.out.println("Employee "  + eno + "Succesfully added");
		/*FileOutputStream fos =null ;
		ObjectOutputStream oos =null;
		try {
			fos= new FileOutputStream("rk.txt");
			oos = new ObjectOutputStream(fos);
			oos.writeObject(emplist);
			
			System.out.println("Data successfully Serialized...");
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		finally {
			try {
				fos.close();
				oos.close();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
			
		}
		return emplist;
		
	}*/
	
	public void viewEmployee(List elist)
	{
		/*Iterator i= elist.iterator();

		while(i.hasNext())
		{
			System.out.println(i.next());
		}*/
		
		empdao.viewEmp();
		
	}
	public void namestartswith(List emplist)
	{
		Predicate<Employee> p2 =emp2 ->(emp2.getEname().startsWith("A")||emp2.getEname().startsWith("a"));
		emplist.stream().filter(p2)
		.sorted(Comparator.comparing(Employee::getEname))
		.forEach(System.out::println);
	}
	
	public void sortByname(List emplist)
	{
		Collections.sort(emplist,Employee.nameComparator);
		/*Iterator i=emplist.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}*/
		emplist.forEach(lis ->System.out.println(lis));
		
	}

		
		
	

		

	
	public void viewEmployee()
	{
		System.out.println(emp);	
	}
	public void addManager()
	{
		Manager m = new Manager();
		Scanner  sc = new Scanner(System.in);
		System.out.println("Enter dept");
		String ma = sc.next();
		m.setDept(ma);
		System.out.println("Employee "  + ma + "Succesfully added");
		}
	public void viewManager()
	{
		char[] m = null;
		System.out.println(m);	
	}

	public void serializeData(List<Employee> elist) {
		FileOutputStream fos =null ;
		ObjectOutputStream oos =null;
		try {
			fos= new FileOutputStream("myfile.txt");
			oos = new ObjectOutputStream(fos);
			oos.writeObject(emp);
			
			System.out.println("Data successfully Serialized...");
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		finally {
			try {
				fos.close();
				oos.close();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
			
		}
		
	}
	public void deserializeData(List<Employee> elist) {
		
		try (FileInputStream fis = new FileInputStream("myfile.txt");
				ObjectInputStream ois = new ObjectInputStream(fis)) {
			emp =(Employee)ois.readObject();
			fis.close();
			ois.close();
		} catch (ClassNotFoundException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(emp.getEid());
		System.out.println(emp.getEname());
		System.out.println(emp.getSalary());
		
	}
	
	public void insertUsingProc()
	{
		Employee e = new Employee();
		@SuppressWarnings("resource")
		Scanner  sc = new Scanner(System.in);
		System.out.println("Enter the Eid");
		int eno = sc.nextInt();
		e.setEid(eno);
		System.out.println("Enter the Ename ");
		String enam = sc.next();
		e.setEname(enam);
		
		empdao.insertUsingProcedure(e);
	}


	@Override
	public void addManager1() {
		// TODO Auto-generated method stub
		
	}
	
	public void rsmd()
	{
		empdao.rsmd();
	}
	
	public void type_forward_only_rs() {
		empdao.type_forward_only_rs();
		
	}

	@Override
	public void type_scroll_insensitive_rs() {
		empdao.type_scroll_insensitive_rs();
		
	}

	@Override
	public void type_scroll_sensitive_rs_insert() {
		empdao.type_scroll_sensitive_rs_insert();
		
	}
	public void type_scroll_sensitive_rs_update() {
		empdao.type_scroll_sensitive_rs_update();
		
	}


	@Override
	public void batchUpdate() {
		// TODO Auto-generated method stub
		empdao.batchUpdate();
	}
	

}

	

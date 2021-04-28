package com.mph.view;

import java.util.List;
import java.util.Scanner;
import java.util.function.BiPredicate;

import com.mph.controller.EmployeeController;
import com.mph.controller.EmployeeInterface;
import com.mph.model.Employee;

public class MainClass  {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws InterruptedException {

		EmployeeInterface ec = new EmployeeController();
		List<Employee> elist =null;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		String input = null;
		System.out.println("Enter your username");
		String un=sc.next();
		System.out.println("Enter your password");
		String pw=sc.next();
		BiPredicate<String, String> pred = (us,ps)->un.equals("rk")&&pw.equals("rk");
	
		if(pred.test(un,pw))
		{
			System.out.println("the system is loading....");
			Thread.sleep(2000);
		do {
			System.out.println("Enter your Choice");
			System.out.println("1. Add Employee");
			System.out.println("2. View Employee");
			System.out.println("3. sort");
			System.out.println("4. AddManager");
			
			System.out.println("5. employee names start with A");
			System.out.println("6. data serializable");
			System.out.println("7. data deserializable");
			System.out.println("8. Procedure Insert");
			System.out.println("9. Get ResultSet MetaData Info ");
			System.out.println("10. RS Forward Only");
			System.out.println("11. RS scroll insensitive");
			System.out.println("12. RS scroll sensitive");
			System.out.println("13. RS scroll sensitive update");
			System.out.println("14. Batch update");
			//System.out.println("3.Add Manager");
			//System.out.println("4.View Manager");
			int choice = sc.nextInt();
			switch (choice) {
			case 1: {
				elist =ec.addEmployee();
				break;
			}

			case 2: {
				ec.viewEmployee(elist);
				break;
			}
			
			case 3: {
				ec.sortByname(elist);
				break;
			}
			/*case 4: {
				ec.addManager1();
	               break;
			}*/
			case 5: {
				ec.namestartswith(elist);
				break;
			}
			case 6:{
				ec.serializeData(elist);
				break;
				
			}
			case 7:{
				ec.deserializeData(elist);
				break;
			}
			case 8:{
				ec.insertUsingProc();
				break;
			}
			
			case 9:{
				
					ec.rsmd();
					break;
			}
			case 10:{
				
				ec.type_forward_only_rs();
				break;
		}
			case 11:{
				
				ec.type_scroll_insensitive_rs();
				break;
		}
			case 12:{
				
				ec.type_scroll_sensitive_rs_insert();
				break;
		}
               case 13:{
				
				ec.type_scroll_sensitive_rs_update();
				break;
		}
               case 14:{
   				
   				ec.batchUpdate();
   				break;
   		}
			default: {

			}

			}
			System.out.println("Do you want to continue ? Y or y for yes");
			input = sc.next();
		} while (input.equals("Y") || input.equals("y"));
		}
		else
		{
			System.out.println("User not found Exception");
		}
		System.out.println("System Exited..Thanks for using our system !!!");
		System.exit(0);
	}
}
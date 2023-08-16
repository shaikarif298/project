package system;

import java.util.Scanner;

	public class Main {
	    public static void main(String[] args) {
	        String name,course;
	        int id;
	        double fee_paid;
	        operations o=new operations();
	        System.out.println("Welcome to Student management application");
	
	        Scanner sc=new Scanner(System.in);
	        do{
	            System.out.println("1. Add Student\n" +
	                    "2. Show All Student\n" +
	                    "3. Show Student based on id \n" +
	                    "4. Update the Student\n" +
	                    "5. Delete the Student\n");
	
	            System.out.println("Enter Choice: ");
	            int ch=sc.nextInt();
	            switch (ch){
	                case 1:
	                    Student emp=new Student();
	                    System.out.println("Enter ID : ");
	                     id=sc.nextInt();
	                    System.out.println("Enter name ");
	                     name=sc.next();
	                    System.out.println("Enter course ");
	                    course=sc.next();
	                    System.out.println("Enter fee paid");
	                    fee_paid=sc.nextDouble();
	                    emp.set_id(id);
	                    emp.set_name(name);
	                    emp.set_course(course);
	                    emp.set_fee_paid(fee_paid);
	                    o.createStudent(emp);
	                    break;
	                case 2:
	                    o.showAllStudent();
	                    break;
	                case 3:
	                    System.out.println("Enter id to show the details ");
	                    int Stid=sc.nextInt();
	                    o.showStudentBasedOnID(Stid);
	                    break;
	                case 4:
	                    System.out.println("Enter id to update the details");
	                    int empid1=sc.nextInt();
	                    System.out.println("Enter the new name");
	                     name=sc.next();
	                    o.updateStudent(empid1,name);
	                    break;
	                case 5:
	                    System.out.println("Enter the id to delete");
	                    id=sc.nextInt();
	                    o.deleteStudent(id);
	                    break;
	
	                case 6:
	                    System.out.println("Thank you for using our Application !!!");
	                    System.exit(0);
	                default:
	                    System.out.println("Enter valid choice !");
	                    break;
	            }
	
	        }while (true);
	
	    }
	}

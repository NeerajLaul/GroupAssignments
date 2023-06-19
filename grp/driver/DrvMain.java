package com.grp.driver;

import java.util.Scanner;

import com.grp.depts.AdmDep;
import com.grp.depts.HrDep;
import com.grp.depts.SprDep;
import com.grp.depts.TchDep;


public class DrvMain extends SprDep{

	public static void main(String[] args) {
		
		AdmDep AdminDepartment=new AdmDep();
		HrDep HrDepartment=new HrDep();
		TchDep TechDepartment=new TchDep();
		
		//Optional Code For Selection of Department;
		Scanner sc=new Scanner(System.in);
		System.out.println("Please Enter Your Department");
		System.out.println("1. Admin Dept");
		System.out.println("2. Tech Dept");
		System.out.println("3. HR Dept");
		int choice=sc.nextInt();
		
		switch(choice) {
		case 1:
			System.out.println(AdminDepartment.departmentName);
			System.out.println("Today's Work is to " + AdminDepartment.getTodaysWork);
			System.out.println("Today's Work Deadline is to " + AdminDepartment.getWorkDeadline);
            System.out.println(isTodayAHoliday);
            break;
            
		case 2:
			System.out.println(HrDepartment.departmentName);
			System.out.println("Today's Work is to " + HrDepartment.getTodaysWork);
			System.out.println("Today's Work Deadline is to " + HrDepartment.getWorkDeadline);
			System.out.println("Today's Activity is " + HrDepartment.doActivity);
			System.out.println(isTodayAHoliday);
			break;
		
		case 3:
			System.out.println(TechDepartment.departmentName);
			System.out.println("Today's Work is to " + TechDepartment.getTodaysWork);
			System.out.println("Today's Work Deadline is to " + TechDepartment.getWorkDeadline);
			System.out.println("Tech Stack to be worked on is " + TechDepartment.techStackInfo);
			System.out.println(isTodayAHoliday);
			break;
		
		default:
			System.out.println("Please Enter A Valid Choice");
		}
		sc.close();
	}

	

}

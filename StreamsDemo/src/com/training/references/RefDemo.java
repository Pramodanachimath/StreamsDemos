package com.training.references;

import java.util.Arrays;

public class RefDemo {

	public static void main(String[] args) {

		IShow showref=()->"have a great day";
		System.out.println(showref.print());
		System.out.println();
		
		IEmpDetails empDetails=(amount)->System.out.println("Bonus Amount is "+(amount*2));
		empDetails.calBonus(1000);
		System.out.println();
		
		NameChecker nameChecker=(name)->{
		if(name.startsWith("J"))
		{
			return "Welcome "+name;
		}
		else
		{
			return "Sorry";
		}
			
		};
		System.out.println(nameChecker.checkName("Java"));
		System.out.println();
		
		IStudentDetails details=(m1,m2,m3)->(m1+m2+m3);
		
		System.out.println("sum is "+details.calcTotal(50, 85, 99));
		System.out.println();
		
		IShape shape=(double length)->(length*length);
		System.out.println("area of square is "+shape.areaOfSquare(10));
		System.out.println();
		
		ICourseDetails course=()->Arrays.asList("Java","JavaScript","Html","Css");
		System.out.println("Courses "+course.showCourses());
		System.out.println();
		
		IMetricsChange change=(grams)->grams/1000;
		System.out.println("Kg "+change.convertGramsToKg(500));
	}

}

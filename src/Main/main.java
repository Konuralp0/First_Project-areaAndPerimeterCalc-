package Main;

import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		   System.out.println("For triangle please press 1!");
		   System.out.println("For circle please press 2!");
		   System.out.println("For rectangle please press 3!");

		   int option= scan.nextInt();                      
		   switch(option){

		       case 1:
		    	   Scanner b = new Scanner(System.in);
		    	   System.out.println("For the perimeter please press P!");
		           System.out.println("For the area please press A!");
		           String option2= b.nextLine();
		           if(option2.equalsIgnoreCase("C")){
		        	   Scanner scan1 = new Scanner(System.in);
		        	   System.out.println("Please input the length of the 3 sides");
		               double side1= scan1.nextDouble();
		               double side2= scan1.nextDouble();
		               double side3= scan1.nextDouble();

		               double perimeter= side1+ side2+ side3;;

		               System.out.println("The perimeter of this triangle is: " + perimeter+ "cm");
		           }else{
		        	   Scanner scan1 = new Scanner(System.in);
		        	   System.out.println("Please input the base length and the height of the triangle");
		               double base= scan1.nextDouble();
		               double height= scan1.nextDouble();

		               double area= base*height*0.5;
		               System.out.println("The area of this triangle is: " + area+ "cm^2");
		           }
		           break;
		       case 2 :
		    	   Scanner c = new Scanner(System.in);
		    	   double pi = 3.14159;
		           System.out.println("For  Parameter please press P");
		           System.out.println("For the area please press A!");
		           String option3= c.nextLine();

		           if(option3.equalsIgnoreCase("P")){
		        	   
		        	   Scanner scan1 = new Scanner(System.in);
		        	   System.out.println("Please input the radius of the circle!");
		        	   double r = scan1.nextDouble();
		               double perimeter= 2*pi*r;
		               System.out.println("The perimeter of this circle is: " + perimeter+ "cm");
		           }

		           else{
		        	   Scanner scan1 = new Scanner(System.in);
		        	   System.out.println("Please input the radius of the circle!");
		               double r = scan1.nextDouble();
		               double area= r*r*pi;
		               System.out.println("The area of this circle is: "+area+"cm^2");
		           }
		           break;
		       case 3:
		    	   Scanner d = new Scanner(System.in);	
		    	   System.out.println("For  Parameter please press P!");
		            System.out.println("For the area please press A!");
		            String option4= d.nextLine();

		           if(option4.equalsIgnoreCase("P")){
		        	   Scanner scan1 = new Scanner(System.in);
		        	   System.out.println("Please input the 2 different side lenghts of the ractangle!");
		               double side1= scan1.nextDouble();
		               double side2= scan1.nextDouble();

		               double perimeter= (side1+side2)*2;
		               System.out.println("The perimeter of this rectangle is: "+perimeter+ "cm");
		           }
		           else{
		        	   Scanner scan1 = new Scanner(System.in);
		               System.out.println("Please input the 2 different side lenghts of the ractangle!");
		               double side1 = scan1.nextDouble();
		               double side2 = scan1.nextDouble();

		               double area= side1*side2;
		               System.out.println("The area of this rectangle is: " +area+ "cm^2");
		           }
		           break;
		       default:
		           System.out.println("Please input a valid number ");


		   }

		
	}

}

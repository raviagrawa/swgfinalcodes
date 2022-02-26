import java.util.*;
public class Swgassignmentcode1
{
	public static void main(String[] args) {
	
	 Scanner scan = new Scanner(System.in);
	 
	   Student p1 = new Student();
	   Student  p2= new Student();
	 
	    System.out.println("enter the name of 1st student :");
	     p1.name = scan.nextLine();
	    System.out.println("enter the roll number of 1st student :");
	     p1.roll_no = scan.next();
	    System.out.println("enter the marks of 1st student :");
	     p1.marks = scan.nextDouble();
	    System.out.println("enter the attandance of 1st student :");
	     p1.attandance = scan.nextInt();
	     
	     	System.out.println("enter the name of 2st student :");
	     p2.name = scan.nextLine();
	     
	    System.out.println("enter the roll number of 2st student :");
	     p2.roll_no = scan.next();
	    System.out.println("enter the marks of 2st student :");
	     p2.marks = scan.nextDouble();
	    System.out.println("enter the attandance of 2st student :");
	     p2.attandance = scan.nextInt();
	   if(p1.marks<0){
	       p1.marks = 0.0;
	   }
	   if(p1.attandance>=75){
	       
	       p1.marks= 1.1*(p1.marks);
	       if(p1.marks>100){
	           p1.marks=100;
	       }
	       System.out.println( "name :"+p1.name);
	       System.out.println( "marks="+p1.marks);
	   }
	   else{
	       System.out.println( "marks=  "+p1.marks);
	       System.out.println( "name :"+p1.name);
	   }
	   
	

	   if(p2.marks<0){
	       p2.marks = 0.0;
	   }
	   if(p2.attandance>=75){
	       
	       p2.marks= 1.1*(p1.marks);
	       if(p2.marks>100){
	           p2.marks=100;
	       }
	       System.out.println( "name :"+p2.name);
	       System.out.println( "marks="+p2.marks);
	   }
	   else{
	       System.out.println("marks="+p2.marks);
	       System.out.println("name:"+p2.name);
	   }
	   
	}}


 class Student {
     String  name;
      String roll_no;
      double  marks;
      int attandance;
 }

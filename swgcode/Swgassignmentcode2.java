import java.util.*;

class car {
    String color;
    double speed;
    double regularprice;
   

public  car(String color, double speed,double regularprice){
    this.color = color;
    this.speed = speed;
    this.regularprice = regularprice;
}
public double getsaleprice(){

    return (regularprice);
}}
    
class truck extends car{
    
    int weight;
    public truck(String color ,double speed ,double regularprice , int weight){
        
        super(color,speed,regularprice);
        this.weight = weight;
    }
    public double getsaleprice(){
        if(weight>2300){
            return(0.9*super.getsaleprice());}
           else
               return((0.8)*super.getsaleprice());
            }
        }
   
    public class Swgassignmentcode2
{
	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	//	System.out.println("Hello World");
	//truck c1 = new truck( color,speed,regularprice,weight);
	 System.out.println("enter the color of truck :");
	  String color = scan.next();
	 System.out.println("enter the speed of truck :");
	  double speed = scan.nextDouble();
	 System.out.println("enter the regularprice of truck :");
	  double regularprice = scan.nextDouble();
	 System.out.println("enter the weight of truck :");
	  int weight = scan.nextInt();
	 truck c1 = new truck( color,speed,regularprice,weight);
	 System.out.println( "getsale price  :="+c1.getsaleprice());
    	
	
	}
}



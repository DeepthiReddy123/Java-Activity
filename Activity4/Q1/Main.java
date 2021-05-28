import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    	System.out.println("Enter Shape");
    	Scanner sc=new Scanner(System.in);
    	
    	String s=sc.nextLine();
    	
    	if(s.equals("Square")){
        //double width = 5;
        System.out.println("Enter width");
		Scanner width1 = new Scanner(System.in);
        double width = width1.nextInt();
        Shape Square = new Square(width);
        System.out.println("Square width: " + width +" "+ Square.area() );
    	}
    	else{
        // Circle test
        //double radius = 5;
        System.out.println("Enter radius");
		Scanner radius1 = new Scanner(System.in);
        double radius = radius1.nextInt();
        Shape circle = new Circle(radius);
        System.out.println("Circle radius: " + radius
            + "\nResulting Area: " + circle.area());

    }}
}
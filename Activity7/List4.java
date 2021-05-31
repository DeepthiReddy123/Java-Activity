import java.util.ArrayList;
import java.util.Scanner;

public class List4 {
	public static void main(String args[]){

	    ArrayList<Integer> list = new ArrayList<Integer>();
	    
	    System.out.println("print value of n");
	    Scanner f21 = new Scanner(System.in);
        int n = f21.nextInt();
        int i;
        int count=0;
        int count1=0;
        System.out.println("print elements");
        for(i=0;i<n;i++){
        	
        	 Scanner f2 = new Scanner(System.in);
             int n1 = f2.nextInt();
        	list.add(n1);
        	if (n1>=50 && n1<100){
        		count=count+1;
        	}
        	if (n1>=100){
        		count1=count1+1;
        	}
        }
        System.out.println("50's : "+count);
        System.out.println("100's : "+count1);
        
        
		
}

}
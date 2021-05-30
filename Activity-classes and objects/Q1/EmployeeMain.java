
public class EmployeeMain {
	public static void main(String args[]){
        Employee obj = new Employee();
        obj.setname("Ravi");
        obj.setaddress("Pune");
        obj.setmobile("9998887771");
        System.out.println("Employee Name: " + obj.getname());
        System.out.println("Employee SSN: " + obj.getaddress());
        System.out.println("Employee Age: " + obj.getmobile());
   } 
}

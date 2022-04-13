import java.util.Scanner;
public class EmployeeDemo {
	
	Scanner oeder = new Scanner(System.in);
	
	public static void main(String args[]){
		
		EmployeeDemo record = new EmployeeDemo();
		Employee record1 = new Employee();
		String record1_name = record1.getName();
		double record1_hours = record1.getHours();
		double record1_totalPay = record1.getTotalPay();
	        
	    record.displayDetails(record1_name, record1_hours, record1_totalPay);
	}
		
	public String setName(){
		    System.out.println("Enter name: ");
		    return oeder.nextLine();		
	}

	public int setHours(){
		    System.out.println("Enter working hours: ");
		    return oeder.nextInt();
	}
	public void displayDetails(String name, double hours, double totalPay){
        System.out.println("Your Name: " + name);
        System.out.println("Your Work hours: " + hours);
        System.out.println("Your total pay: " + totalPay);
        System.out.println();
    }   

}

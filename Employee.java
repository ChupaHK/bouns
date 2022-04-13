
public class Employee {
	public final static int hourlyRate = 15;
	public final static double OTRate = 16.5;
	private String name;
	private double hours, totalPay, normalPay, OTpay;
	
	
	Employee(){
	        this("A000", 0);
	    }
	
	 Employee (String name, int hours){
	 setName(name);
	 setHours(hours);
	 
	 }
	 public void setHoursAndOT(int hours, String string){
		 	name = this.name;
		 	normalPay = hours * hourlyRate;
		 	OTpay = (hours-40) * OTRate;
	        totalPay = normalPay + OTpay;
	    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getHours() {
		return hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}

	public double getTotalPay() {
		return totalPay;
	}

	public void setTotalPay(double totalPay) {
		this.totalPay = totalPay;
	}
}

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

 class EmployeeTest {


	void testSetHoursAndOT() {
		Employee record1 =new Employee();
		Employee record2 =new Employee();
		
		record1.setHoursAndOT(44, "Mary");
		assertEquals(666.0,record1.getTotalPay());
		
		record1.setHoursAndOT(39, "John");
		assertEquals(585.0,record2.getTotalPay());	
	}
}

import static org.junit.Assert.*;

import org.junit.Test;

public class EmployeeTest {

	@SuppressWarnings("deprecation")
	@Test
	public void testSetHoursAndOT() {
		Employee record1 =new Employee();
		
		record1.setHoursAndOT(44, "Mary");
		assertEquals(666,record1.getTotalPay(),0.01);	
	}
}

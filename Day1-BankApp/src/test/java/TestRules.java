import static org.junit.Assert.*;

import org.cap.dto.Customer;
import org.cap.exception.InvalidInitialAmountException;
import org.cap.service.AcccountService;
import org.cap.service.AccountServiceImpl;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class TestRules {

	
	private AcccountService services;
	
	@Before
	public void intiMethod()
	{
		services=new AccountServiceImpl();
	}
	
	@Rule
	public ExpectedException  thrown=ExpectedException.none();
	@Test
	public void testExceptionmethod() throws InvalidInitialAmountException {

		
		Customer customer=null;
		thrown.expect(IllegalArgumentException.class);
		thrown.expectMessage("customer");
		services.addAccount(customer,1000);
		//fail("Not yet implemented");
	}
	

	
	@Rule
	public Timeout timeout=new Timeout(10);
	@Test
	public void test()
	{
	long sum=0;
	for(long i=0;i<234L;i++)
	{
		sum+=i;
	}
		
	}
}

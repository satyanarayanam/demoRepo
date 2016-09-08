import static org.junit.Assert.*;

import org.cap.dao.AccountDao;
import org.cap.dao.AccountDaoImpl;
import org.cap.dto.Account;
import org.cap.dto.Customer;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

public class WithDral {

	@Mock
	private AccountDao ado;
	
	
	@Before
	public void withdrawal()
	{
		MockitoAnnotations.initMocks(this);
	}
	
	//actual logic
	
   public void find_withdral_amt()
   {
	   Account account=new Account();
	   Customer customer=new Customer();
	   account.setAccountNo(2);
	   account.setAmount(1000);
	   
	   
	   Mockito.when(a)	
	   
	   
	   Mockito.verify(accountDao)
	   Assert.assertE
	   
   
   
   }
	
   
   
	@Test
	public void test() {
		
		
//		fail("Not yet implemented");
	}

}

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.cap.service.AcccountService;
import org.cap.service.AccountServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
@RunWith(Parameterized.class)
public class parameterTestDemo {
    private AcccountService accountService=new AccountServiceImpl();
	//private int input;
	
    private int input;
    private int expected;
	
	
	public parameterTestDemo(int input, int expected) {
		super();
		this.input = input;
		this.expected = expected;
	}
	@Parameters
	
	public static List<Object[]> myparameters()
	{
		return Arrays.asList(new Object[][]{
			{1,5}
			
		});
	}
	@Test
	public void testNumber() {
	//	fail("Not yet implemented");
	assertEquals(expected, accountService.addNumbers(input, input));
	
	}

}

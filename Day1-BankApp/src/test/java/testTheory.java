import static org.junit.Assert.*;

import org.junit.Assume;
import org.junit.Test;
import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;
@RunWith(Theories.class)
public class testTheory {

	
	@DataPoints
 public static int[] myinputs()
	{
		return new int[]
				{
		1,2,3			
				};
	}
	@Theory
	public void testmyTheory(Integer a,Integer b) {
		Assume.assumeTrue(a>0&&b>0);
		Assume.assumeTrue(a+b>0);
	}
	
	
}

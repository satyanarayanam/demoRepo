import org.junit.internal.TextListener;
import org.junit.runner.JUnitCore;

public class TestRunners {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
JUnitCore unitCore=new JUnitCore();

		
unitCore.addListener(new TextListener(System.out));
unitCore.run(testTheory.class);

	}

}

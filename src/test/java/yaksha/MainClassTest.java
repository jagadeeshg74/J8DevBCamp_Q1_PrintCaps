package yaksha;




import java.io.IOException;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import yaksha.TestUtils;


public class MainClassTest {
	
	
	@Test
	public void testDuplicateWordRemoval() throws IOException {
		
	//  Assertions.assertEquals("World Is Beautiful" ,Capitalize.printCapitalized("world is beautiful"));
	 // Assertions.assertEquals("King Rama Is King" ,Capitalize.printCapitalized("king rama is king"));
		
		TestUtils.yakshaAssert(TestUtils.currentTest(),MainClass.printCapitalized("world is beautiful").equals("World Is Beautiful")==true?"true":"false",TestUtils.businessTestFile);
		
	}
	
	
	
	

}

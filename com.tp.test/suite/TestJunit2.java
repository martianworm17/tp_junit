package suite;

import org.junit.Test;
import org.junit.Ignore;

import static org.junit.Assert.assertEquals;

public class TestJunit2 {
	
	String message = "Robert";
	MessageUtil messageUtil = new MessageUtil(message);
	
	@Test
	public void testSalutationMessage() {
		System.out.println("Inside testSalutationMessage()");
		message = "Hi!" + message;
		assertEquals(message, messageUtil.salutationMessage());
	}

}

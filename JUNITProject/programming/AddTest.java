package programming;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AddTest {

	@Test
	public void Addtest() {
		MyJUNITClass junit = new MyJUNITClass();
		int result = junit.add(100, 200);
		assertEquals (301 , result);
		
	}

}

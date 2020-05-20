package programming;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ConcateTest {

	@Test
	public void ConcateTest() {
		MyJUNITClass junit = new MyJUNITClass();
		String result = junit.ConCate("Hello","world");
		assertEquals ("Helloworld" , result);
	}

}

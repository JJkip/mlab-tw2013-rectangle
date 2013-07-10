import static org.junit.Assert.*;

import org.junit.Test;


public class TriangleTest {

	@Test
	public void shouldcalculateAreaOfTheTriangle() {
		Triangle tri = new Triangle(20, 10);
		
		int area = tri.area();
		assertEquals(100, area);
				
		
	}

}

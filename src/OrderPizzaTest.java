import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class OrderPizzaTest {
	 
	OrderPizza p1;
	@Before
	public void setUp() throws Exception {
		p1=new OrderPizza("chicken Pizza",2,300);
	}
	@Test
	public void testGetQuantity() {
		//fail("Not yet implemented");
		assertEquals(2,p1.getQuantity());
	}

	@Test
	public void testGetPrice() {
		//fail("Not yet implemented");
		assertEquals(300,p1.getPrice());
	}

}

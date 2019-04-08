import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.Test;

public class FeedingModel extends Model {

	public FeedingModel() {
		// TODO Auto-generated constructor stub
	}
	
	public boolean detectCollisions() {
		return false;
	}
	
	public void updateLocationAndDirection() {
		
	}
	
	public void dive() {
		
	}
	
	public boolean isHoldingFish() {
		return false;
	}
}

//-----------------------------------------------------------------------------------------------------
//JUnit Tests
class FeedingModelTest {
	@Test
	public void testDetectCollisions() {
		FeedingModel test = new FeedingModel();
		assertEquals(false, test.detectCollisions());
		assertFalse(test.detectCollisions());
	}
	
	@Test
	public void testUpdateLocationAndDirection() {
		//no need for test at this time
	}
	
	@Test
	public void testDive() {
		//no need for test at this time
	}
	
	@Test
	public void testIsHoldingFish() {
		FeedingModel test = new FeedingModel();
		assertEquals(false, test.isHoldingFish());
		assertFalse(test.isHoldingFish());
	}
}

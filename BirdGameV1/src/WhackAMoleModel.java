import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class WhackAMoleModel extends Model {
	private int resourceCount;
	
	@Override
	public boolean detectCollisions() {
		return false;
	}
	
	public void randomizeObjects() {
		
	}

	public int getResourceCount() {
		return resourceCount;
	}

	public void setResourceCount(int resourceCount) {
		this.resourceCount = resourceCount;
	}
}




//-----------------------------------------------------------------------------------------------------
//JUnit Tests

class WhackAMoleModelTest {

	@Test
	public void testDetectCollisions() {
		WhackAMoleModel test = new WhackAMoleModel();
		assertEquals(false, test.detectCollisions());
		assertFalse(test.detectCollisions());
	}
	
	@Test
	public void testRandomizeObjects() {
		//no need for test at this time
	}
	
}
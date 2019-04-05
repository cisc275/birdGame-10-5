import org.junit.jupiter.api.Test;

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
		
	}
	
	@Test
	public void testRandomizeObjects() {
		
	}
	
}
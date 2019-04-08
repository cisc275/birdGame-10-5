import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class SideSwiperModel extends Model {
	
	//updateLocationAndDirection() will contain the logic that allows the bird to move in the x or y direction based on user input
	@Override
	public void updateLocationAndDirection() {
		
	}
	
	//updateBirdLocation() will update the position of the bird to update the minimap
	public void updateBirdLocation() {
		
	}
	
	//updateObstacleLocation() will update where the obstacles are on screen 
	public void updateObstacleLocation() {
		
	}
	
	//detectCollisions() will contain the logic that determines if the bird model has collided with objects such as the ground and other obstacles
	@Override
	public boolean detectCollisions() {
		return false;
	}
	
	//randomizeBlocks() will randomize where blocks that contain questions will appear on screen
	public void randomizeBlocks() {
		
	}
	
	//randomizeQuestion() will pick a random question to appear if the bird hits a question box
	public void randomizeQuestion() {
		
	}
	
	//moveObstacles() moves the obstacles as the game progresses
	public void moveObstacles() {
		
	}
	
}

//-----------------------------------------------------------------------------------------------------
//JUnit Tests
class SideSwiperModelTest {
	
	@Test
	public void testUpdateLocationAndDirection() {
		//no need for test at this time
	}
	
	@Test
	public void testUpdateBirdLocation() {
		//no need for test at this time
	}
	
	@Test
	public void testUpdateObstacleLocation() {
		//no need for test at this time
	}
	
	@Test
	public void testDetectCollisions() {
		SideSwiperModel test = new SideSwiperModel();
		assertEquals(false, test.detectCollisions());
		assertFalse(test.detectCollisions());
	}
	
	@Test
	public void testRandomizeBlocks() {
		//no need for test at this time
	}
	
	@Test
	public void testRandomizeQuestion() {
		//no need for test at this time
	}
	
	@Test
	public void testMoveObstacles() {
		//no need for test at this time
	}
}


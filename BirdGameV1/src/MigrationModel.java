import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class MigrationModel extends Model {
	
	//detectCollisions() will contain the logic that determines if the bird model has collided with objects such as the ground and other obstacles
	@Override
	public boolean detectCollisions() {
		return false;
	}
	
	//updateLocationAndDirection() will contain the logic that allows the bird to move in the x or y direction based on user input
	@Override
	public void updateLocationAndDirection() {
		
	}
	
	//randomizeObstacles() will contain the logic that randomizes where obstacles such as blocks or enemies will appear in the game
	public void randomizeObstacles() {
		
	}
}


//-----------------------------------------------------------------------------------------------------
//JUnit Tests

class MigrationModelTest {

	@Test
	public void testDetectCollisions() {
		MigrationModel test = new MigrationModel();
		assertEquals(false, test.detectCollisions());
		assertFalse(test.detectCollisions());
	}
	
	@Test
	public void testUpdateLocationAndDirection() {
		//no need for test at this time
	}
	
	@Test
	public void testRandomizeObstacles() {
		//no need for test at this time
	}

}

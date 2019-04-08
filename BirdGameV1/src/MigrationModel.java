import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class MigrationModel extends Model {

	
	public boolean detectCollisions() 
	{
		return false;
	}
	
	@Override
	public void updateLocationAndDirection() 
	{
		
	}
	
	public void randomizeObstacles()
	{
		
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

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class SideSwiperModel extends Model {
	
	@Override
	public void updateLocationAndDirection() 
	{
		
	}
	
	public void updateBirdLocation()
	{
		
	}
	
	public void updateObstacleLocation() 
	{
		
	}
	
	@Override
	public boolean detectCollisions()
	{
		return false;
	}
	
	public void randomizeBlocks()
	{
		
	}
	
	public void randomizeQuestion()
	{
		
	}
	
	public void moveObstacles()
	{
		
	}
	
}

//-----------------------------------------------------------------------------------------------------
//JUnit Tests
class SideSwiperModelTest {
	
	@Test
	public void testUpdateLocationAndDirection() 
	{
		//no need for test at this time
	}
	
	@Test
	public void testUpdateBirdLocation()
	{
		//no need for test at this time
	}
	
	@Test
	public void testUpdateObstacleLocation() 
	{
		//no need for test at this time
	}
	
	@Test
	public void testDetectCollisions()
	{
		SideSwiperModel test = new SideSwiperModel();
		assertEquals(false, test.detectCollisions());
		assertFalse(test.detectCollisions());
	}
	
	@Test
	public void testRandomizeBlocks()
	{
		//no need for test at this time
	}
	
	@Test
	public void testRandomizeQuestion()
	{
		//no need for test at this time
	}
	
	@Test
	public void testMoveObstacles()
	{
		//no need for test at this time
	}
}


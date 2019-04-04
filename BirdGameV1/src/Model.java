
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class Model {
	private int frameHeight;
	private int frameWidth;
	private int imgHeight;
	private int imgWidth;
	private int xloc, yloc;
	private int xVector, yVector;
	private int direction;
	private int health;
	
	public Model(int frameWidth, int frameHeight, int imgWidth, int imgHeight) {
		this.frameWidth = frameWidth;
		this.frameHeight = frameHeight;
		this.imgWidth = imgWidth;
		this.imgHeight = imgHeight;
	}
	
	public void updateLocationAndDirection() {
		
	}
	
	public boolean detectCollisions() {
		return false;
	}
}

//-----------------------------------------------------------------------------------------------------
//JUnit Tests
class ModelTest {

	@Test
	public void testUpdateLocationAndDirection() {
		Model model = new Model();
		assertEquals(0, lab01.mult(10, 0), "10 * 0 must be 0");
		assertEquals(100, lab01.mult(10, -10), "10 * -10 must be -100"); //meant to fail
	}
	
	@Test
	public void testDetectCollisions() {
		
		assertEquals(0, lab01.mult(10, 0), "10 * 0 must be 0");
		assertEquals(100, lab01.mult(10, -10), "10 * -10 must be -100"); //meant to fail
	}

}

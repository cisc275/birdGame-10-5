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
	

	public void updateLocationAndDirection() {
		
	}
	
	public boolean detectCollisions() {
		return false;
	}
	
	public int getFrameHeight() {
		return frameHeight;
	}

	public void setFrameHeight(int frameHeight) {
		this.frameHeight = frameHeight;
	}

	public int getFrameWidth() {
		return frameWidth;
	}

	public void setFrameWidth(int frameWidth) {
		this.frameWidth = frameWidth;
	}

	public int getImgHeight() {
		return imgHeight;
	}

	public void setImgHeight(int imgHeight) {
		this.imgHeight = imgHeight;
	}

	public int getImgWidth() {
		return imgWidth;
	}

	public void setImgWidth(int imgWidth) {
		this.imgWidth = imgWidth;
	}

	public int getXloc() {
		return xloc;
	}

	public void setXloc(int xloc) {
		this.xloc = xloc;
	}

	public int getYloc() {
		return yloc;
	}

	public void setYloc(int yloc) {
		this.yloc = yloc;
	}

	public int getxVector() {
		return xVector;
	}

	public void setxVector(int xVector) {
		this.xVector = xVector;
	}

	public int getyVector() {
		return yVector;
	}

	public void setyVector(int yVector) {
		this.yVector = yVector;
	}

	public int getDirection() {
		return direction;
	}

	public void setDirection(int direction) {
		this.direction = direction;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}
}

//-----------------------------------------------------------------------------------------------------
//JUnit Tests
class ModelTest {

	@Test
	public void testUpdateLocationAndDirection() {
		
	}
	
	@Test
	public void testDetectCollisions() {

	}

}

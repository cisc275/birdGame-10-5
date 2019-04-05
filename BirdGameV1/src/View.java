import java.awt.Color;
import java.awt.Dimension;
import java.awt.image.BufferedImage;
import javax.swing.JPanel;
import org.junit.jupiter.api.Test;

public class View extends JPanel {
	
	private Color background;
	private BufferedImage[][] birdAnimationArray;
	private BufferedImage[][] obstacleAnimationArray; 
	
	public void drawBackground() {
		
	}
	
	public void createImage() {
		
	}
	
	public void paintComponent() {
		
	}
	
	@Override
	public Dimension getPreferredSize() {
		return new Dimension();
	}

	
	public Color getBackground() {
		return background;
	}

	public void setBackground(Color background) {
		this.background = background;
	}
	
}

//-----------------------------------------------------------------------------------------------------
//JUnit Tests

class ViewTest {

	@Test
	public void testDrawBackground() {
		
	}
	
	@Test
	public void testCreateImage() {
		
	}
	
	@Test
	public void testPaintComponent() {
		
	}
	
	@Test
	public void testGetPreferredSize() {
		
	}
	
}

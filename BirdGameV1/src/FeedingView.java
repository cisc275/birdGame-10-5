import java.awt.image.BufferedImage;

import org.junit.jupiter.api.Test;

@SuppressWarnings("serial")
public class FeedingView extends View {
	
	private BufferedImage[][] fishingAnimationArray;
	
	public void displayFish() 
	{
		
	}
	
	@Override
	public void drawBackground()
	{
		
	}

	public BufferedImage[][] getFishingAnimationArray() {
		return fishingAnimationArray;
	}

	public void setFishingAnimationArray(BufferedImage[][] fishingAnimationArray) {
		this.fishingAnimationArray = fishingAnimationArray;
	}
	
	
}

//-----------------------------------------------------------------------------------------------------
//JUnit Tests

class FeedingViewTest {
	
	@Test
	public void testDisplayFish()
	{
		
	}
	
	@Test
	public void testDrawBackground()
	{
		
	}
}

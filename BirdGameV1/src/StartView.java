import org.junit.jupiter.api.Test;

@SuppressWarnings("serial")
public class StartView extends View {

	private boolean tutorialClicked;
	private boolean startClicked;
	
	public StartView() {
		// TODO Auto-generated constructor stub
	}
	
	public void createBirdObject() {
		
	}
	
	@Override
	public void drawBackground() {
		
	}
	
	public boolean getTutorialClicked() {
		return this.tutorialClicked;
	}
	
	public boolean getStartClicked() {
		return this.startClicked;
	}
}

//-----------------------------------------------------------------------------------------------------
//JUnit Tests

class StartViewTest {
	
	@Test
	public void createBirdObject() {
		
	}
	
	@Test
	public void drawBackground() {
		
	}
	
}

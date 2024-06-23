package day26java;

public enum BrowserTypeWithDefinition {

	CHROME ("chrome"),
	FIREFOX ("firefox"),
	EDGE ("edge"),
	SAFARI ("safari"),
	IE ("ie");
	
	private final String browser;
	
	private BrowserTypeWithDefinition(String browser) {
		this.browser = browser;
	}
	
	public String tostring() {
		return this.browser;
	}
	
}

package day26java;

public class EnumCalling {

	public void Enumaccessing() {
		//System.out.println(Brower.CHROME);
		Brower[]values=Brower.values();
		for(Brower value: values) {
			System.out.println(value);
		}
	}
	public void Enumaccessingwithdefinition() {
		//System.out.println(BrowserTypeWithDefinition.CHROME.tostring());
		BrowserTypeWithDefinition[] values = BrowserTypeWithDefinition.values();
		for (BrowserTypeWithDefinition value : values) {
			System.out.println(value.tostring());
		}

	}
	public static void main(String[] args) {
		EnumCalling obj = new EnumCalling();
		//obj.accessingEnum();
		obj.Enumaccessingwithdefinition();
	}


}

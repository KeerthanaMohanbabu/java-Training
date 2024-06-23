package day26java;

public enum Brower {

	/**
	 * Enum : Enumeration

	- Enum is type of class which will be prefered to store the  collections of a constants.

	- Enum can be declared in 2 ways
		- Declaration inside of class.
		- Declaration outside of class. (prefered)
	- The first line of enum should always be a list of constant and it can also have constructor and methods .
	- Enum constant should be in capital letter as per std.
	- Every enum is internally implemented by enum class.
	- Every enum constant represent an object of enum type.
	- Every enum constant internally declared as public static final.
	
	- Public: Accessible from any part of your code.
	- Static: Belongs to the enum type itself, not to instances of the enum.
	- Final: Cannot be modified once defined.
	
	- Additional Enum Methods:
	
	- The Java compiler automatically adds the following methods to enums:
	- values(): Returns an array containing all the enum constants.
	- valueOf(String name): Returns the enum constant with the specified name.
	- ordinal(): Returns the position (index) of the enum constant.
	 */
	
	
	CHROME,FIREFOX,EDGE,IE,SAFARI,OPERA;
	//BrowserType CHROME = new BrowserType();
	//BrowserType FIREFOX = new BrowserType();
}

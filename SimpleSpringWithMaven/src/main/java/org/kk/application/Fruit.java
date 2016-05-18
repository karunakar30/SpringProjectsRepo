package org.kk.application;

public class Fruit {
	
	/**Setting bean properties*/
	private String fruitName;
	/**Setting bean properties with P name space*/
	private String fruitColor;
	
	public Fruit() { }
	
/**Configuring bean with non default constructor*/
	public Fruit(String name) {
		fruitName = name;
	}
	
	
	
	public String talkAboutFruit()
	{
		String speech = "Hi, I am Fruit ";
		
		if(fruitName !=null && !fruitName.equals(""))
			speech = speech+fruitName;
		
		if(fruitColor !=null && !fruitColor.equals(""))
			speech = speech+ " and my color is " + fruitColor;
		
		return speech;
	}
	
	public String getFruitName() {
		return fruitName;
	}

	public void setFruitName(String fruitName) {
		this.fruitName = fruitName;
	}
	
	public String getFruitColor() {
		return fruitColor;
	}

	public void setFruitColor(String fruitColor) {
		this.fruitColor = fruitColor;
	}
}

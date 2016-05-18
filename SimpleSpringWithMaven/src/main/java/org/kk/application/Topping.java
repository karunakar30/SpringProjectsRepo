package org.kk.application;

public class Topping extends Sause{
	
	private String name;

	public String talkingAboutYourSelf()
	{
		String speech = super.talkingAboutYourSelf();
		return speech += " with topping "+name;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}

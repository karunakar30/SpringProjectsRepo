package org.kk.application;

public class Meal {
	
	/**Configuring Spring Beans with Setter/Dependency Injection*/
	private Grain grain;
	private Salad salad;
	
	/**Configuring Spring Beans with Constructor Injection*/
	private Grain grainConst;
	private Salad saladConst;
	
	private Sause sauce;
	
	public Meal() { }
	
	public Meal (Grain g,Salad s)
	{
		this.grainConst = g;
		this.saladConst = s;
	}
	
	public Grain getGrain() {
		return grain;
	}
	public void setGrain(Grain grain) {
		this.grain = grain;
	}
	public Salad getSalad() {
		return salad;
	}
	public void setSalad(Salad salad) {
		this.salad = salad;
	}
	
	public Sause getSauce() {
		return sauce;
	}

	public void setSauce(Sause sauce) {
		this.sauce = sauce;
	}

	public String insideMeal()
	{
		String speech = "In this meal Contains ";
		if(grain != null)
		{
			speech += "some Grains ";
		}
		if(salad != null)
		{
			speech += "and some Salads";
		}
		
		if(grainConst != null)
		{
			speech += "some Grains calling from constructor";
		}
		if(saladConst != null)
		{
			speech += "and some Salads calling from constructor";
		}
		/**Outer and Inner Beans*/
		if(sauce != null)
		{
			speech += sauce.talkingAboutYourSelf();
		}
		
		return speech;
	}

}

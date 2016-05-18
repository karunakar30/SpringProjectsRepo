package org.kk.application;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class HelloFood {

public static void main(String[] args) {
		
		//Fruit fruit = new Fruit();
		//Vegetable vegetable = new Vegetable();
	ApplicationContext appContext = new FileSystemXmlApplicationContext("appContext.xml");
	
	/**Configuring bean with default constructor*/
	Fruit fruit = appContext.getBean("fruit",Fruit.class);
	Vegetable vegetable = (Vegetable)appContext.getBean("vegetable");
	System.out.println(fruit.talkAboutFruit());
	System.out.println(vegetable.talkAboutVegetable());
	
	/**Configuring bean with non default constructor*/
	Fruit fruitName = appContext.getBean("fruitName",Fruit.class);
	System.out.println(fruitName.talkAboutFruit());
	
	/**Setting bean properties with Pname space*/
	Fruit fruitNameSpace = appContext.getBean("fruitWithPNameSpace",Fruit.class);
	System.out.println(fruitNameSpace.talkAboutFruit());
	
	/**Setting bean propertie*/
	Vegetable vegetableWithName = (Vegetable)appContext.getBean("vegetableWithName");
	System.out.println(vegetableWithName.talkAboutVegetable());
	
	/**Setting bean properties with List and Map*/
	Vegetable vegetableNames = (Vegetable)appContext.getBean("vegetableNameListMap");
	System.out.println(vegetableNames.talkAboutVegetableNames());
		
	System.out.println("--------------------------------------");
	
	/**Calling setter/Dependency Injections*/
	//Meal meal = new Meal();
	Meal meal = (Meal)appContext.getBean("meal");
	System.out.println(meal.insideMeal());
	System.out.println("--------------------------------------");
	
	/**Calling with Constructor Injections*/
	Meal mealWithConstructor = (Meal)appContext.getBean("mealWithConstructor");
	System.out.println(mealWithConstructor.insideMeal());
	System.out.println("--------------------------------------");
	
	/**Configuring Spring Bean Property with External Properties file*/
	Grain grain = (Grain)appContext.getBean("grainWithProp");
	System.out.println(grain.talkingGrain());
	System.out.println("--------------------------------------");
	
	/**Outer and Inner Beans*/
	Meal outterMeal = (Meal)appContext.getBean("outterMeal");
	System.out.println(outterMeal.insideMeal());
	System.out.println("--------------------------------------");
	
	/**Setting Init and Destroy in Bean*/
	Salad salad = (Salad)appContext.getBean("saladWithInitDest");
	System.out.println(salad.talkingSalad());
	System.out.println("--------------------------------------");
	
	/**Autowiring byName*/
	Meal mealWithAutoWiring = (Meal)appContext.getBean("mealWithAutoWiring");
	System.out.println(mealWithAutoWiring.insideMeal());
	System.out.println("--------------------------------------");
	
	/**Autowiring Constructor*/
	Meal mealWithAutoWiringCons = (Meal)appContext.getBean("mealWithAutoWiringCons");
	System.out.println(mealWithAutoWiringCons.insideMeal());
	
	((FileSystemXmlApplicationContext)appContext).close();
	
	}
}

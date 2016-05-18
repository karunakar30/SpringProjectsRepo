package fooddemo;

public class HelloFood {

	public static void main(String[] args) {
		
		Fruit fruit = new Fruit();
		Vegitable vegitable = new Vegitable();
		
		System.out.println(fruit.talkAboutFruit());
		System.out.println(vegitable.talkAboutVegitable());
		
	}

}

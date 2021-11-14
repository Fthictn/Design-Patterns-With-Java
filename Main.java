public class Main{
	public static void main(String[] args){
		//FACTORY SAMPLE
		Factory factory = new Factory();
		Shape shape = factory.getShape("Rectangle");
		System.out.println(shape.getArea(5,10));

		//SINGLETON SAMPLE
		Singleton singleton = Singleton.getInstance();
	}
}
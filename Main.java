import java.util.Observable;
import java.util.Observer;

public class Main{
	public static void main(String[] args){
		//FACTORY SAMPLE
		Factory factory = new Factory();
		Shape shape = factory.getShape("Rectangle");
		System.out.println(shape.getArea(5,10));

		//SINGLETON SAMPLE
		Singleton singleton = Singleton.getInstance();

		//FACADE SAMPLE
		Facade facade = new Facade();
		facade.familiaSale();
		facade.pappiaSale();

		//STRATEGY SAMPLE
		Strategy strategy = new Strategy(new Addition());
		float numberOne = 19;
		float numberTwo = 10;
		System.out.println(strategy.calculate(numberOne,numberTwo));

		//OBSERVER SAMPLE
		FileReaderObservable fileRead = new FileReaderObservable();
		Observer1 observer1 = new Observer1();
		Observer2 observer2 = new Observer2();

		fileRead.addObserver(observer1);
		fileRead.addObserver(observer2);
		fileRead.readFile();
	}
}
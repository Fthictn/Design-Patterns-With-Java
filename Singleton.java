public class Singleton{
	private Signleton(){}
	public static Singleton singleton;

	public static Singleton getInstance(){
		if(singleton == null){
			singleton = new Singleton();
		}
		return singleton;
	}

}


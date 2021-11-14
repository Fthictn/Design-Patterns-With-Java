import java.util.Observable;
import java.util.Observer;
import java.io.IOException;  
import java.io.RandomAccessFile;  

class Observer1 implements Observer{
	private String response;

	public void update(Observable obj, Object arg){
		if(arg instanceof String){
			response = (String) arg;
			System.out.println("\n File Observer1 : " + response);
		}
	}
}

class Observer2 implements Observer{
	private String response;

	public void update(Observable obj, Object arg){
		if(arg instanceof String){
			response = (String) arg;
			System.out.println("\n File Observer2 : " + response);
		}
	}
}

public class FileReaderObservable extends Observable{

	public void readFile(){
		try{
		  RandomAccessFile in = new RandomAccessFile("file.txt", "r");
	      String line;
	      while(true) {
	         if((line = in.readLine()) != null) {
	            setChanged();
	            notifyObservers(line);
	         } else {
	            Thread.sleep(1000);
	         }
	      }			
		}catch(Exception e){
			e.printStackTrace();
		}

	}
}
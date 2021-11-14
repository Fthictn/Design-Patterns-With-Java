interface Good{

	public void getPrice();

	public void getModelNo(); 
}

class Familia implements Good{
	@Override
	public void getPrice(){
		System.out.println("Price: 10$");
	}

	@Override
	public void getModelNo(){
		System.out.println("Model No: 19");
	}
}

class Pappia implements Good{
	@Override
	public void getPrice(){
		System.out.println("Price: 15$");
	}

	@Override
	public void getModelNo(){
		System.out.println("Model No: 7");
	}
}

public class Facade{
	Good pappia;
	Good familia;

	public Facade(){
		pappia = new Pappia();
		familia = new Familia();
	}

	public void familiaSale(){
		familia.getPrice();
		familia.getModelNo();
	}

	public void pappiaSale(){
		pappia.getPrice();
		pappia.getModelNo();
	}
}
interface Method{
	public float calculation(float numberOne, float numberTwo);
}


class Addition implements Method{
	@Override
	public float calculation(float numberOne, float numberTwo){
		return numberOne + numberTwo;
	}
}

class Subscription implements Method{
	@Override
	public float calculation(float numberOne,float numberTwo){
		return numberOne - numberTwo;
	}
}

class Multiplication implements Method{
	@Override
	public float calculation(float numberOne,float numberTwo){
		return numberOne*numberTwo;
	}
}

public class Strategy{
	Method method;

	public Strategy(Method method){
		this.method = method;
	}

	public float calculate(float numberOne,float numberTwo){
		return method.calculation(numberOne,numberTwo);
	}
}
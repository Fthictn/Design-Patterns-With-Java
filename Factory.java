public class Factory{
	Shape getShape(String shapeType){
		if(shapeType ==null){
			return null;
		}
		if(shapeType.equalsIgnoreCase("Triangle")){
			return new Triangle();
		}else if(shapeType.equalsIgnoreCase("Rectangle")){
			return new Rectangle();
		}

		return null;
	}
}


abstract class Shape{
	protected int width;
	protected int height;

	abstract public int getArea(int width,int height);
}


class Triangle extends Shape{
	@Override
	public int getArea(int width,int height){
		return (width*height)/2;
	}
}

class Rectangle extends Shape{
	@Override
	public int getArea(int width,int height){
		return width*height;
	}
}


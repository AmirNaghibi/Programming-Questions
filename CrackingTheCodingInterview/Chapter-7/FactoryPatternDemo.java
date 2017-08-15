
public class FactoryPatternDemo{
	
	public interface Shape{
		// method to be implemented
		void draw();
	}


	public static class Triangle implements Shape{
		@Override
		public void draw(){System.out.println("Draw Triangle");}
	}

	public static class Circle implements Shape{
		@Override
		public void draw(){System.out.println("Draw Circle");}
	}

	public static class Square implements Shape{
		@Override
		public void draw(){System.out.println("Draw Square");}
	}


	public static class ShapeFactory {
	
   		//use getShape method to get object of type shape 
   		public Shape getShape(String shapeType){
   		   if(shapeType == null){
   		      return null;
   		   }		
   		   if(shapeType.equalsIgnoreCase("CIRCLE")){
   		      return new Circle();
   		      
   		   } else if(shapeType.equalsIgnoreCase("Triangle")){
   		      return new Triangle();
   		      
   		   } else if(shapeType.equalsIgnoreCase("SQUARE")){
   		      return new Square();
   		   }
   		   
   		   return null;
   		}
	}



	public static void main(String[] args) {
      ShapeFactory shapeFactory = new ShapeFactory();

      //get an object of Circle and call its draw method.
      Shape shape1 = shapeFactory.getShape("CIRCLE");

      //call draw method of Circle
      shape1.draw();

      //get an object of Rectangle and call its draw method.
      Shape shape2 = shapeFactory.getShape("Triangle");

      //call draw method of Rectangle
      shape2.draw();

      //get an object of Square and call its draw method.
      Shape shape3 = shapeFactory.getShape("SQUARE");

      //call draw method of circle
      shape3.draw();
   }
}
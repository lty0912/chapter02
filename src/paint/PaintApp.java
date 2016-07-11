package paint;

public class PaintApp {

	public static void main(String[] args) {
		Point point1 = new Point(100, 200);
		
		
		draw(point1);
		
		
		Point point2 = new Point(10, 20);
		
		draw(point2);
		
		Point point = new ColorPoint(300, 200, "red");		
		draw(point);
		
		draw(new Rectangle() );
		draw(new Triangle() );
		draw(new Circle() );
		draw(new Pentagon() );
		
		
		
		

	}
	
	public static void drawColorPoint (Point point) {
		point.show(true);
	}
//	
//	public static void drawShape(Shape shape) {
//		shape.draw();
//	}
	
	public static void draw(Drawable drawable) {
		drawable.draw();
	}
	
	

}

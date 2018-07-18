public class MainRectangle {

	public static void main(String[] args) {
		
		Rectangle r1 = new Rectangle(5, 10, Units.Meter );  // rectangle
		
		Rectangle r2 = new Rectangle(5, Units.Millimeter );  //square
		
		Rectangle r3 = new Rectangle(); //default
		
		System.out.println("Rectangle one:");	
		System.out.println(UnitUtils.convertPerimeter(r1.perimeter(), r1.getUnits(), Units.Millimeter));
		System.out.println("Rectangle two:");	
		System.out.println(UnitUtils.convertPerimeter(r2.perimeter(), r2.getUnits(), Units.Meter));
		System.out.println("Rectangle default:");	
		System.out.println(UnitUtils.convertPerimeter(r3.perimeter(), r3.getUnits(), Units.Meter));

		
		System.out.println(r1.toString());
		System.out.println(r2.toString());
		System.out.println(r3.toString());
	}
	

}

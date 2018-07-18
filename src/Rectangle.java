
public class Rectangle {

		private Integer length;
		private Integer width;
		private Units units;
		
		
		
		public Units getUnits() {
			return units;
		}

		public void setUnits(Units units) {
			this.units = units;
		}

		public void setLength(Integer length) {
			this.length = length;
		}

		public void setWidth(Integer width) {
			this.width = width;
		}

		public int getLength() {
			return length;
		}
		public int getWidth() {
			return width;
		}
		
		
		public  Rectangle () {
			this(5, 4, Units.Centimeter);  
			// var ari sadi
			//length = 5; //default values
			//width = 4;
			//this.units = Units.Centimeter;
		}
		
		public  Rectangle (int length, int width, Units units) { // rectangle with parameters
			this.length = length;
			this.width = width;
			this.units = units;
			
		}
		
		public Rectangle (int length, Units units) {  //square
			this.length = length;
			width = length;
			this.units = units;
		}
		
		
		
		public boolean isSquare() {
			// Var ari sadi, bez if else
			// return height == width;  
			if (length == width) {
				return true;
			}else {
				return false;
			}
		}
		
		public int area() {
			return length * width;
		}
		
		public int perimeter() {
			return (length + width) * 2; 
		}

		@Override
		public String toString() {
			return "Rectangle [length=" + length + ", width=" + width + ", units=" + units + ", isSquare()="
					+ isSquare() + ", area()=" + area() + ", perimeter()=" + perimeter() + "]";
		}

	
		

		
		
		
		
		


}

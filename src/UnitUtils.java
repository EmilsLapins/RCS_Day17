

public class UnitUtils {
	
	private static double millimeter_centimeters = 10.0;
    private static double millimeter_meters = 1000.0;
    private static double centimeters_meters = 100.0;
    
  public static double convertPerimeter(int perimeter, Units fromUnits, Units toUnits) {
	
	  if (fromUnits == toUnits) {
		  return perimeter;
	  }
	  
	  switch (fromUnits) {
	case Centimeter:
		double result;
		if (toUnits == Units.Meter) {
			result =  perimeter / centimeters_meters;
		} else if (toUnits == Units.Millimeter) {
			result =   perimeter * millimeter_centimeters;
		}
			else {
				result =  perimeter;
		}
		return result;
	case Millimeter:
		double result1;
		if (toUnits == Units.Centimeter) {
			result1 =  perimeter / millimeter_centimeters;
		} else if (toUnits == Units.Meter) {
			result1 =   perimeter / millimeter_meters;
		}
			else {
				result1 =  perimeter;
		}
		return result1;
		
	case Meter:
		double result2;
		if (toUnits == Units.Centimeter) {
			result2 =  perimeter * centimeters_meters;
		} else if (toUnits == Units.Millimeter) {
			result2 =  perimeter * millimeter_meters;
		}
			else {
				result2 =  perimeter;
		}
		return result2;
		
		
	default:
		return 0.0;
	}
	  

  }

	
	
}


//UzrakstÄ«t UnitUtils klasi ar kuru var konvertÄ“t:
//a. Perimetru no mÄ“rvienÄ«bas A uz mÄ“rvienÄ«bu B
//b. FigÅ«ras laikumu no mÄ“rvienÄ«bas B
//c. NepiecieÅ¡amÄ�s konstantes glabÄ�t tÄ�, lai nevar tÄ�s izmainÄ«t ar kodu
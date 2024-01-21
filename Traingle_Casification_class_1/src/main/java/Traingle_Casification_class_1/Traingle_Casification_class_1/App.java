package Traingle_Casification_class_1.Traingle_Casification_class_1;


/*
 * Israel Amit Uliel 319050423
 * Paz Abitbul 315663963
 */

enum Triangle_Types {
	  equilateral,
	  isosceles,
	  Scalene,
	  Nottriangle,
	  ERROR
	} 

class TriangleClassifier {
	
	private static Triangle_Types triangle;
	
	public static void classifyTriangle(int a, int b, int c) 
	{		
	        if(isError(a,b,c))
	        {
	        	triangle=Triangle_Types.ERROR;
	        }
	        else if (isEquilateral(a, b, c)) 
	        {
	        	triangle= Triangle_Types.equilateral;
	        }
	        else if(isIsosceles(a, b, c)) 
	        {
	        	triangle= Triangle_Types.isosceles;
	        }
	        else if(!isTriangle(a, b, c))
	        {
	        	triangle= Triangle_Types.Nottriangle;
	        }
	        else 
	        {
	        	triangle=Triangle_Types.Scalene;
	        }	       
	}

		// if error
		private static boolean isError(int a, int b, int c ) 
		{
	        return (a + b > c && b + c > b && b + c > a) && (a <= 0 || b <= 0 || c <= 0);
	    }
		
		// if can be a triangle
	    private static boolean isTriangle(int a, int b, int c) 
	    {
	        return b + a > c && a + c > b && b + c > a;
	    }

	    // if Isosceles triangle
	    private static boolean isIsosceles(int a, int b, int c) 
	    {
	        return ( a + b > c && a + c > b && b + c > a && 
	        		(((a == b) && (a!=c)) || ((a == c) && (a!=b)) || ((b == c) && (a!=c))) );
	    }

	    private static boolean isEquilateral(int a, int b, int c ) 
	    {
	        return a + b > c && b + c > b && b + c > a && a == b && b == c;
	    }
	    
	    public static Triangle_Types get_type() {
	    	return triangle;
	    }
}

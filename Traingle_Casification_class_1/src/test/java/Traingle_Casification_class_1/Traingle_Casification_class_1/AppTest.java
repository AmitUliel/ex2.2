package Traingle_Casification_class_1.Traingle_Casification_class_1;

import static org.junit.Assert.assertTrue;

import org.junit.Test;


import static org.junit.Assert.*;
import  org.junit.Test;

/*
 * Israel Amit Uliel 319050423
 * Paz Abitbul 315663963
 */
public class AppTest {
	
	TriangleClassifier triangle = new TriangleClassifier();
	
	// שווה צלעות
	@Test
	public void equilateralTriangle(){
        int a = 7;
        int b = 7;
        int c = 7;
        triangle.classifyTriangle(a,b,c);
        String expected = Triangle_Types.equilateral.toString();
        String result = triangle.get_type().toString();
        assertEquals(expected, result.toString());
    }
	
	// שווה שוקיים
	@Test
	public void IsoscelesTriangle(){
        int a = 5;
        int b = 5;
        int c = 9;
        triangle.classifyTriangle(a,b,c);
        String expected =Triangle_Types.isosceles.toString();
        String result = triangle.get_type().toString();
        assertEquals(expected, result.toString());
    }
	
	// שונה צלעות
	@Test
	public void scaleneTriangle(){
        int a = 6;
        int b = 8;
        int c = 9;
        triangle.classifyTriangle(a,b,c);
        String expected = Triangle_Types.Scalene.toString();
        String result = triangle.get_type().toString();
        assertEquals(expected, result.toString());
    }
	
	// לא משולש
	@Test
	public void NotaTriangle(){
        int a = 1;
        int b = 2;
        int c = 5;
        triangle.classifyTriangle(a,b,c);
        String expected =Triangle_Types.Nottriangle.toString();
        String result = triangle.get_type().toString();
        assertEquals(expected, result.toString());
    }
	
	// Error
	@Test
	public void ErrorTriangle(){
        int a = 0;
        int b = 10;
        int c = 2;
        triangle.classifyTriangle(a,b,c);
        String expected =Triangle_Types.ERROR.toString();
        String result = triangle.get_type().toString();
        assertEquals(expected, result.toString());
    }
}  
import static org.junit.Assert.*;
import org.junit.Test;


public class JUnitTests {
    Triangle tri;

    @Test
    public void isTriangleTest1() {
        // Not a Triangle
        tri = new Triangle(1, 2, 3);
        assertFalse(tri.isTriangle());
    }
    @Test
    public void isTriangleTest2() {
        // Isosceles
        tri = new Triangle(5, 3, 3);
        assertTrue(tri.isTriangle());
    }
    @Test
    public void isTriangleTest3() {
        // Not a triangle
        tri = new Triangle(0, 0, 0);
        assertFalse(tri.isTriangle());
    }
    @Test
    public void isTriangleTest1() {
        // Not a Triangle
        tri = new Triangle(1, 2, 3);
        assertFalse(tri.isTriangle());
    }
    @Test
    public void isTriangleTest2() {
        // Isosceles
        tri = new Triangle(5, 3, 3);
        assertTrue(tri.isTriangle());
    }
    @Test
    public void isTriangleTest3() {
        // Not a triangle
        tri = new Triangle(0, 0, 0);
        assertFalse(tri.isTriangle());
    }
}

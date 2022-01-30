package ClassActivity;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Point2DTest {
    @Test
    public void testx(){
        // SetUp
        Point2D p1 = new Point2D(5, 5.5);

        // Invoke
        double expectedx = 5.0;
        double actualx= p1.getX(); // Expecting 5.0

        // Analyse
        assertEquals(actualx, expectedx);

    }

    @Test
    public void testy(){
        // Set UP
        Point2D p1 = new Point2D(5, 5.5);

        // Invoke
        double expectedy = 5.5;
        double actualy = p1.getY(); // Expecting 5.5


        // Analyse
        assertEquals(expectedy, actualy);



    }

}
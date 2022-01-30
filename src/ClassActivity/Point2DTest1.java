package ClassActivity;

import org.junit.jupiter.api.Test;

import java.awt.*;

import static java.util.Objects.hash;
import static org.junit.jupiter.api.Assertions.*;

public class Point2DTest1 {
    public static void main(String[] args) {
        Point2D p1 = new Point2D(5, 5.5);
        System.out.println(p1);
        System.out.println(p1.getX()); // This is x, returns 5
        System.out.println(p1.getY()); // This is y, returns 5.5
        Point2D p2 = new Point2D(5, 5.5);

        System.out.println(p1.equals(p2));


//        System.out.println(hash(p1));

    }}
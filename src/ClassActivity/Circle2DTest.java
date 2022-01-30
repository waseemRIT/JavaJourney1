package ClassActivity;

public class Circle2DTest {
    public static void main(String[] args){
            Point2D point1 = new Point2D(2, 9);
            Point2D point2 = new Point2D(2,9);

            Circle2D circle1 = new Circle2D(point1, 22);
            Circle2D circle2 = new Circle2D(point2, 22);

        System.out.println(point1);
        System.out.println(point2);

        System.out.println(circle1);
        System.out.println(circle2);

        System.out.println(circle1 == circle2);



    }

}

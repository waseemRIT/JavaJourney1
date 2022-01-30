package ClassActivity;

public class Point2D {
    private final double x;
    private final double y;


    public Point2D(double X, double Y){
        this.x = X;
        this.y = Y;
    }

    public Point2D(){
     x = 0;
     y =0;
    }


    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }



    @Override
    public boolean equals(Object obj){
        if (this == obj){
            return true;
        }
        if (obj == null || !(obj instanceof Point2D)){
            return false;
        }

        Point2D other = (Point2D) obj;

        if (this.x == other.x && this.y == other.y){
            return true;
        }

        return false;

    }

    @Override
    public String toString() {
        String str = " x: " + x + " y : " + y;
        return str;

    }

}

package ClassActivity;

public class Circle2D {
    private final Point2D center;
    private final double radius;

    public Circle2D(Point2D center, double radius) {

        this.center = center;
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public Point2D getCenter() {
        return center;
    }


    @Override
    public String toString(){
        return "The Center is " + "(" + center.getX() + "," + center.getY() + ")" ;
    }

    @Override
    public boolean equals(Object o){
        if (this == o){
            return true;
        }
        if (o == null ||  !(o instanceof Circle2D)){
            return false;
        }

        Circle2D other = (Circle2D) o;

        if (this.radius == other.radius && this.center == other.center) {
            return true;
        }

    return true;
    }

}

class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public String toString() {
      return "(" + x + ", " + y + ")";
    }
}

class Segment {
    private Point p1;
    private Point p2;

    public Segment(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public double getLength() {
        double xDifference = p2.getX() - p1.getX();
        double yDifference = p2.getY() - p1.getY();
        return Math.sqrt(xDifference * xDifference + yDifference * yDifference);
    }

    public String toString() {
        return "Segment[v1=" + p1 + ",v2=" + p2 + "]";
    }
}

class Triangle {
    private Point v1;
    private Point v2;
    private Point v3;

    public Triangle(Point v1, Point v2, Point v3) {
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }

    public double getDistance(Point p1, Point p2) {
        double xDifference = p2.getX() - p1.getX();
        double yDifference = p2.getY() - p1.getY();
        return Math.sqrt(xDifference*xDifference + yDifference*yDifference);
    }

    public double getDistances() {
        double distance1 = getDistance(v1, v2);
        double distance2 = getDistance(v2, v3);
        double distance3 = getDistance(v3, v1);
        return distance1 + distance2 + distance3;
    }

    public String getType() {
        double distance1 = getDistance(v1, v2);
        double distance2 = getDistance(v2, v3);
        double distance3 = getDistance(v3, v1);

        if(distance1 == distance2 && distance2 == distance3) {
            return "Equilateral";
        } else if(distance1 == distance2 || distance2 == distance3 || distance3 == distance1) {
            return "Isosceles";
        } else {
            return "Scalene";
        }
    }

    public String toString() {
        return "Triangle[v1=" + v1 + ",v2=" + v2 + ",v3=" + v3 + "]";
    }

    public static void main(String[] args) {
        Point p1 = new Point(0, 0);
        Point p2 = new Point(4, 2);
        Point p3 = new Point(1, 5);
        Triangle t1 = new Triangle(p1, p2, p3);
        System.out.println(t1);
        System.out.println(t1.getDistances());
        System.out.println(t1.getType());

        Point p4 = new Point(0, 0);
        Point p5 = new Point(3, 0);
        Segment s1 = new Segment(p4, p5);
        System.out.println(s1.getLength());
        System.out.println(s1);
    }  
}
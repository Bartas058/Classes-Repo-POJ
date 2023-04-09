class Point {
    private int x;
    private int y;
    
    public Point() {
        this.x = 320;
        this.y = 200;
    }
    
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    public void setX(int number) {
        this.x = number;
    }

    public void setY(int number) {
        this.y = number;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public Point getCoordinates() {
        return new Point(this.x, this.y);
    }

    public void setCoordinates(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setCoordinates(Point point) {
        this.x = point.getX();
        this.y = point.getY();
    }

    public double distance(Point point) {
        int dx = this.x - point.getX();
        int dy = this.y - point.getY();
        return Math.sqrt(dx * dx + dy * dy);
    }
}
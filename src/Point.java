public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance() {
        return Math.sqrt(x * x + y * y);
    }

    public double distance(Point p) {
        int xDistance = this.x - p.getX();
        int yDistance = this.y - p.getY();
        return Math.sqrt(xDistance * xDistance + yDistance * yDistance);
    }

    public double distance(int a, int b) {
        int xDistance = this.x - a;
        int yDistance = this.y - b;
        return Math.sqrt(xDistance * xDistance + yDistance * yDistance);
    }


}

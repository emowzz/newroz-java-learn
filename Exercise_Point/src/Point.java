public class Point {
    private int x;
    private int y;

    public Point()
    {
        this(0,0);
    }

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

    public double distance()
    {
        return distance(0,0);
    }

    public double distance(int x2, int y2)
    {
        double distance =  (this.x - x2) * (this.x - x2) + (this.y - y2) * (this.y-y2);
        return Math.sqrt(distance);
    }

    public double distance(Point P)
    {
        return distance(P.x, P.y);
    }
}

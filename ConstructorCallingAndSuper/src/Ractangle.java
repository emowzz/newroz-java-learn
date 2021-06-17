public class Ractangle extends Shape{
    private int width;
    private int heigth;

    public Ractangle(int x, int y)
    {
        this(x,y,0, 0);
    }

    public Ractangle (int x, int y, int width, int heigth)
    {
        super(x,y);
        this.width = width;
        this.heigth = heigth;
    }


}

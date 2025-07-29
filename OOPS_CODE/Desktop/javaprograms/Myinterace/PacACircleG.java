package Myinterace;
public class PacACircleG extends AbstractGeo {
    double  ra;
    public PacACircleG(int r)
    {
        ra=r;
    }
    public double area()
    {
        return  pi*ra*ra;
    }
    public double circum()
    {
        return (pi*ra+ra);
    }
}

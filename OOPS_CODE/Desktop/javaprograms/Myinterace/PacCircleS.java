package Myinterace;
public class PacCircleS implements interfaceShape {
double ra;
    public PacCircleS(double ra)
    {
       this.ra=ra;
    }
    public int area()
    {
return (int)(interfaceShape.pi*ra*ra);
    }
    public int peri()
    {
return (int)  (interfaceShape.pi*(ra+ra));
    }
}

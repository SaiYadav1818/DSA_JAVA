package Myinterace;

public class PacRectS implements interfaceShape {
    int length,width;
    PacRectS(int l,int w)
    {
length=l;
width=w;
    }
    public int area()
    {
        return length*width;
    }
    public int peri()
    {
        return 2*length*width;
    }
}

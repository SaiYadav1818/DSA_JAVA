 class Constructor {
    int i;
    public Constructor(int i)
    {
        this.i=i+++10;
    }}
    class Constructor21 extends Constructor{
public Constructor21(int i)
{
    super(i--);
    System.out.println(i);
} 
    }
public class Constructor18{
    public static void main(String[] args) {
        Constructor21 obj=new Constructor21(20);
    }
}

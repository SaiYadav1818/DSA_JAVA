public class string1{
    public static void main(String ar[])
    {
        System.out.println("flower".indexOf("flow"));
        System.out.println("flow".indexOf("flower"));
        String prefix="flight";
        while(prefix.indexOf("flow")!=0)
        {
prefix=prefix.substring(0, prefix.length()-1);
System.out.println(prefix);
        }
    }
}
public class time {
    public static void main(String[] args) {
        String st1="07:04:2003:AM";
        StringBuffer sb=new StringBuffer();
        StringBuffer sb2=new StringBuffer();
        StringBuffer sb3=new StringBuffer();
        StringBuffer sb4=new StringBuffer();
for(int i=0;i<2;i++)
{
    sb.append(st1.charAt(i));
}
for(int i=st1.length()-2;i<st1.length();i++)
{
    sb2.append(st1.charAt(i));
}
for(int i=2;i<st1.length()-3;i++)
{
sb4.append(st1.charAt(i));
}
System.out.println(sb4);
String pa=sb2.toString();
System.out.println(pa);
String s=sb.toString();

int a =Integer.parseInt(s);
System.out.println(a);
if(pa.equals("PM"))
{
    if(a==12)
{
    sb3.append(12);
}
else
{
    sb3.append(String.format("%02d",24-a));
}
}
else if(pa.equals("AM"))
{
    if(a==12)
    {
        sb3.append("00");
    }
    else{
        sb3.append(String.format("%02d", a));
    }
}
sb3.append(sb4);
System.out.println(sb3);
    }
}

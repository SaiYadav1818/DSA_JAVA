
//97 to 122
public class camelCase {
    public static void main(String[] args) {
        int count=0;
        String  s="saveYourWord";
      for (int i = 0; i < s.length(); i++) {
        char c=s.charAt(i);
        /*int num =(int) s.charAt(i);
        if (num >= 65 && num <= 90) {
            count++;
        }*/
        if(Character.isUpperCase(c))
        {
            count++;
        }
    }
    System.out.println(count+1);
    }
}

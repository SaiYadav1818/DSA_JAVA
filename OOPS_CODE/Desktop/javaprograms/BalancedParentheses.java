import java.util.Scanner;
import java.util.Stack;

public class BalancedParentheses {
    public boolean bal(String str){
 Stack<Character> char1 =new Stack<>();
 for(char ch:str.toCharArray())
 {
    if(ch=='{'||ch=='['||ch=='(')
    {
        char1.push(ch);
    }
    else if(ch==')'||ch=='}'||ch==']')
    {
if(char1.isEmpty())
{
    return false;
}
char top=char1.pop();

if((ch==')'&&top!='(')||(ch=='}'&&top!='{')||(ch==']'&&top!='[')){
    return false;
    }
 }   
}

return char1.isEmpty();
}

    public static void main(String[] args) {
        BalancedParentheses obj =new BalancedParentheses();
        Scanner sc =new Scanner(System.in);
        String str1=sc.next();
        if(obj.bal(str1))
        {
            System.out.println("Balanced pranthsis");
        }
        else{
            System.out.println(" not Balanced pranthsis");
        }
    }
}

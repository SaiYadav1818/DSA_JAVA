package mypackage;
import Myinterace.*;
import java.util.Random;
public class PacinterfaceUsage implements interfaceUsage {
        
  
 Random ran = new Random();
 int ask()
 {
    int prob=(int) (100 * ran.nextDouble());
    if(prob<30)
    {
        return NO;
    }
    else if (prob <60)
    {
        return YES;
    }
    else if(prob<75)
    {
        return LATER;
    }
    else if(prob<90)
    {
        return SOON;
    }
    else{
        return NEVER;
    }
 }
  
}


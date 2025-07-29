interface Playable {
    // Declare the abstract method "play" that classes implementing this interface must provide
    void play();
}
class Football implements Playable
{
  public void play()
  {
    System.out.println("Playing football");
  }
}
class Basketball implements Playable
{
  public void play()
  {
    System.out.println("Playing basketball");
  }
}
class Volleyball implements Playable
{
  public void play()
  {
    System.out.println("Playing volleyball");
  }
}
public class interface2 {
    public static void main(String[] args) {
        // Create instances of Playable objects for football, volleyball, and basketball
      Football obj = new Football();
        Playable volleyball = new Volleyball();
        Playable basketball = new Basketball();

        // Call the "play" method on each Playable object to play different sports
       obj.play();
        volleyball.play();
        basketball.play();
    }
}
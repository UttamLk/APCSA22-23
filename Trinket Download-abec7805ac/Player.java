/*
 * Activity 2.5.2
 * 
 * A Player class the PhraseSolverGame
 */
import java.util.Scanner;

public class Player
{
  /* your code here - attributes */
  private String name = ""; 
  private int points;
  /* your code here - constructor(s) */ 
  public Player(String inputName)
  {
    name = inputName;
    points = 0;
    System.out.println("Hello "+name+" and welcome to the game!");
  }
  
  public Player(Player p)
  {
    Scanner name = new Scanner(System.in);
    System.out.println("Enter your name");
    String namer = name.next();
    p.name = namer;
  }
  /* your code here - accessor(s) */ 
  public String getName(){
    return name; //public accessor for returning the name using getName
  }
  public int getPoints(){
    return points; //public acessor for returning points using getPoints 
  }

  /* your code here - mutator(s) */ 
  public void setName(String inputName){/* incomplete */}
  public void addToPoints(int points){/* incomplete */}
}
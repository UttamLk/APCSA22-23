/*
 * Activity 2.5.2
 * 
 * A Player class the PhraseSolverGame
 */
import java.util.Scanner;

public class Player
{
  /* your code here - attributes */
  public String name = "";
  public String firstname = "";
  public String lastname = "";
  public int points;
  /* your code here - constructor(s) */ 
  public Player(String inputName)
  {
    name = inputName;
  }
  
  public Player(Player p)
  {
    name = p.name;
    p.name = "Overwritten Name";
  }
  /* your code here - accessor(s) */ 

  /* your code here - mutator(s) */ 
}
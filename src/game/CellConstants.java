package game;
import java.lang.String;
/**
 * @autor desirée
 * @version 1.0
 */
public final class BoatsStatus{
  public static final String WATER_TYPE = "water";
  public static final String CARRIER_TYPE = "carries";
  public static final String BATTLESHIP_TYPE = "water";
  public static final String CRUISER_TYPE = "cruiser";
  public static final String SUBMARINE_TYPE = "submarine";
  public static final String DESTROYER_TYPE = "destroyer";
  public static final char WATER_CHAR = '^';
  public static final char FOG_CHAR = '^';
  public static final char BOAT_CHAR = '^';
  private BoatsStatus(){
    throw new AssertionError();
  }
}

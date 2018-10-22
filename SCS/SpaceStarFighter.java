
package SCS;

import java.util.Random;

public class SpaceStarFighter {

  Random ran = new Random();
  int health = 1000;
  int currentHealth;
  boolean isAlive;

  public boolean isAlive() {
    if (currentHealth > 0) {
      return true;
    } else if (currentHealth < 0) {
      return false;
    }
    return isAlive();
  }

  public int getCurrentHealth() {
    return currentHealth;
  }
}
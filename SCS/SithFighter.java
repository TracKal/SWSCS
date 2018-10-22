package SCS;

public class SithFighter extends SpaceStarFighter {

  public int attack(SpaceStarFighter SSF) {

    int attack = ran.nextInt(100) + (500 / 10) - (250 / 10);
    if (SSF.health > 0) {
      SSF.currentHealth = (SSF.health - attack);
      SSF.health -= attack;
      isAlive = true;
    } else if (SSF.currentHealth <= attack) {
      SSF.currentHealth -= attack;
      isAlive = false;
    }
    return attack;
  }

  int missle(SpaceStarFighter SSF) {

    int missle = ran.nextInt(400) + (500 / 10) - (250 / 10);
    if (SSF.health > 0) {
      SSF.currentHealth = (SSF.health - missle);
      SSF.health -= missle;
      isAlive = true;
    } else if (SSF.currentHealth <= missle) {
      SSF.currentHealth -= missle;
      isAlive = false;
    }
    return missle;
  }
}
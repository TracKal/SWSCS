package SCS;

public class SithFighter extends SpaceFighter {

  public int attack(SpaceFighter SF) {

    int attack = ran.nextInt(100) + (500 / 10) - (250 / 10);
    if (SF.health > 0) {
      SF.currentHealth = (SF.health - attack);
      SF.health -= attack;
      isAlive = true;
    } else if (SF.currentHealth <= attack) {
      SF.currentHealth -= attack;
      isAlive = false;
    }
    return attack;
  }

  int missle(SpaceFighter SF) {

    int missle = ran.nextInt(400) + (500 / 10) - (250 / 10);
    if (SF.health > 0) {
      SF.currentHealth = (SF.health - missle);
      SF.health -= missle;
      isAlive = true;
    } else if (SF.currentHealth <= missle) {
      SF.currentHealth -= missle;
      isAlive = false;
    }
    return missle;
  }
}
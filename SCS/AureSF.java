package SCS;

public class AureSF extends SpaceFighter {

  int attack(SpaceFighter SF) {
    int attack = ran.nextInt(500) + (500 / 10) - (250 / 10);
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

  int missileBarrage(SpaceFighter SF) {

    int missleBarrage = ran.nextInt(800) + (1000 / 10) - (250 / 10);
    if (SF.health > 0) {
      SF.currentHealth = (SF.health - missleBarrage);
      SF.health -= missleBarrage;
      isAlive = true;
    } else if (SF.currentHealth <= missleBarrage) {
      SF.currentHealth -= missleBarrage;
      isAlive = false;
    }
    return missleBarrage;
  }
}
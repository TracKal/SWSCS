package SCS;

public class AureSF extends SpaceStarFighter {

  int attack(SpaceStarFighter SSF) {
    int attack = ran.nextInt(500) + (500 / 10) - (250 / 10);
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

  int missileBarrage(SpaceStarFighter SSF) {

    int missleBarrage = ran.nextInt(800) + (1000 / 10) - (250 / 10);
    if (SSF.health > 0) {
      SSF.currentHealth = (SSF.health - missleBarrage);
      SSF.health -= missleBarrage;
      isAlive = true;
    } else if (SSF.currentHealth <= missleBarrage) {
      SSF.currentHealth -= missleBarrage;
      isAlive = false;
    }
    return missleBarrage;
  }
}
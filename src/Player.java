public class Player {
    enum Weapon {
        SWORD,
        AXE,
        BOW
    }

    class Player {
        private String name;
        private int healthPercentage;
        private Weapon weapon;

        public Player(String name, int healthPercentage, Weapon weapon) {
            this.name = name;
            this.healthPercentage = Math.max(0, Math.min(100, healthPercentage));
            this.weapon = weapon;
        }

        public int healthRemaining() {
            return healthPercentage;
        }

        public void loseHealth(int damage) {
            healthPercentage = Math.max(0, healthPercentage - damage);
            if (healthPercentage == 0) {
                System.out.println(name + " player has been knocked out of the game");
            }
        }

        public void restoreHealth(int healthPotion) {
            healthPercentage = Math.min(100, healthPercentage + healthPotion);
        }
    }
}

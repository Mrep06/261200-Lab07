public class Character {
    private int health;
    private int stamina;
    private int maxHealth;
    private int maxStamina;

    public Character(int maxHealth, int maxStamina) {
        this.maxHealth = maxHealth;
        this.maxStamina = maxStamina;
        this.health = maxHealth;
        this.stamina = maxStamina;
        System.out.println("Character created with " + health + " health and " + stamina + " stamina.");
    }

    public int getHealth() {
        return health;
    }
    public int getStamina() {
        return stamina;
    }

    public void swingSword() {
        this.stamina -= 10;

        if(this.stamina <= 0) {
            if (this.stamina == 0) {
                this.stamina = 0;
                System.out.println("Character swings the sword. Stamina is now " + this.stamina + ".");
                System.out.println("Your character needs to cool down.");
            }
            if (this.stamina < 0) {
                this.stamina = 0;
                System.out.println("Character can't swing the sword. Stamina is now " + this.stamina + ".");
                System.out.println("Your character needs to cool down.");
            }
        }else {
            System.out.println("Character swings the sword. Stamina is now " + this.stamina + ".");
        }
    }

    public void takeDamage(int damageAmount) {
        this.health -= damageAmount;
        if(this.health <= 0) {
            if (this.health == 0) {
                this.health = 0;
                System.out.println("Character takes " + damageAmount + " damage. Health is now " + this.health + ".");
                System.out.println("Character is dead.");
            }
            if (this.health < 0) {
                this.health = 0;
                System.out.println("Character takes " + damageAmount + " damage. Health is now " + this.health + ".");
                System.out.println("Character is dead. Wait! is this monster just teabagging you?");
            }
        }else {
            System.out.println("Character takes " + damageAmount + " damage. Health is now " + this.health + ".");
        }
    }

    public void rest() {
        this.health = this.maxHealth;
        this.stamina = this.maxStamina;
        System.out.println("Character has rested. Health and stamina restored to maximum.");
        System.out.println("Character's health: " + this.health + ", stamina: " + this.stamina + ".");
    }
}
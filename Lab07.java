import java.util.Random;
public class Lab07 {
    public static void main(String[] args) {
        Character myHero = new Character(100, 50);
        Random random = new Random();
        int surprise_damage = random.nextInt(100)+1;
        System.out.println("--- Testing Swing Sword ---");
        myHero.swingSword(); // เหลือ 40
        myHero.swingSword(); // เหลือ 30
        myHero.swingSword(); // เหลือ 20
        myHero.swingSword(); // เหลือ 10
        myHero.swingSword();// เหลือ 0 (Trigger pass out)
        myHero.swingSword();// เหลือ 0

        System.out.println("\n--- Testing Take Damage ---");
        myHero.takeDamage(30); // เหลือ 70
        myHero.takeDamage(50); // เหลือ 20
        myHero.takeDamage(20); // เหลือ 0 (Trigger death)
        myHero.takeDamage(surprise_damage); // เหลือ 0

        System.out.println("\n--- Testing Rest ---");
        myHero.rest();

    }
}
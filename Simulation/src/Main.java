import creature.base.animals_basics.Creature;
import creature.base.animals_basics.FlyingCreature;
import creature.base.animals_basics.HuntingCreature;
import creature.base.animals_basics.JumpingCreature;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("hello! what creature would you like the best to be created?");
        System.out.println("1) bird");
        System.out.println("2) wolf");
        System.out.println("3) frog");
        int input = scanner.nextInt();
        Creature creature;
        switch (input)
        {
            case 1:
            {
                creature = new FlyingCreature();
            }
            break;
            case 2:
            {
                creature = new HuntingCreature();
            }
            break;
            case 3:
            {
                creature = new JumpingCreature();
            }
            break;
            default:
                throw new IllegalStateException("Unexpected value: " + input);
        }
        creature.start(scanner);
        
    }
}

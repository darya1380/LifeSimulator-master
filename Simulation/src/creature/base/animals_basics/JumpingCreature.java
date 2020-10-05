package creature.base.animals_basics;

import creature.base.actions.Jump;
import creature.intelligent.SpecialFrog;

import java.util.Scanner;

public class JumpingCreature extends Creature implements Jump
{
    private int jumpWill;
    private int jumpSkill;
    public JumpingCreature()
    {
        this.jumpWill = 0;
        this.jumpSkill = 0;
    }
    @Override
    public void jump() {
        if(this.jumpSkill > 5)
        {
            System.out.println("you did it");
            this.jumpWill += 50;
            this.jumpSkill += 1;
        }
        else
        {
            System.out.println("that was fine!");
            this.jumpWill += 10;
        }
    }

    @Override
    public void learn()
    {
        switch ((int)(Math.random() *  2 + 1))
        {
            case 1:
            {
                System.out.println("you were so talented");
                this.jumpWill += 50;
                this.jumpSkill += 2;
            }
            break;
            case 2:
            {
                System.out.println("that was good for now");
                this.jumpWill += 5;
            }
            break;
        }

    }

    @Override
    public void start(Scanner scanner)
    {
        System.out.println("1) jump");
        System.out.println("2) learn");
        System.out.println("3) evaluate");
        System.out.println("4) eat");
        int in = scanner.nextInt();
        switch (in)
        {
            case 1: jump();
            break;
            case 2: learn();
            break;
            case 3: evaluate();
            break;
            case 4: eat();
            break;
            default: start(scanner);
            break;
        }

    }

    @Override
    protected void evaluate() {
        if(this.jumpWill > 120 && this.jumpSkill > 5)
        {
            System.out.println("ready for evaluation");
            System.out.println("--------------------");
            SpecialFrog specialFrog = new SpecialFrog();
            specialFrog.setId(this.getId());
            specialFrog.start(new Scanner(System.in));
        }
        else
        {
            this.start(new Scanner(System.in));
        }
    }

    @Override
    protected void eat()
    {
        System.out.println("wow...");
        this.hungerNeed += 50;
    }
}

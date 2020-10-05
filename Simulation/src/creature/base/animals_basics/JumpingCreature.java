package creature.base.animals_basics;

import creature.base.actions.Jump;

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

    }

    @Override
    public void learn() {

    }

    @Override
    public void start(Scanner scanner) {

    }

    @Override
    protected void evaluate() {

    }

    @Override
    protected void eat() {

    }
}

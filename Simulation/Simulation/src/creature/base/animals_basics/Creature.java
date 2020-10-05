package creature.base.animals_basics;

public abstract class Creature
{
    private static int primaryId = 1000;
    private int id;
    public Creature()
    {
        primaryId++;
        this.id = primaryId;
    }
    public int getId()
    {
        return this.id;
    }
    public abstract void evaluate();
}

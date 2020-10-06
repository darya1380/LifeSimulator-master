import creature.base.animals_basics.FlyingCreature;
import org.junit.Test;
import static org.junit.Assert.*;
//todo i don't know why are we using this tests
//todo i mean we have main method and it, works actually!
//todo and for sure my methods return void so there is no point in writing tests!
//todo is junit really useful while there is no TDD?
public class Tests
{
    @Test
    public void test()
    {
        FlyingCreature fly = new FlyingCreature();
        fly.learn();
        assertEquals(fly.getId(), 1001);
    }
}

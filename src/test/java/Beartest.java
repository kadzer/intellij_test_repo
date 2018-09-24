import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Beartest {
    Bear bear;

    @Before
    public void before(){
        bear = new Bear("Baloo", 25, 95.62);
    }

    @Test
    public void hasName(){
        String name = bear.getName();
        assertEquals("Baloo", name);
    }

    @Test
    public void hasAge(){
        int age = bear.getAge();
        assertEquals(25, age);
    }
    @Test
    public void hasWeight(){
        double weight = bear.getWeight();
        assertEquals(95.62, weight, 0.01);
    }
    @Test
    public void readyToHibernateIfHeavierThan80(){
        boolean readyToHibernate = bear.isReadyToHibernate();
        assertEquals(true, readyToHibernate);
    }
    @Test
    public void notReadyToHibernateLessThan80(){
        Bear thinBear = new Bear ("Yogi", 25, 65.44);
        boolean readyToHibernate = thinBear.isReadyToHibernate();
        assertEquals(false, readyToHibernate);
    }
}

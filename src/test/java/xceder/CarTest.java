package xceder;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @author: Mac
 * Date: 2018-02-05
 * Time: 下午2:14
 */
public class CarTest {
    private Car car;
    @Before
    public void setUp() throws Exception {
        car = new Car("五菱宏光",111,4);
    }

    @Test
    public void getName() {
        assertEquals("五菱宏光",car.getName());
    }

    @Test
    public void getSpeed() {
        assertEquals(111,111);
    }

    @Test
    public void getWheel() {
        assertNotNull(car.getWheel());
    }
}

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class MyTest {

    @Test
    public void square() {
        assertEquals(4, Math.square(2) );
        assertEquals(9, Math.square(3));
        assertEquals(25, Math.square(-5));
    }

    @Test
    public void cube() {
        assertEquals(8, Math.cube(2));
        assertEquals(27, Math.cube(3));
        assertEquals(-125, Math.cube(-5));
    }

    public int tryPower(int x, int y) {
        try {
            return Math.power(x, y);
        }
        catch (Exception e) {
            System.exit(1);
        }
        return 0;
    }

    @Test
    public void power() {
        assertEquals(64, tryPower(2, 6));
        assertEquals(125, tryPower(5, 3));

        assertEquals(4, tryPower(-2,2));
        assertThrows(Math.NegativeInNegativePowerException.class, () -> Math.power(-2, -2));

        assertEquals(0, tryPower(0, 5));
        assertThrows(Math.ZeroInNonPositivePowerException.class, () -> Math.power(0, 0));
        assertThrows(Math.ZeroInNonPositivePowerException.class, () -> Math.power(0, -5));
    }
    
    @Test
    public void powerExtra() {
        assertEquals(1, tryPower(1, 200));
        assertEquals(0, tryPower(0, 200));
    }

}



import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalTest {

    @Test
    void basicUnitTest1() {
        Cal cal = new Cal();
        int ret = cal.getSum(10, 20);
        assertEquals(30, ret);
    }
    
    @Test
    void basicUnitTest2() {
        Cal cal = new Cal();
        int ret = cal.getSum(10, 20);
        assertEquals(30, ret);
    }
}
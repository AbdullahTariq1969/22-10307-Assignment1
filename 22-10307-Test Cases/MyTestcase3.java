import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class MyTestcase3 {

    public static int mul(int num1, int num2) {
        return num1 * num2;
    }

    @Test
    public void testcase3(){
        System.out.println("Test case 3");

        assertEquals(6, mul(3, 2));
    }


}

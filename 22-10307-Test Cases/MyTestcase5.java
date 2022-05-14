import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class MyTestcase5 {
    public static int pow(int num1, int num2) {
        if (num1 == 0 || num2 == 0)
            return 1;
        else
            return num1 * pow(num1, num2 - 1);
    }

    @Test
    public void testcase5(){
        System.out.println("Test case 5");

        assertEquals(9, pow(3, 2));
    }


}

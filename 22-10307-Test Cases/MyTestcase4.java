import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class MyTestcase4 {
    public static int div(int num1, int num2) {
        return num1 / num2;
    }

    @Test
    public void testcase4(){
        System.out.println("Test case 4");

        assertEquals(3, div(6, 2));
    }


}

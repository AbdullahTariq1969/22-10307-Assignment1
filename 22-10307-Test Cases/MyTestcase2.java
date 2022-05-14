import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class MyTestcase2 {
    
    public static int sub(int num1, int num2) {
        return num1 - num2;
    }

    @Test
    public void testcase2(){
        System.out.println("Test case 2");

        assertEquals(1, sub(3, 2));
    }


}

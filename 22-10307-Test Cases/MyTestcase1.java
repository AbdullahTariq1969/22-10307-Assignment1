import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class MyTestcase1 {

    public static int add(int num1, int num2) {
        return num1 + num2;
    }

    @Test
    public void testcase1(){
        System.out.println("Test case 1");
        
        assertEquals(5, add(3, 2));
    }

    

}

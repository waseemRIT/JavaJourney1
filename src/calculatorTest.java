import org.junit.jupiter.api.Test;
import org.junit.platform.commons.annotation.Testable;

import static org.junit.jupiter.api.Assertions.*;


@Testable
class calculatorTest{

    @Test
        public  void additionTest(){
        // Set up
        float num1 = 99.0f;
        float num2 = 1.0f;
        float expected1 = 100.0f;

        // Invoke
        float actual = (float) calculator.addition(num1, num2);

        // Analyze
        assertEquals(expected1, actual);
    }
   @Test
   public void subtraction(){

        // SetUp
        float num1 = 5;
        float num2 = 7;
        float expected2 = 3;

        // Invoke
        float actual2 = (float) calculator.subtraction(num1, num2);

        // Analyze
       assertEquals(actual2, expected2);




   }

}
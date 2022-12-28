import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestSumCalculator {
    SumCalculator sumCalculator;

    @BeforeEach
    public void createSumCalculator() {
        sumCalculator = new SumCalculator();
    }

    @Test
    public void sumWorksCorrectOne() {
        //given
        int n = 1;
        //then
        Assertions.assertEquals(1, sumCalculator.sum(n));
    }

    @Test
    public void sumWorksCorrectSix() {
        //given
        int n = 3;
        //then
        Assertions.assertEquals(6, sumCalculator.sum(n));
    }

    @Test
    public void sumExpectedException() {
        //given
        String exceptionMessage = "argument value must be > 0";
        //when
        IllegalArgumentException thrown = Assertions.assertThrows(IllegalArgumentException.class, () -> {
            sumCalculator.sum(0);
        });
        //then
        assertTrue(thrown.getMessage().contentEquals(exceptionMessage));

    }
}
package string;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StringAddCalculatorTest {

    @Test
    void splitAndSumNullOrEmpty() {
        int result1 = StringAddCalculator.splitAndSum(null);
        Assertions.assertThat(result1).isEqualTo(0);

        int result2 = StringAddCalculator.splitAndSum("");
        Assertions.assertThat(result2).isEqualTo(0);
    }

    @Test
    void splitAndSumSingle_number() {
        int result1 = StringAddCalculator.splitAndSum("1");
        Assertions.assertThat(result1).isEqualTo(1);
    }

    @Test
    void splitAndSumComma() {
        int result1 = StringAddCalculator.splitAndSum("1,2");
        Assertions.assertThat(result1).isEqualTo(3);
    }

    @Test
    void splitAndSumCommaOrColumn() {
        int result1 = StringAddCalculator.splitAndSum("1,2:3");
        Assertions.assertThat(result1).isEqualTo(6);
    }

    @Test
    void splitAndSumCustomSeparator() {
        int result1 = StringAddCalculator.splitAndSum("//;\n1;2;3");
        Assertions.assertThat(result1).isEqualTo(6);
    }

    @Test
    void negative() {
        assertThrows(RuntimeException.class, () -> StringAddCalculator.splitAndSum("-1"));
    }
}

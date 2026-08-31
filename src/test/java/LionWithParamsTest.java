import com.example.Feline;
import com.example.Lion;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public class LionWithParamsTest {
    @ParameterizedTest
    @ValueSource(strings = {"Самец","Самка"})
    void testDoesHaveMane(String sex) throws Exception {
        Feline feline= new Feline();
        Lion lion = new Lion(feline,sex);
        boolean mane = "Самец".equals(sex);
        assertEquals(mane , lion.doesHaveMane());
    }
    @Test
    void testLionConstructorThrowsException() {
        Feline feline = new Feline();
        assertThrows(Exception.class, () -> new Lion(feline,"лол кек"));
    }
}

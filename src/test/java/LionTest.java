import com.example.Feline;
import com.example.Lion;
import com.example.Lions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class LionTest {
    @Mock
    Feline feline;

    @Test
    void testGetFoodLion() throws Exception {
        Lion lion = new Lion(feline);
        lion.getFood();
        Mockito.verify(feline).eatMeats("Хищник");
    }
    @Test
    void testGetKittensLionsEqualsOne(){
        Feline feline = new Feline();
        Lion lion = new Lion(feline);
        int child = lion.getKittens();
        assertEquals(1,child);
    }
}


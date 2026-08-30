import com.example.Cat;
import com.example.Feline;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class CatTest {
    @Mock
    Feline feline;

    @Test
    void testGetFood() throws Exception {
        Cat cat = new Cat(feline);
        cat.getFood();
        Mockito.verify(feline).eatMeat();
    }
    @Test
    void testCatSoundLikeCat(){
        Feline real = new Feline();
        Cat cat = new Cat(real);
        String voice = cat.getSound();
        assertEquals("Мяу",voice);
    }
}


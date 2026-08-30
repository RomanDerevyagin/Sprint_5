import com.example.Feline;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
@ExtendWith(MockitoExtension.class)
public class FelineTest {
    @Test
    void testGetFamilyLikeCat(){
        Feline feline = new Feline();
        String actual = feline.getFamily();
        assertEquals("Кошачьи", actual);
    }
    @Test
    void testGetKittensEqualsOne(){
        Feline feline = new Feline();
        int cats = feline.getKittens();
        assertEquals(1,cats);
    }
    @Test
    void testGetFoodPredator () throws Exception{
        Feline feline = new Feline();
        List<String> animal = feline.eatMeat();
        List<String> animalActual = List.of("Животные", "Птицы", "Рыба");
        assertEquals(animal, animalActual);

    }
    @Test
    void testGetFoodLion () throws Exception{
        Feline feline = new Feline();
        List<String> animal = feline.eatMeats("Хищник");
        List<String> animalActual = List.of("Животные", "Птицы", "Рыба");
        assertEquals(animal, animalActual);

    }

}

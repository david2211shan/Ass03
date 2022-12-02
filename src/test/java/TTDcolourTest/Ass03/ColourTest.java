package TTDcolourTest.Ass03;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ColourTest {

    @Test
    @DisplayName("comparing floating points for get colour")
    void comparing_float() {
        Colour colour = new Colour((float) 0.1, (float) 0.2, (float) 0.3);
        assertEquals((float) 0.1, colour.getRed());
        assertEquals((float) 0.2, colour.getGreen());
        assertEquals((float) 0.3, colour.getBlue());
    }
    @Test
    @DisplayName("Does not take negative values")
    void no_negative(){
        assertThrows(IllegalArgumentException.class, () -> new Colour((float) -0.1, (float) 0.2 , (float) 0.3));
        assertThrows(IllegalArgumentException.class, () -> new Colour((float) 0.1, (float) -0.2 , (float) 0.3));
        assertThrows(IllegalArgumentException.class, () -> new Colour((float) 0.1, (float) 0.2 , (float) -0.3));
    }
    @Test
    @DisplayName("Does not take values greater than one")
    void no_valueGreaterThanOne(){
        assertThrows(IllegalArgumentException.class, () -> new Colour((float) 2.1, (float) 0.2 , (float) 0.3));
        assertThrows(IllegalArgumentException.class, () -> new Colour((float) 0.1, (float) 1.2 , (float) 0.3));
        assertThrows(IllegalArgumentException.class, () -> new Colour((float) 0.1, (float) 0.2 , (float) 5.3));
    }
    @Test
    @DisplayName("Check if colour takes an int rbg value ")
    void CheckValueIntRGB(){
        Colour colour = new Colour((int) 10000000);
        assertEquals(10000000, colour.getRGB());
    }
    @Test
    @DisplayName("Check if RGB value is between 0 and 16777215")
    void checkRGBValueCorrect(){
        assertThrows(IllegalArgumentException.class, () -> new Colour((int) -1));
        assertThrows(IllegalArgumentException.class, () -> new Colour((int) 16777220));
    }

}
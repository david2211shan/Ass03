package TTDcolourTest.Ass03;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ColourTest {

    @Test
    @DisplayName("comparing floating points for get colour")
    void comparing_float(){
        Colour colour =  new Colour((float) 0.1, (float) 0.2 , (float) 0.3);
        assertEquals((float) 0.1 , colour.getRed());
        assertEquals((float) 0.2 , colour.getGreen());
        assertEquals((float) 0.3 , colour.getBlue());

}
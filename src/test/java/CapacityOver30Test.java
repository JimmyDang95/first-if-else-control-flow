import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CapacityOver30Test {

    @Test
    public void greaterThan100ReturnsString(){
        //GIVEN
        int personToCheck = 25;
        //WHEN
        String result = CapacityOver30.counter(personToCheck);
        //THEN
        assertEquals("Maximale Personenzahl nicht überschritten", result);
    }
}
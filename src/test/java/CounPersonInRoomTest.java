import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CounPersonInRoomTest {

    @Test
    public void greaterThan100ReturnsString(){
        //GIVEN
        int personToCheck = 25;

        //WHEN
        String result = CountPersonInRoom.counter(personToCheck);

        //THEN
        assertEquals("Maximale Personenzahl nicht überschritten", result);
    }

    @Test
    @DisplayName("AlarmRed")
    public void alarm(){
        //Given
        int
        //When

        //Then
    }
}

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CounPersonInRoomTest {

    @Test
    @DisplayName("AlarmRed")
    public void alarm1(){
        //Given
        int personInRoom = 0;
        String alarmLevel = "Rot";
        //When
        String result = CountPersonInRoom.counter(personInRoom, alarmLevel);
        //Then
        assertEquals("Zu viele Personen", result);
    }

    @Test
    @DisplayName("AlarmYellow")
    public void alarm2(){
        //Given
        int personInRoom = 30;
        String alarmLevel = "Gelb";
        //When
        String result = CountPersonInRoom.counter(personInRoom, alarmLevel);
        //Then
        assertEquals("Maximale Personenzahl nicht überschritten", result);
    }
    @Test
    @DisplayName("AlarmYellow")
    public void alarm3(){
        //Given
        int personInRoom = 31;
        String alarmLevel = "Gelb";
        //When
        String result = CountPersonInRoom.counter(personInRoom, alarmLevel);
        //Then
        assertEquals("Zu viele Personen", result);
    }
    @Test
    @DisplayName("AlarmGreen")
    public void alarm4(){
        //Given
        int personInRoom = 60;
        String alarmLevel = "Grün";
        //When
        String result = CountPersonInRoom.counter(personInRoom, alarmLevel);
        //Then
        assertEquals("Maximale Personenzahl nicht überschritten", result);
    }
    @Test
    @DisplayName("AlarmGreen")
    public void alarm5(){
        //Given
        int personInRoom = 61;
        String alarmLevel = "Grün";
        //When
        String result = CountPersonInRoom.counter(personInRoom, alarmLevel);
        //Then
        assertEquals("Zu viele Personen", result);
    }


}

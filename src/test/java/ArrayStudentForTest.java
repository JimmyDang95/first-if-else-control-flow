import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayStudentForTest {
    @Test
    @DisplayName("checkArray")
    public void checkArray(){
        //Given
        int arraylength = 4;
        //When
        String[] testArray = ArrayStudentFor.arrayTesting(arraylength);
        //Then
        assertEquals(4, testArray.length);
        assertEquals("Students 1", testArray[0]);
        assertEquals("Students 2", testArray[1]);
        assertEquals("Students 3", testArray[2]);
        assertEquals("Students 4", testArray[3]);
    }
}
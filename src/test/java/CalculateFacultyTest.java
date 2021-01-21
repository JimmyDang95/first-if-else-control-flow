import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class CalculateFacultyTest {

    @Test
    public void calculateTheFaculty0 (){

        //Given
        int given = 0;
        //When
        int result = CalculateFaculty.calculate(given);

        //Then
        assertEquals(1, result);
    }

    @Test
    public void calculateTheFaculty1 (){

        //Given
        int given = 1;
        //When
        int result = CalculateFaculty.calculate(given);

        //Then
        assertEquals(1, result);
    }

    @Test

    public void calculateTheFaculty2 (){

        //Given
        int given = 2;
        //When
        int result = CalculateFaculty.calculate(given);

        //Then
        assertEquals(2, result);
    }

    @Test
    public void calculateTheFaculty3 (){

        //Given
        int given = 3;
        //When
        int result = CalculateFaculty.calculate(given);

        //Then
        assertEquals(6, result);
    }
}

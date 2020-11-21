package dssc.assignment.leapyear;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class Convert {


    @ParameterizedTest
    @ValueSource(ints = {1997, 2013, 2001})
    void not_multiples_of_4_to_is_not_leap_year(int year) {
        LeapYear leapYear = new LeapYear();
        assertEquals("is not a leap year", leapYear.convert(year));
    }

    @Test
    void year_1996_to_is_a_leap_year(){
        LeapYear leapYear = new LeapYear();
        assertEquals("is a typical leap year", leapYear.convert(1996));
    }

}

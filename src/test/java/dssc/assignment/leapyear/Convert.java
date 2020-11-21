package dssc.assignment.leapyear;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Convert {

    @Test
    void number_1997_is_not_leap_year(){
        LeapYear leapYear = new LeapYear();
        assertEquals("is not a leap year", leapYear.convert(1997));
    }
    @Test
    void number_2013_is_not_leap_year(){
        LeapYear leapYear = new LeapYear();
        assertEquals("is not a leap year", leapYear.convert(2013));
    }
}

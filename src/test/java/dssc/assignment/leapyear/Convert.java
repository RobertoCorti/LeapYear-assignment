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

    @ParameterizedTest
    @ValueSource(ints = {1996, 2004, 1992})
    void multiples_of_4_to_a_typical_leap_year(int year) {
        LeapYear leapYear = new LeapYear();
        assertEquals("is a typical leap year", leapYear.convert(year));
    }

    @ParameterizedTest
    @ValueSource(ints = {2100, 1900, 2200})
    void multiples_of_4_and_of_100_to_is_not_a_leap_year(int year) {
        LeapYear leapYear = new LeapYear();
        assertEquals("is not a leap year", leapYear.convert(year));
    }

    @ParameterizedTest
    @ValueSource(ints = {2000, 2400, 2800})
    void multiples_of_4_and_of_100_and_of_400_to_is_an_atypical_leap_year(int year) {
        LeapYear leapYear = new LeapYear();
        assertEquals("is an atypical leap year", leapYear.convert(year));
    }
}

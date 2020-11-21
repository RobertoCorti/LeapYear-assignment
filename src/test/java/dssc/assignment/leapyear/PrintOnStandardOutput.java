package dssc.assignment.leapyear;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PrintOnStandardOutput {
    private static final String YEAR_2017_to_2020 = "is not a leap year, is not a leap year, is not a leap year, is a typical leap year\n";

    @Test
    void year_from_1996_to_2020() {
        ByteArrayOutputStream fakeStandardOutput = new ByteArrayOutputStream();
        System.setOut(new PrintStream(fakeStandardOutput));

        LeapYear leapYear = new LeapYear();
        leapYear.print();

        assertEquals(YEAR_2017_to_2020, fakeStandardOutput.toString());
    }
}

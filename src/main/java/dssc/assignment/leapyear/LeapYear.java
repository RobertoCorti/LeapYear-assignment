package dssc.assignment.leapyear;

import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class LeapYear {
    public static void main(String[] args) {

    }

    public String convert(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0){
                    return "is an atypical leap year";
                } else{
                    return "is not a leap year";
                }
            } else {
                return "is a typical leap year";
            }
        }
        else  {
            return "is not a leap year";
        }
    }


    public void print() {
        Stream<String> leapYearsString = IntStream.rangeClosed(2017,2020).mapToObj(this::convert);
        System.out.println(leapYearsString.collect(Collectors.joining(", ")));
    }
}

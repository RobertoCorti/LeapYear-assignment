package dssc.assignment.leapyear;

public class LeapYear {
    public static void main(String[] args) {

    }

    public String convert(int year) {
        if (year % 4 == 0){
            return "is a typical leap year";
        }
        else  {
            return "is not a leap year";
        }
    }
}

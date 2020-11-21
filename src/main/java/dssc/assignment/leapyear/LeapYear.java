package dssc.assignment.leapyear;

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
}

package question4;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class AgeCalculator {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter your age as YYYY-MM-DD");
        String birthdatestr=sc.nextLine();

        LocalDate birthdate=LocalDate.parse(birthdatestr);

        LocalDate currentDate=LocalDate.now();
        Period period=Period.between(birthdate,currentDate);
        System.out.println("Your age is: "+period.getYears()+" Years "+period.getMonths()+" Months "+period.getDays()+" Days.");
        sc.close();
    }
}

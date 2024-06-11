public class LeapYear{
    public static void main(String[] args){
        int year2020 = 366;
        int year2023 = 365;
        int year2024 = 366;

        System.out.println(year2020);
        System.out.println(year2023);
        System.out.println(year2024);

        if(year2024 == year2023 || year2020 == year2023) {
            System.out.println("This is not leap year");
        } else if (year2024 > year2023 || year2024 == year2020 ) {
            System.out.println("This is leap year");
        }

    }
}
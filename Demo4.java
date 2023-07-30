public class Demo4 {
    public static void main(String[] args) {
        
        int day = 28;
        int month = 12;
        int year = 2023;
        int hour = 23;
        int minute = 59;
        int second = 59;

        String color1 = "\033[36m";
        String color2 = "\033[35m";
        String color3 = "\033[32m";
        String color4 = "\033[34m";
        String color5 = "\033[33m";
        String color6 = "\033[31m";
        String colorReset= "\033[0m";
 


        System.out.printf("%s%d%s/%s%d%3$s/%s%d %s%d%3$s:%s%d%3$s:%s%d \n", color1, month, colorReset, color2, day, color3, year, color4, hour, color5, minute, color6, second);

    }
}

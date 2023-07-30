public class Demo6b {
    public static void main(String[] args) {
        
        String colorBlue= "\033[34;1m";
        String colorYellow = "\033[33m";
        String colorReset = "\033[0m";
        String colorRed = "\033[31m";

        String name1 = "Alice";
        String name2 = "Bob";
        int age1 = 24;
        int age2 = 30;

        System.out.printf("%s+-----------------+-----+\n", colorYellow);
        System.out.printf("|%s%-17s%s|%1$s%-5s%3$s|%s \n", colorBlue, "NAME", colorYellow, " AGE", colorReset);
        System.out.printf("%s+-----------------+-----+ \n", colorYellow);
        System.out.printf("|%s%-17s%s|%s% -5d%3$s| \n", colorReset, name1, colorYellow, colorRed, age1);
        System.out.printf("|%s%-17s%s|%s% -5d%3$s| \n", colorReset, name2, colorYellow, colorRed, age2);
        System.out.printf("%s+-----------------+-----+\n", colorYellow);

        
    }
}

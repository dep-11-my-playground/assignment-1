public class Demo5 {
    public static void main(String[] args) {
        
        String color1 = "\033[31m";
        String color2 = "\033[32m";
        String color3 = "\033[33m";
        String color4 = "\033[34m";
        String colorReset= "\033[0m";

        int isbnPart1 = 978;
        int isbnPart2 = 3;
        int isbnPart3 = 16;
        int isbnPart4 = 1484100;

        System.out.printf("%s%d%s-%s%d%3$s-%s%d%3$s-%s%d \n", color1, isbnPart1, colorReset, color2, isbnPart2, color3, isbnPart3, color4, isbnPart4);


    }
}

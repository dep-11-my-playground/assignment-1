public class Demo3 {
    public static void main(String[] args) {

        String color = "\033[31m";
        String reset = "\033[0m";

        int areaCode = 123;
        int nrPart1 = 456;
        int nrPart2 = 7890;
        System.out.printf("%s(%d) %s%d-%d \n", color, areaCode, reset, nrPart1, nrPart2);
    }
}

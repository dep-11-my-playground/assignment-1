public class Demo6c {
    public static void main(String[] args) {

        String boarderColor = "\033[33m";
        String colorReset = "\033[0m";
        String colorResetBold = "\033[0;1m";
        String colorPopulation = "\033[31m";
        String colorGreen = "\033[32m";
        String dash = "-";

        String city1 = "Los Angeles";
        String state1 = "California";
        int population1 = 3966936;

        String city2Part1= "New";
        String city2Part2 = "York";
        int population2 = 8336817;
        
        System.out.printf("%s+%s+%s+%3$s+\n", boarderColor, dash.repeat(17), dash.repeat(13));
        System.out.printf("|%s%-17s%s%s|%1$s%-13s%3$s%4$s|%1$s%-13s%3$s%4$s| \n", colorResetBold, " CITY", colorReset,boarderColor, " STATE", " POPULATION");
        System.out.printf("%s+%s+%s+%3$s+\n", boarderColor, dash.repeat(17), dash.repeat(13));
        System.out.printf("|%s %-16s%s|%1$s %-12s%3$s|%1$s %s%,-12d%3$s| \n", colorReset, city1, boarderColor, state1, colorPopulation,population1);
        System.out.printf("|%s %s %s%-12s%s|%1$s %2$s %3$s%4$-8s%5$s|%s %,-12d%5$s| \n", colorGreen, city2Part1, colorReset, city2Part2, boarderColor, colorPopulation, population2);
        System.out.printf("%s+%s+%s+%3$s+\n", boarderColor, dash.repeat(17), dash.repeat(13));

    }
}

public class Demo6d {
    public static void main(String[] args) {
        
        String boarderColor1 = "\033[33m";
        String boarderColor2 = "\033[32m";
        String resetColor = "\033[0m";
        String resetColorBold = "\033[0;1m";
        String quantityColor = "\033[34m";
        String dash = "-";

        String item1 = "Apples";
        int quantity1 = 5;
        double price1 = 0.99;

        String item2 = "Oranges";
        int quantity2 = 10;
        double price2 = 1.49;

        System.out.printf("%s+%s+%2$s+%s+ \n", boarderColor1, dash.repeat(10), dash.repeat(7));
        System.out.printf("|%s %-9s%s%s|%1$s %-9s%3$s%4$s|%1$s %-6s%3$s%4$s|%3$s \n", resetColorBold, "ITEM",resetColor, boarderColor1, "QUANTITY", "PRICE");
        System.out.printf("%s+%s%s%1$s+%3$s+%2$s%s%1$s+ \n", boarderColor1,boarderColor2, dash.repeat(10), dash.repeat(7));
        System.out.printf("|%s %-9s%s|%s%9d %1$s%3$s| %s$%1$s%-5.2f%3$s| \n", resetColor, item1, boarderColor1, quantityColor, quantity1, boarderColor2, price1);
        System.out.printf("|%s %-9s%s|%s%9d %1$s%3$s| %s$%1$s%-5.2f%3$s| \n", resetColor, item2, boarderColor1, quantityColor, quantity2, boarderColor2, price2);
        System.out.printf("%s+%s%s%1$s+%3$s+%2$s%s%1$s+ \n", boarderColor1,boarderColor2, dash.repeat(10), dash.repeat(7));

    }
}

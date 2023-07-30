public class Demo6a {
    public static void main(String[] args) {
        
        String backgrndColor1 = "\033[41m";
        String backgrndColor2 = "\033[42m";
        String fontColor1 = "\033[0m";

        System.out.printf("%s[%s%1$s%4d%s%-4s]%s \n", backgrndColor1, fontColor1, 5, backgrndColor2, "0%", fontColor1);
    }
}

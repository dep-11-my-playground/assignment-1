public class Demo6a {
    public static void main(String[] args) {
        
        String backgrndColor1 = "\033[41m";
        String backgrndColor2 = "\033[42m";
        String backgrndColorReset = "\033[0m";


        System.out.printf("%s[%4d%s%-4s]%s \n", backgrndColor1, 5, backgrndColor2, "0%", backgrndColorReset);
    }
}

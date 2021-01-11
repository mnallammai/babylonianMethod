import java.util.*;
public class Babylonianmethod {
    public double findSquareRoot(double number){
        double guess=number/2;
        while(guess-(number/guess)>0.000001){
            guess=(guess+(number/guess))/2;
        }
        return guess;

    }
    public static void main(String[] args) {
        int inputNumber;
        System.out.println("Enter the number to find square root:");
        Babylonianmethod bm=new Babylonianmethod();
        Scanner scan=new Scanner(System.in);
        double input=scan.nextInt();
        System.out.println(bm.findSquareRoot(input));
    }
}

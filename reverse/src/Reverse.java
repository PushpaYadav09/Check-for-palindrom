 import java.util.*;
public class Reverse {
    public static void main(String[] args) {
        int l;
        int rev=0;
        int sum = 0;
        System.out.println("Enter a number:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int act=n;
        while (n != 0) {
            l = n % 10;
            rev=(rev*10)+n%10;
            n = n / 10;

        }
        System.out.println("reverse =" + rev);
        if(act==rev){
            System.out.println("Its a Palindrom");
        }
        else{
            System.out.println("Its not a Palindrom");
        }
    }
}

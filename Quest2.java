
import java.util.Scanner;

public class Quest2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        int a=1;
        for(int i=1;i<=num;i++){
            a=a*i;
        }
        System.out.println(num+"! = "+a);
    }
}

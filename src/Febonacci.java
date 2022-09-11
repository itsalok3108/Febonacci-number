import java.util.Scanner;

public class Febonacci {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=0;
        int b=1;
        int count=2;
        int c =0;
        System.out.println("Febonacci numbers are: ");
        while (count<=n){
            c=a+b;
            a=b;
            b=c;

             count++;
            System.out.println(c+" ");
        }
        System.out.println("The "+n+"th febonacci no. is: "+c);
    }
}

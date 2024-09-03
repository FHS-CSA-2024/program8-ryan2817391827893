import java.util.Scanner;
public class program8{

    
public static void main(){
    Scanner s = new Scanner(System.in);
    int a;
    int b;
    System.out.println("give first int:");
    a = s.nextInt();
    System.out.println("give second int:");
    b = s.nextInt();
    System.out.println("sum is "+(a+b));
    System.out.println("difference is "+(a-b));
    System.out.println("product is "+a*b);
    System.out.println("average is "+((double)(a+b)/2));
    System.out.println("distance is "+Math.abs(b-a));
    System.out.println("max is "+((a+b+Math.abs(b-a))/2));
    System.out.println("min is "+((a+b-Math.abs(b-a))/2));
}

}
//Paste console output below:
/*
give first int:
13
give second int:
20
sum is 33
difference is -7
product is 260
average is 16.5
distance is 7
max is 20
min is 13

*/

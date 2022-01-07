import java.util.Scanner;
class AddInteger{
public static void main(String []args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter two integer number : ");
int num1 = sc.nextInt();
int num2 = sc.nextInt();
int result = num1 + num2;
System.out.println("Addition of two numbers is : " + result);
sc.close();
}
}
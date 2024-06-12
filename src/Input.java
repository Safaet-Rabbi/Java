import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Age: ");
        byte age = sc.nextByte();
        System.out.println("Your are " + age);
        Scanner scname = new Scanner(System.in);
        System.out.println("Name: ");
        String name = scname.nextLine();
        System.out.println("You are : " + name);
    }
}

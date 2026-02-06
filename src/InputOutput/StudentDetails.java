import java.util.Scanner;

public class StudentDetails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        int usn = sc.nextInt();
        System.out.println("Name: " + name);
        System.out.println("USN: " + usn);
    }
}

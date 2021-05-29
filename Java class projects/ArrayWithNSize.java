import java.util.Scanner;

class NSizeArrayDemo {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter arry size:");
        String s1[]=new String[sc.nextInt()];
        try {
            for (int i = 0; i < 2; i++) {
                System.out.println("Enter name of " + (i + 1) + " Person");
                s1[i] = sc.next();
            }
        } catch (Exception ex) {
        }
        System.out.println("Displaying name of all Person and replacing character 'i' to 'l'.");
        for (int i = 0; i < 2; i++) {
            System.out.println(s1[i].replace('i','l'));
        }
    }
}
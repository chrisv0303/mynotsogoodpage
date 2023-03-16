public class Main {
    public static void main(String[] args) {

        int distance = 15;
        String Fee = "Your fee is: ";
        if (distance >= 0 && distance <=4) {
            System.out.println(Fee + "$2");
        } else if (distance <= 15 && distance > 5) {
            System.out.println(Fee + "$5");
        } else if (distance <= 25 && distance > 16) {
            System.out.println(Fee + "$10");
        } else if (distance <= 50 && distance > 25) {
            System.out.println(Fee + "$15");
        } else if (distance > 50) {
            System.out.println(Fee + "$20");
        } else {
            System.out.println("Invalid");
        }
    }
}

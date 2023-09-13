import java.util.Scanner;
public class New_Area {
        int length;
        int width;

        public New_Area() {
        }


        public void length(int length , int width) {
            this.length = length;
            this.width=width;
        }


        public int calculate() {
            return length * width;
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter the length of the rectangle: ");
            int length = sc.nextInt();

            System.out.println("Enter the breadth of the rectangle: ");
            int width = sc.nextInt();

            New_Area area = new New_Area();
            area.length(length,width);

            int Rectangle =area.calculate();
            System.out.println("The area of the rectangle is " +Rectangle);

        }
    }


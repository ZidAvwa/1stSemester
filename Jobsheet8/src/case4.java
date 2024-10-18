public class case4 {
    public static void main() {
        int letter = 65; 
        int row = 5;

        for (int i = 1; i <= row; i++) {
            for (int j = row - i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print((char) letter + " "); 
                letter++; //to go to the next letter
            }
            System.out.println(); //to print enter
        }
    }
}

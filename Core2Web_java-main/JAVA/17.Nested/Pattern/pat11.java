class Pat11 {
    public static void main(String[] args) {
        int num = 1;  // Variable to print numbers
        char letter = 'A';  // Variable to print letters

        for (int i = 1; i <= 4; i++) {
            // Use a different loop based on the row number (odd or even)
            for (int j = 1; j <= 3; j++) {
                if (i % 2 != 0) {
                    // For odd rows, print numbers
                    System.out.print(num++ + " ");
                } else {
                    // For even rows, print letters
                    System.out.print(letter++ + " ");
                }
            }
            System.out.println();  // Move to the next line after each row
        }
    }
}


/*
1 2 3
A B C
4 5 6
D E F
*/

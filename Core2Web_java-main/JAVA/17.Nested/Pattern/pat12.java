/*
A B C D
a b c d
A B C D
a b c d
*/

class Pat12 {
    public static void main(String[] args) {
        char ch = 'a';  // Variable to print numbers
        char letter = 'A';  // Variable to print letters

        for (int i = 1; i <= 4; i++) {
            // Use a different loop based on the row number (odd or even)
            for (int j = 1; j <= 3; j++) {
                if (i % 2 != 0) {
                    // For odd rows, print numbers
                    System.out.print(ch++ + " ");
                } else {
                    // For even rows, print letters
                    System.out.print(letter++ + " ");
                }
            }
            System.out.println();  // Move to the next line after each row
        }
    }
}


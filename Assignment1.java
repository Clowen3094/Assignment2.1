package session2;

class Assignment1{


public static void main(String args[])
{
for (int rows = 1; rows <= 5; rows++) { // it will run up to 5 times
            for (int columns = 1; columns <= 5; columns++) {
                if (columns == rows) {
                    System.out.print("*");
                } else if (columns == 5 - (rows - 1)) {
                    System.out.print("*"); // proper naming conventions and indentation is taken care.
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
    }


}


}
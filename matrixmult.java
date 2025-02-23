import java.util.Scanner;
import java.util.Random;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileWriter;


public class matrixmult {
    public static void main(String[] args) {
       
    Scanner scanner = new Scanner(System.in);

    Random random = new Random();

    boolean run = true;

    System.out.println("\nWelcome to the random matrix maker!\n");

    while (run) {
    System.out.println("An integer you enter will be the number of rows and columns for 2 randomly generated square matrices.\n");
    System.out.println("Note that you may only enter positive integers from 1 to 100. Enter -1 to exit.");
    System.out.println("\nEnter any integer when you are ready.\n");

    int squareRnC = scanner.nextInt();

    if ((squareRnC < 1 || squareRnC > 100) && (squareRnC != -1)) {
        System.out.println("Please enter a valid input from 1 to 100.");
    }
    else if (squareRnC == -1) {
        System.out.println("Exit successful.");
        run = false;
    }
    else if (squareRnC >= 1 && squareRnC <= 100) {
        
    System.out.println("\nMatrix 1:\n");

    //Create matrix 1 for the matrix.txt file

    int[][] matrix1 = new int[squareRnC][squareRnC];

    try (BufferedWriter bWriter1 = new BufferedWriter(new FileWriter("matrix1.txt"))) {
        for (int i = 0; i < squareRnC; i++) {
            String createRow = " ";
            for (int j = 0; j < squareRnC; j++) {
            matrix1[i][j] = random.nextInt(100);

            if (j == 0) {
                createRow = matrix1[i][j] + " ";
            }
            else {
                createRow = createRow + "\t" + matrix1[i][j];
            }
        }
        
        bWriter1.write(createRow);
        bWriter1.newLine();
        }

        }
        catch (IOException e) {
            System.out.println("\nError. Please enter a valid input (an integer from 1 to 100)");
        }

        try (BufferedReader bReader1 = new BufferedReader(new FileReader("matrix1.txt"))) {
            String line;
            while ((line = bReader1.readLine()) != null) {
               System.out.println(line);
        }
        }
        catch (IOException e) {
            System.out.println("");
        }

        System.out.println("\nMatrix 2:\n");

        //Create matrix 2 for the matrix2.txt file

        int[][] matrix2 = new int[squareRnC][squareRnC];

        try (BufferedWriter bWriter2 = new BufferedWriter(new FileWriter("matrix2.txt"))) {
            for (int k = 0; k < squareRnC; k++) {
                String createRow = " ";
                for (int m = 0; m < squareRnC; m++) {
                matrix2[k][m] = random.nextInt(100);
    
                if (m == 0) {
                    createRow = matrix2[k][m] + " ";
                }
                else {
                    createRow = createRow + "\t" + matrix2[k][m];
                }
            }
        bWriter2.write(createRow);
        bWriter2.newLine();
            }
    
        }
        catch (IOException e) {
        System.out.println("");
        }

        try (BufferedReader bReader2 = new BufferedReader(new FileReader("matrix2.txt"))) {
            String line;
            while ((line = bReader2.readLine()) != null) {
                System.out.println(line);
        }
        }
        catch (IOException e) {
            System.out.println("");
        }


    //Multiply matrix 1 and 2 and store the result in the matrix3.txt file

    System.out.println("\nMatrix 3:\n");

    int[][] matrix3 = new int[squareRnC][squareRnC];
    
    try (BufferedWriter bWriter3 = new BufferedWriter(new FileWriter("matrix3.txt"))) {
       for (int n = 0; n < squareRnC; n++) {
            for (int p = 0; p < squareRnC; p++) {
                int sum = 0;
                for (int q = 0; q < squareRnC; q++) {
                    sum = sum + (matrix1[n][p] * matrix2[q][p]);
                }
                if (p == squareRnC - 1) {
                    bWriter3.write(sum + " ");
                }
                else {
                    bWriter3.write(sum + "\t");
                }
            }
            bWriter3.newLine();
            }
        
        }
        catch (IOException e) {
            System.out.println("");
        }

        try (BufferedReader bReader3 = new BufferedReader(new FileReader("matrix3.txt"))) {
            String line;
            while ((line = bReader3.readLine()) != null) {
                System.out.println(line);
             }
        }
        catch (IOException e) {
            System.out.println("");
        }
        
        System.out.println("\nCheck the files matrix1.txt and matrix2.txt to see your first 2 matrices.");
        System.out.println("Check out the file matrix3.txt to see matrix 3, which is matrix1 multipled by matrix 2.\n");
        System.out.println();

        }
        }
        scanner.close();
            
            }
        }

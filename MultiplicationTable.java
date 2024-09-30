import java.util.Scanner;

public class MultiplicationTable{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the size of the multiplication table: ");
        int size = input.nextInt();
        
        int [][] table = new int[size][size];
        
        for (int i = 1; i <= size; i++){
            for (int j = 1; j <= size; j++){
                table[i - 1] [j - 1] = i*j;
            }
        }
        
        System.out.println("Multiplication Table:");
        for (int i = 0; i < size; i++){
            for (int j = 0; j < size; j++){
                    System.out.printf("%4d", table[i][j]);
            }
            System.out.println();
        }
        
        input.close();
    }
}
import java.util.Scanner;

public class GetArrayMean{
    public static void main(String[] args) {
        int sum = 0;
        Scanner input = new Scanner(System.in);
    
        System.out.print("Enter number of elements: ");
        int n = input.nextInt();
    
        int[] numbers = new int[n];
    
        for (int i = 0; i < n; i++){
            System.out.print("Enter number: ");
            numbers[i] = input.nextInt();
        }
        
        for (int num : numbers){
            sum += num;
        }
        double mean = (double) sum/numbers.length;
        
        System.out.printf("Mean of array is: %.2f", mean);
        input.close();
    }
}
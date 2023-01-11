import java.util.Scanner;

public class FirstVertically_ThenHorizontally_rotatedHalfPyramid {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter no. of rows : ");
        int n = s.nextInt();
        s.close();

        for(int i=0; i<n; i++){
            for(int j=1; j<=i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=n-i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
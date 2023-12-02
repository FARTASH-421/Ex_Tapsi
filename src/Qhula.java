import java.util.Scanner;

public class Qhula {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();

        long  [][] list = new long[n][m];
        boolean check = true;

        for (int i =0; i< n; i++){
            for (int j=0; j<m; j++){
                list[i][j] = input.nextLong();
            }
        }

        for (int i =1; i< n-1; i++){
            for (int j=1; j<m-1; j++){
                long num = list[i][j];
                if((num > list[i][j-1]) && (num >  list[i][j+1]) && (num > list[i+1][j])
                        && (num >  list[i-1][j]) && (num > list[i-1][j-1]) && (num> list[i+1][j+1]) &&
                        (num > list[i-1][j+1]) && (num > list[i+1][j-1]) ){
                    check = false;
                    System.out.println((i+1)+ " "+(1+j));
                }


            }
        }
        if(check)
            System.out.println("No Gholle Found");

    }
}

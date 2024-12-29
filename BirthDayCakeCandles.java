import java.util.Scanner;

public class BirthDayCakeCandles {
    // this is hacker rank problem
    //Mountblue challenge
    //15th problem
   // You are in charge of the cake for a child's birthday. You have decided the cake will have one candle for each year of
    //their total age. They will only be able to blow out the tallest of the candles. Count how many candles are tallest.
    /*Example
    candles =[2,3,4,1,4];
    in
        The maximum height candles are 5 units high. There are 2 of them, so return 2.

        Function Description

        Complete the function birthdayCakeCandles in the editor below.

        birthdayCakeCandles has the following parameter(s):

        int candles[n]: the candle heights
        Returns

        int: the number of candles that are tallest
        Input Format

        The first line contains a single integer,n, the size of candles.
        The second line contains n space-separated integers, where each integer i describes the height of candles[i].*/

    static int caluclateCandles(int[] arr){
        int maxHeight =0;
        int count =0;
        for(int height : arr){
            if(height>maxHeight){
                maxHeight = height;
            }
        }
        for(int candles : arr){
            if(candles == maxHeight){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of candles: ");
        int n = scanner.nextInt();// to store length;
        System.out.println("Enter the candle heights:");
        int [] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i]=scanner.nextInt();
        }

        int res = caluclateCandles(arr);
        System.out.println("the total maxheight is : "+ res);
    }

}

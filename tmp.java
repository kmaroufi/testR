import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by maroufi on 2/26/2016.
 */
public class tmp
{
    public static void main(String[] args)
    {
//        Scanner scan = new Scanner(System.in);
//        int a = scan.nextInt();
//        String b = scan.next();
//        System.out.printf("a = %d, b = %s", a, b);
        String a = new String("mank");
//        char b = a[2];
//        a.charAt(2)
//        a = a.substring(1,2);
        System.out.println(a);
        ArrayList<Integer> sag = new ArrayList<>();
        int[][] arr = {{2, 1}, {5, 2}, {5, 6}};
        int[] my = {3, 4, 6, 8, 10};
        a = String.valueOf(345);
        System.out.println(a);
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i][0] + " " + arr[i][1]);
//        }
//        System.out.println("\n");
//        Arrays.sort(arr[1]);
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i][0] + " " + arr[i][1]);
//        }
//        System.out.println(arr[2][1]);
        System.out.println(Arrays.binarySearch(arr[1], 324324));
    }
}

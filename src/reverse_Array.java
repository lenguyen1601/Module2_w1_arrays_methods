import java.util.Arrays;
import java.util.Scanner;

public class reverse_Array {

//    public static void main(String[] args) {
//        int a[]= new int [5];
//        Scanner sc = new Scanner(System.in);
//        for(int i = 0; i<10;i++){
//            a[i] = sc.nextInt();
//
//        }
//        for (int i=9; i>=0 ; i--){
//            System.out.println(a[i]+"");
//        }
//    }
//}

    public static void main(String[] args) {
        int[] src = {0, 1, 2, 3, 4, 5};
//       System.out.println(Arrays.toString(src));

        /*Đảo ngược mảng trong Java bằng vòng lặp*/
        for (int i = 0, j = src.length - 1; i < j; i++, j--){
            /*Tạo biến temp và tiến hành hoán đổi phần tử*/
            int temp = src[i];
            src[i]  = src[j];
            src[j] = temp;
        }

        System.out.println(Arrays.toString(src));

    }
}

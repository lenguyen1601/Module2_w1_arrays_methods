import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[]src={1,2,3,4,5};
        for (int i=0,j=src.length-1;i<j;i++,j--){
        int temp=src[i];
        src[i]=src[j];
        src[j]=temp;
    }
        System.out.println(Arrays.toString(src));
    }
}
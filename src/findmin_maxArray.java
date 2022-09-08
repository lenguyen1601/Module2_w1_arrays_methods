public class findmin_maxArray {
    public static void main(String[] args) {
        int number[] = new int[]{23,12,5,8,9,105,6,59};
        int min = number[0];
        int max =number[0];

        for (int i =0;i<number.length;i++){
            if (number[i]<min){
                min=number[i];
            }
            if(number[i]>max){
                max = number[i];
            }
        }
        System.out.println("gia tri lon nhat la:"+min);
        System.out.println("gia tri lon nhat la: "+max);
    }
}


import java.util.Scanner;

public class find_elementArray {
    public static void main(String[] args) {
        String[] students = {"Nguyen", "Long", "Hoang", "Tu", "Duong", "Duc", "Tuan", "Nhung"};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap ten hoc sinh:");
        String input_name = scanner.nextLine();
        boolean isExist = false;
        for (int i = 0; i < students.length; i++) {
            if (students[i].equals(input_name)) {
                System.out.println("Vi tri cua hoc sinh"   + input_name +    "trong danh sach la: " + i);
                isExist = true;
                break;
            }
        }
        if (!isExist) {
            System.out.println("Khong tim thay" + input_name + " trong danh sach.");
        }
    }
}

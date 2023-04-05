import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class Reverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Khai báo Stack...
        Stack<String> stackChuoi = new Stack<String>();
        // Nhập chuỗi...
        System.out.println("Nhập chuỗi: ");
        String s = scanner.nextLine();
        // Đảo ngược chuỗi TITV...
        for (int i = 0; i < s.length(); i++) {
            stackChuoi.add(s.charAt(i) + "");
            // charAt dùng để lấy kí tự tại 1 ví trí cụ thể...
        }
        System.out.println("Reverse: ");
        for (int i = 0; i < s.length(); i++) {
            System.out.print(stackChuoi.pop());
            // pop lấy ra xoá khỏi stack...
        }

//
//        // Tách Số...interger
//        Stack<Integer> integerStack = new Stack<Integer>();
//        System.out.println("Số lượng số thêm vào danh sách: ");
//        Integer num = scanner.nextInt();
//        for (int i = 0; i < num; i++) {
//            System.out.println("Nhập trong dãy: ");
//            int s = scanner.nextInt();
//            integerStack.add(s);
//        }
//        System.out.println("Dãy số gồm: "+integerStack);
//
//        System.out.println("Reverse: ");
//        for (int i = 0; i < num; i++) {
//            System.out.print(integerStack.pop());
//            // pop lấy ra xoá khỏi stack...
//        }
    }
}

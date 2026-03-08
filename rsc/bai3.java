import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            // nhập tổng số người
            System.out.print("Nhập tổng số người dùng: ");
            int tongSoNguoi = sc.nextInt();

            // nhập số nhóm
            System.out.print("Nhập số nhóm muốn chia: ");
            int soNhom = sc.nextInt();

            // vùng nguy hiểm
            int moiNhom = tongSoNguoi / soNhom;

            System.out.println("Mỗi nhóm có: " + moiNhom + " người");
        }
        catch (ArithmeticException e) {
            System.out.println("Không thể chia cho 0!");
        }

        // chương trình vẫn chạy tiếp
        System.out.println("Chương trình vẫn tiếp tục chạy sau khi xử lý lỗi.");

        sc.close();
    }
}
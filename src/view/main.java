package view;

import ghifile.File;
import manager.ProductManager;
import model.Product;

import java.util.List;
import java.util.Scanner;

public class main {
    static ProductManager object = new ProductManager();
    static File obj = new File();
    private static List<Product> arr = ProductManager.arr;

    static {
        Product sp1 = new Product(1, "Thịt trâu gác bếp", 50, 3, "Thơm ngon đến miếng cuối cùng");
        Product sp2 = new Product(2, "Xương sườn hổ nanh kiếm", 100, 2, "Thơm ngon đến giọt cuối cùng");
        Product sp3 = new Product(3, "Nhím tiền sử", 1200, 1, "Ngon tuyệt cú mèo");
        Product sp4 = new Product(4, "Thịt voi ma mút", 300, 1, "Giòn dai sần sật ");
        Product sp5 = new Product(5, "Thịt cá mập trắng", 90, 2, "Ở biền như ở nhà, ship mọi miền tổ quốc");
        arr.add(sp1);
        arr.add(sp2);
        arr.add(sp3);
        arr.add(sp4);
        arr.add(sp5);

    }

    public static void main(String[] args) {

        while (true){
            System.out.println("---Trương trình quản lý sản phẩm---");
            System.out.println("Chọn chức năng theo số để tiếp tục:");
            System.out.println("1 - Xem danh sách:");
            System.out.println("2 - Thêm mới");
            System.out.println("3 - Cập nhập:");
            System.out.println("4 - xóa");
            System.out.println("5 - Sắp xếp");
            System.out.println("6 - Tìm kiếm sản phẩm đắt nhất");
            System.out.println("7 - Đọc file");
            System.out.println("8 - Ghi file");
            System.out.println("9 - thoát");
            System.out.println("******************");

            try {
                Scanner scanner = new Scanner(System.in);
                Scanner scanner1 = new Scanner(System.in);
                System.out.println("Mời bạn chọn");
                int check1 = scanner.nextInt();
                switch (check1) {
                    case 1:
                        object.display(arr);
                        break;
                    case 2:
                        object.addProduct();
                        break;
                    case 3:
                        System.out.println("Mời bạn nhập tên sp muốn sửa:");
                        String name1 = scanner1.nextLine();
                        object.editProduct(arr, name1);
                        return;
                    case 4:
                        System.out.println("Mời bạn nhập id sp muốn xóa:");
                        int id1 = scanner.nextInt();
                        object.deleteProduct(arr, id1);
                        return;
                    case 5:
                    case 6:
                        System.out.println("Thông tin sp đắt nhất là:");
                        object.searchProduct(arr);
                        return;
                    case 7:
                    case 8:
                        System.out.println("Ghi file");
                        obj.outPut(arr);
                    case 9:
                        System.out.println("Thoát");
                        return;
                }
            } catch (Exception e) {
                System.out.println("Đề nghị bạn nhập đúng theo mẫu.");
            }
        }

    }
}

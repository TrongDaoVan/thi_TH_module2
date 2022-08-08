package manager;

import model.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductManager {
    public static List<Product> arr = new ArrayList<>();

//    hiển thị sp
    public void display(List<Product> arr){
        for (int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i));
        }
    }

//    thêm sp
    public void addProduct(){
        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Mời Bạn nhập địa chỉ id:");
        int id1 = scanner.nextInt();
        System.out.println("Mời bạn nhập tên sản phẩm:");
        String name1 = scanner1.nextLine();
        System.out.println("Mời bạn nhập giá sp:");
        int price1 = scanner.nextInt();
        System.out.println("Mời bạn nhập số lượng sp:");
        int amount1 = scanner.nextInt();
        System.out.println("Mời bạn nhập mô tả sp:");
        String describe1 = scanner1.nextLine();
        Product add = new Product(id1, name1, price1, amount1, describe1);
        arr.add(add);
    }

//    Sửa sp theo tên sp
    public void editProduct(List<Product> arr, String name){
        try {
            for (int i = 0; i < arr.size(); i++) {
                if(arr.get(i).getName().equals(name)) {
                    System.out.println("Bạn muốn sửa thông tin gì nhỉ:");
                    System.out.println("1 - Sửa id");
                    System.out.println("2 - Sửa tên");
                    System.out.println("3 - Sửa giá cả");
                    System.out.println("4 - Sửa số lượng");
                    System.out.println("5 - Sửa mô tả");
                    System.out.println("**********************");
                    System.out.println("Mời Bạn chọn ");
                    Scanner scanner = new Scanner(System.in);
                    Scanner scanner1 = new Scanner(System.in);
                    int check = scanner.nextInt();
                    switch (check){
                        case 1:
                            System.out.println("Địa chỉ id cũ:");
                            System.out.println(arr.get(i).getId());
                            System.out.println("Nhập địa chỉ id mới:");
                            int id1 = scanner.nextInt();
                            arr.get(i).setId(id1);
                            break;
                        case 2:
                            System.out.println("Tên sp cũ:");
                            System.out.println(arr.get(i).getName());
                            System.out.println("Nhập tên sp mới");
                            String name1 = scanner1.nextLine();
                            arr.get(i).setName(name1);
                            break;
                        case 3:
                            System.out.println("Giá sp cũ:");
                            System.out.println(arr.get(i).getPrice());
                            System.out.println("Giá sp mới:");
                            int price1 = scanner.nextInt();
                            arr.get(i).setPrice(price1);
                            break;
                        case 4:
                            System.out.println("Số lượng sp cũ:");
                            System.out.println(arr.get(i).getAmount());
                            System.out.println("Số lượng sản phẩm mới:");
                            int amount1 = scanner.nextInt();
                            arr.get(i).setAmount(amount1);
                            break;
                        case 5:
                            System.out.println("mô tả cũ:");
                            System.out.println(arr.get(i).getDescribe());
                            System.out.println("Mô tả mới:");
                            String describe1 = scanner1.nextLine();
                            arr.get(i).setDescribe(describe1);
                            break;
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("Không có sp này");
        }
    }

//    Xóa sp theo id
    public void deleteProduct(List<Product> arr, int id){
        for (int i = 0; i < arr.size(); i++) {
            if(arr.get(i).getId() == id){
                arr.remove(i);
            }
        }
    }

//    tìm kiếm sản phẩm có giá đắt nhất
    public void searchProduct (List<Product> arr){
        int max = arr.get(0).getPrice();
        int stt = 0;
        for (int i = 0; i <arr.size() ; i++) {
            if(max < arr.get(i).getPrice()){
                max = arr.get(i).getPrice();
                stt = i;
            }
        }
        System.out.println(arr.get(stt));
    }
}

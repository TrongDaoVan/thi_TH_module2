package ghifile;

import model.Product;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

public class File {
    //    ghi file theo tên sản phẩm
    public void outPut(List<Product> arr, String name){
        try {
            ObjectOutputStream obj = new ObjectOutputStream(new FileOutputStream("trongqk.txt"));
            for (int i = 0; i <arr.size(); i++) {
                if(arr.get(i).getName().equals(name)){
                    obj.writeObject(arr.get(i));
                }

            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

//    Lấy dữ liệu trong file
public void inPut(){
    try {
        ObjectInputStream obj2 = new ObjectInputStream(new FileInputStream("trongqk.txt"));
        Product arr = (Product) obj2.readObject();
        System.out.println(arr);
    } catch (Exception e) {
        throw new RuntimeException(e);
    }

}
}

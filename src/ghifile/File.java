package ghifile;

import model.Product;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.List;

public class File {
    //    ghi file theo tên sản phẩm
    public void outPut(List<Product> arr){
        try {
            ObjectOutputStream obj = new ObjectOutputStream(new FileOutputStream("trongqk.trong"));
            for (int i = 0; i <arr.size(); i++) {
                obj.writeObject(arr.get(i));
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}

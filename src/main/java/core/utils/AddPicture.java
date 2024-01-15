package core.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class AddPicture {
    public static void main(String[] args) {
        try (FileInputStream inputStream = new FileInputStream("/Users/julia/Desktop/Norway.jpg");
             FileOutputStream outputStream = new FileOutputStream("Norway.jpg");
        ) {
            int i;
            while ((i = inputStream.read()) != -1) {
                outputStream.write(i);
            }
            System.out.println("Picture has done");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

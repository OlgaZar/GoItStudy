package HW10_Task2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class TxtToJson {

    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("file2.txt");
        InputStream fis = new FileInputStream(file);
        Scanner scanner  = new Scanner(fis);
        String f = scanner.nextLine();
        List<User> listOfUser = new ArrayList<>();
        while (scanner.hasNext()) {
            String s= scanner.nextLine();
            String [] words = s.split(" ");
            User user = new User(words[0], Integer.parseInt(words[1]));
            listOfUser.add(user);
        }
        System.out.println("listOfUser = " + listOfUser);


    }
}
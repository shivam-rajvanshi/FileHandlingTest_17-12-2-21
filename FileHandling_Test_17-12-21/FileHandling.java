import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandling {
    public static void main(String[] args) {
        File fileInput = new File("C:\\Users\\Mobile Programming\\Desktop\\JavaTest_FileHandling\\RandomInteger.txt");

        try {
            FileWriter fOutput = new FileWriter(
                    "C:\\Users\\Mobile Programming\\Desktop\\JavaTest_FileHandling\\FilteredPrime.txt");
            Scanner sc = new Scanner(fileInput);
            while (sc.hasNextLine()) {
                String integers = sc.nextLine();
                int myNewIntegers = Integer.parseInt(integers);

                boolean flag = false;
                for (int i = 2; i <= myNewIntegers / 2; ++i) {

                    if (myNewIntegers % i == 0) {
                        flag = true;
                        break;
                    }
                }

                if (!flag) {
                    String result = String.valueOf(myNewIntegers);
                    fOutput.write(result + '\n');
                }
            }
            sc.close();
            fOutput.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
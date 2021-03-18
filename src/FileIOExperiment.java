import java.io.File;
import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Scanner;

public class FileIOExperiment {
    public static void main(String[] args) {

        File file = new File("textFile.txt");

        try {

            Formatter formatter = new Formatter(file);

            formatter.format("1. Hey here is text in a file.  Here is $%.2f\n",73.45322);
            formatter.format("2. Hey here is text in a file\n");
            formatter.format("3. Hey here is text in a file\n");
            formatter.format("4. Hey here is text in a file\n");

            formatter.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        readFromFile(file);
    }

    public static void readFromFile(File file)
    {
        try {
            Scanner fileReader = new Scanner(file);

            while (fileReader.hasNext())
            {
                System.out.println(fileReader.nextLine());
            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}

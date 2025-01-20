import java.io.*;

public class Input {
    public static void main(String[] args) throws IOException {
        FileInputStream source = null;
        FileOutputStream destination = null;

        try {
            File sourceFile = new File("sourceFile.txt");
            if (!sourceFile.exists()) {
                System.out.println("Current working directory: " + System.getProperty("user.dir"));

                System.out.println("sourceFile.txt does not exist!");
                return;
            }

            source = new FileInputStream(sourceFile);
            destination = new FileOutputStream("destinationFile.txt");

            int temp;
            while ((temp = source.read()) != -1) {
                destination.write(temp);
            }

            System.out.println("File copied successfully.");
        } finally {
            if (source != null) {
                source.close();
            }
            if (destination != null) {
                destination.close();
            }
        }
    }
}

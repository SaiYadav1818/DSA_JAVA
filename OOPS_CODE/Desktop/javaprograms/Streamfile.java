import java.io.File;
import java.io.IOException;

public class Streamfile {
    public static void main(String[] args) {
        if (args.length > 0) {
            for (int i = 0; i < args.length; i++) {
                File fileToCheck = new File(args[i]);
                try {
                    getPaths(fileToCheck);
                    getInfo(fileToCheck);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        } else {
            System.out.println("Usage: Provide file paths as arguments.");
        }
    }

    public static void getPaths(File f) throws IOException {
        System.out.println("File Name: " + f.getName());
        System.out.println("Parent Directory: " + f.getParent());
        System.out.println("Full Path: " + f.getPath());
    }

    public static void getInfo(File f) throws IOException {
        if (f.exists()) {
            System.out.println("File exists.");
            System.out.println("Readable: " + f.canRead());
            System.out.println("Writable: " + f.canWrite());
            System.out.println("Executable: " + f.canExecute());
        } else {
            System.out.println("File does not exist.");
        }
    }
}


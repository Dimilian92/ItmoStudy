package HW4;

import java.util.Scanner;

public class Reader implements ReaderInterface {

    public abstract static class Handler{
        protected String fileName;
        protected Handler(String fileName){
            this.fileName = fileName;
        }

    public static Handler  getInstace(String fileName) {
        if (fileName.endsWith(".json")) {
            return JSONReader(String fileName);
        } else {
            return XMLReader(String fileName);
        }
    }

    public static void main(String[] args) {
        String fileName;
        Scanner sc = new Scanner(System.in);
        fileName = sc.nextLine();

        Reader reader;
        reader = Reader.Handler(String fileName);

        reader.read(String fileName);
        reader.write(String fileName);
    }
}


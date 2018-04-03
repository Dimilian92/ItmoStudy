package HW4;

public class Reader {

    static String getInstace(String path) {
        if (файл - json) {
            return JSONReader(String path);
        } else {
            return XMLReader(String path);
        }
    }

    public static void main(String[] args) {
        String path;
        Reader reader = Reader.getInstace(String path);

        reader.read();
        reader.write();
    }
}


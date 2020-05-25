import java.io.*;
import java.util.ArrayList;

public class WriteBook<E> extends Thread {
    public ArrayList<E> arrayBook;
    public String path;

    public WriteBook(ArrayList<E> arrayBook, String path) {
        this.arrayBook = arrayBook;
        this.path = path;
    }

    @Override
    public void run() {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(path);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            for (E book : arrayBook) {
                objectOutputStream.writeObject(book);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}




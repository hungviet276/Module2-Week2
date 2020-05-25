import java.io.*;
import java.util.ArrayList;

public class ReadBook<E> extends Thread {
    public ArrayList<E> arrayBook;
    public String path;
    public ReadBook(ArrayList<E> arrayBook,String path){
        this.arrayBook = arrayBook;
        this.path = path;
    }
    public ArrayList<E> getList(){
        return this.arrayBook;
    }
    @Override
    public void run() {
        try {
            FileInputStream fileInputStream = new FileInputStream(path);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            E book = null;
            while ((book= (E) objectInputStream.readObject())!=null){
//                arrayBook.add(book);
                System.out.println(book.toString());
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();

        }
        catch (EOFException e){
            System.out.println("error");
        }catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}

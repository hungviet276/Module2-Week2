import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        ProgrammingBook programmingBook1 = new ProgrammingBook("hoc cach hoc", 250000, "python", "Laravel");
        ProgrammingBook programmingBook2 = new ProgrammingBook("hoc cach choi", 200000, "java", "Ruby on Rails");
        ProgrammingBook programmingBook3 = new ProgrammingBook("hoc cach ngu", 257000, "java", "Spring");
        ProgrammingBook programmingBook4 = new ProgrammingBook("hoc cach di", 255000, "C", "Bootstrap");
        ProgrammingBook programmingBook5 = new ProgrammingBook("hoc cach an", 210000, "java", "Angular JS");

        FictionBook fictionBook1 = new FictionBook("tim cach ngu", 236000, "travel");
        FictionBook fictionBook2 = new FictionBook("tim cach an", 242000, "life");
        FictionBook fictionBook3 = new FictionBook("tim cach choi", 210000, "family");
        FictionBook fictionBook4 = new FictionBook("tim cach di", 102000, "friend");
        FictionBook fictionBook5 = new FictionBook("tim cach bay", 111000, "bar");

        //Tinh tong gia tien
            Book[] books = {programmingBook1, programmingBook2, programmingBook3, programmingBook4, programmingBook5, fictionBook1, fictionBook2, fictionBook3, fictionBook4, fictionBook5};
            double totalPriceOfBooks = 0;
            for (int i = 0; i < books.length; i++) {
                totalPriceOfBooks += books[i].getPrice();
            }
            System.out.println("Total price books: "+totalPriceOfBooks);

        //dem so programming book co language la java
        int countBooks = 0;
        for (int j = 0; j < books.length; j++) {
            if (books[j] instanceof ProgrammingBook) {
                if (((ProgrammingBook) books[j]).getLanguage().equals("java")) {
                    countBooks++;
                }

            }
        }
        System.out.println("So sach Java la "+countBooks);

        //Tao mang FictionBook va ArrayBook
        ArrayList<ProgrammingBook> listProgrammingBook = new ArrayList<>();
        ArrayList<FictionBook> listFictionBook = new ArrayList<>();
      listProgrammingBook.add(programmingBook1);
      listProgrammingBook.add(programmingBook2);
      listProgrammingBook.add(programmingBook3);
      listProgrammingBook.add(programmingBook4);
      listProgrammingBook.add(programmingBook5);

//      listFictionBook.add(fictionBook1);
//      listFictionBook.add(fictionBook2);
//      listFictionBook.add(fictionBook3);
//      listFictionBook.add(fictionBook4);
//      listFictionBook.add(fictionBook5);

        // Write Book
        WriteBook writeProgrammingBook = new WriteBook(listProgrammingBook,"programmingBook.txt");
//        WriteBook writeFictionBook = new WriteBook(listFictionBook,"fictionBook.txt");
        try {
            writeProgrammingBook.start();
            writeProgrammingBook.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
//        writeFictionBook.start();

//        try {
//            ObjectInputStream ois=new ObjectInputStream(new FileInputStream("fictionBook.txt"));
//            FictionBook fb=(FictionBook)ois.readObject();
//            System.out.println(fb.toString());
//        } catch (IOException e) {
//            e.printStackTrace();
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        }
        // Read Book
        ArrayList<ProgrammingBook> arrayProgrammingBook = new ArrayList<>();
//        ArrayList<FictionBook> arrayFictionBook = new ArrayList<>();
        ReadBook<ProgrammingBook> readProgrammingBook = new ReadBook(arrayProgrammingBook,"programmingBook.txt");
//        ReadBook<FictionBook> readFictionBook = new ReadBook(arrayFictionBook,"fictionBook.txt");
        readProgrammingBook.start();
        ArrayList<ProgrammingBook> myList= readProgrammingBook.getList();
        myList.forEach(k -> System.out.println(k));
//        readFictionBook.start();
//        for (Book programmingBook:arrayProgrammingBook
//             ) {
//            System.out.println(((ProgrammingBook)programmingBook).toString());
//
//        }
//        for (Book fictionBook:arrayFictionBook
//             ) {
//            System.out.println(fictionBook.toString());
//
//        }


    }
}

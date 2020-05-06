public class Test {
    public static void main(String[] args) {
        ProgrammingBook pb1 = new ProgrammingBook("hoc cach hoc",250000,"python","abc");
        ProgrammingBook pb2 = new ProgrammingBook("hoc cach choi",200000,"java","xyz");
        ProgrammingBook pb3 = new ProgrammingBook("hoc cach ngu",257000,"java","nnn");
        ProgrammingBook pb4 = new ProgrammingBook("hoc cach di",255000,"C","yyy");
        ProgrammingBook pb5 = new ProgrammingBook("hoc cach an",210000,"java","zzz");

        FictionBook fb1 = new FictionBook("tim cach ngu",236000,"dfdf");
        FictionBook fb2 = new FictionBook("tim cach an",242000,"rgr");
        FictionBook fb3 = new FictionBook("tim cach choi",210000,"dfgg");
        FictionBook fb4 = new FictionBook("tim cach di",102000,"jmghj");
        FictionBook fb5 = new FictionBook("tim cach bay",111000,"err");
       // System.out.println(fb1 instanceof FictionBook);
        //Tinh tong gia tien
    Book[] books = {pb1,pb2,pb3,pb4,pb5,fb1,fb2,fb3,fb4,fb5};
    double price=0;
    for (int i =0; i < books.length;i++){
        price += books[i].getPrice();
    }
        System.out.println(price);
        //dem so programming book co language laf java
        int count =0;
        for (int j =0; j < books.length;j++){
            if (books[j] instanceof ProgrammingBook){
                if (((ProgrammingBook)books[j]).getLanguage().equals("java")){
                    count++;
                }

            }
        }
        System.out.println(count);
        

    }
}

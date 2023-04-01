import java.io.Console;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;


public class Mybook {
    public static void main(String[] args) {
        Console console = System.console();
        Stack<Book> books = new Stack<Book>();

        while(true){
            System.out.println("\n input buku");

            System.out.print("Judul \t: ");
            String title =console.readLine();
            
            System.out.print("Penulis \t: ");
            String author = console.readLine();
            
            System.out.print("Penerbit \t: ");
            String publisher =console.readLine();

            System.out.print("Tahun rilis \t: ");
            int year =Integer.parseInt(console.readLine());

            System.out.println("\n pilih kategori buku: ");
            int no = 1;
            for (String category: Book.CATEGORIES){
                System.out.println(no + ". "+ category);
                no++;
            }
            System.out.print("pilih (1-" + Book.CATEGORIES.length + "):");
            String category = Book.CATEGORIES[Integer.parseInt(console.readLine()) -1];

            books.add(new Book(title, category, author, publisher, year));

            System.out.println("\n=============================BOOKS=========================================");
            System.out.println("No\tTitle\t\t\tAuthor\t\tCategory\t\tPublisher\t\tRelease year");
            System.out.println("===========================================================================");
            no = 1;
            for(Book book: books){
                System.out.print(no + "\t" + book.title + "\t\t\t" + book.author + "\t\t\t" + book.publisher + "\t\t\t" + book.year);
                no++;
            }
            System.out.println("===========================================================================");
            System.out.println("\ninput lagi (ya/tidak)");
            if (!console.readLine().equals("ya")){
                break;
            }
            // buku yang dikelompokan oleh kategori
    HashMap<String, ArrayList<Book>> groupedBooks = new HashMap<>();
    for (Book book: books){
    ArrayList<Book> groupedBook = groupedBooks.get(book.category);
    if (groupedBook == null){
        groupedBooks.put(book.category, new ArrayList<>(Arrays.asList(new Book[] { book })));
    }else{
        groupedBook.add(book);
    }
    }

    int totalOldBooks = 0;
    int totalNewBooks = 0;
    for (Book book: books){
    if (book.year < 2010){
        totalOldBooks++;
    }else{
        totalNewBooks++;
    }
    }

    System.out.println("Total buku: " + books.size());

    for (String categori: Book.CATEGORIES){
    ArrayList<Book> groupedBook = groupedBooks.get(category);
    if (groupedBook == null){
        continue;
    }
    System.out.println(categori + ": " + groupedBooks.get("Teknik").size());
    }
    System.out.println("Buku lama (<2010): " + totalOldBooks);
    System.out.println("Buku baru: " + totalNewBooks);
    }
}
}
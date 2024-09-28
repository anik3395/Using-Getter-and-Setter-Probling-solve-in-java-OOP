public class Main {
    public static void main(String[] args) {

      Book book1 = new Book("Anik", "Physics");
      Book book2 = new Book("Rabbi",500,"Chemistry");

        System.out.println(" The Author of the book is:" + book1.getAuthor());
        System.out.println(" The title of the book is:" +  book1.getTitle());

        System.out.println();

        System.out.println(" The Author of the book is:" + book2.getAuthor());
        System.out.println(" The title of the book is:" + book2.getTitle());
        System.out.println(" The price of the book is:" + book2.getPrice());


    }
}

public class BookApp {
    public static void main(String [] args){

        Book book1=new Book();
/*
        System.out.println("\n\t****** Book ******* ");
        System.out.println("Title: " + book1.title);
        System.out.println("Author: " + book1.getAuthor());
        System.out.println("Description: " + book1.getDescription());

        String display = book1.getDisplayText("Anita Desai",
                "Clear City of the Day","something about Clear City of the Day ");
        System.out.println("\n\t****** Book 1 ******* " + display);
*/
        System.out.println("Price of the Books: $" + book1.calculatePrice(20,5));

    }
}

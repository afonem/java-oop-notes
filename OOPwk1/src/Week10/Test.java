package Week10;

public class Test {

    public static void main(String[] args) {

        Library library = new Library();

        Book book1 = new Book(101, "Pride and Prejudice", "Jane Austen");
        Book book2 = new Book(102, "Little Women", "Louisa May Alcott");

        Magazine magazine1 = new Magazine(201, "Science Monthly", 45);
        Magazine magazine2 = new Magazine(202, "History Today", 12);

        try {
            library.addItem(book1);
            library.addItem(book2);
            library.addItem(magazine1);
            library.addItem(magazine2);

            System.out.println("\nAll Library Items:");
            library.displayAllItems();

            System.out.println("\nSearching item by ID:");
            LibraryItem foundItem = library.searchItem(101);
            foundItem.displayInfo();

            System.out.println("\nSearching item by title:");
            LibraryItem foundTitle = library.searchByTitle("History Today");
            foundTitle.displayInfo();

            System.out.println("\nBorrowing item:");
            library.borrowItem(101);

            System.out.println("\nTrying to borrow same item again:");
            library.borrowItem(101);

            System.out.println("\nReturning item:");
            library.returnItem(101);

            System.out.println("\nRemoving item:");
            library.removeItem(202);

            System.out.println("\nFinal Library Items:");
            library.displayAllItems();

            System.out.println("\nTesting duplicate item:");
            Book duplicateBook = new Book(101, "Duplicate Book", "Unknown Author");
            library.addItem(duplicateBook);

        } catch (ItemNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (DuplicateItemException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }}
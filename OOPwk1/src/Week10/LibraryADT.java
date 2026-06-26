package Week10;

public interface LibraryADT {

    void addItem(LibraryItem item);

    void removeItem(int id) throws ItemNotFoundException;

    LibraryItem searchItem(int id) throws ItemNotFoundException;

    void borrowItem(int id) throws ItemNotFoundException;

    void returnItem(int id) throws ItemNotFoundException;

    void displayAllItems();
}
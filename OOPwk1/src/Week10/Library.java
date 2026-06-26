package Week10;

import java.util.ArrayList;

public class Library implements LibraryADT, Searchable {

    private ArrayList<LibraryItem> items;

    public Library() {
        items = new ArrayList<>();
    }

    @Override
    public void addItem(LibraryItem item) {
        for (LibraryItem existingItem : items) {
            if (existingItem.getId() == item.getId()) {
                throw new DuplicateItemException("Item with this ID already exists.");
            }
        }

        items.add(item);
        System.out.println("Item added successfully.");
    }

    @Override
    public void removeItem(int id) throws ItemNotFoundException {
        LibraryItem item = searchItem(id);
        items.remove(item);
        System.out.println("Item removed successfully.");
    }

    @Override
    public LibraryItem searchItem(int id) throws ItemNotFoundException {
        for (LibraryItem item : items) {
            if (item.getId() == id) {
                return item;
            }
        }

        throw new ItemNotFoundException("Item with ID " + id + " was not found.");
    }

    @Override
    public LibraryItem searchByTitle(String title) throws ItemNotFoundException {
        for (LibraryItem item : items) {
            if (item.getTitle().equalsIgnoreCase(title)) {
                return item;
            }
        }

        throw new ItemNotFoundException("Item with title " + title + " was not found.");
    }

    @Override
    public void borrowItem(int id) throws ItemNotFoundException {
        LibraryItem item = searchItem(id);

        if (item.isBorrowed()) {
            System.out.println("This item is already borrowed.");
        } else {
            item.borrowItem();
            System.out.println("Item borrowed successfully.");
        }
    }

    @Override
    public void returnItem(int id) throws ItemNotFoundException {
        LibraryItem item = searchItem(id);

        if (!item.isBorrowed()) {
            System.out.println("This item was not borrowed.");
        } else {
            item.returnItem();
            System.out.println("Item returned successfully.");
        }
    }

    @Override
    public void displayAllItems() {
        if (items.isEmpty()) {
            System.out.println("Library is empty.");
        } else {
            for (LibraryItem item : items) {
                item.displayInfo();
                System.out.println("----------------------");
            }
        }
    }
}
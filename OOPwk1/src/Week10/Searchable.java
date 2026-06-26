package Week10;

public interface Searchable {

    LibraryItem searchByTitle(String title) throws ItemNotFoundException;
}
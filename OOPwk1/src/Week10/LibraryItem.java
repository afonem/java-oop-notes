package Week10;

public abstract class LibraryItem {

    private int id;
    private String title;
    private boolean borrowed;

    public LibraryItem(int id, String title) {
        this.id = id;
        this.title = title;
        this.borrowed = false;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public boolean isBorrowed() {
        return borrowed;
    }

    public void borrowItem() {
        borrowed = true;
    }

    public void returnItem() {
        borrowed = false;
    }

    public abstract void displayInfo();
}
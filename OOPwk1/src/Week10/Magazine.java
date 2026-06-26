package Week10;

public class Magazine extends LibraryItem {

    private int issueNumber;

    public Magazine(int id, String title, int issueNumber) {
        super(id, title);
        this.issueNumber = issueNumber;
    }

    public int getIssueNumber() {
        return issueNumber;
    }

    @Override
    public void displayInfo() {
        System.out.println("Magazine ID: " + getId());
        System.out.println("Title: " + getTitle());
        System.out.println("Issue Number: " + issueNumber);
        System.out.println("Borrowed: " + isBorrowed());
    }
}
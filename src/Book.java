public class Book {
    String title;
    Status status;

    public Book(String title) {
        this.title = title;
        this.status = Status.AVAILABLE;
    }

    public Status getStatus() {
        return status;
    }
}
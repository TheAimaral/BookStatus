public class Test {
    public static void main(String[] args) {
        Book book1 = new Book("Завтрак у Тиффани");
        BookMover fromAvailableStatusMover = new FromAvailableStatusMover();
        fromAvailableStatusMover.moveToStatus(book1, Status.BORROWED);
        System.out.println(book1.getStatus());

    }
}
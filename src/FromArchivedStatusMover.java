public class FromArchivedStatusMover extends BookMover {
    @Override
    protected void moveToStatus(Book book, Status requestedStatus) {
        switch (book.status) {
            case AVAILABLE:
                break;
            default:
                System.out.println("Перевод книги из статуса 'Х' в статус 'У' не возможен");
                break;
        }
    }
}
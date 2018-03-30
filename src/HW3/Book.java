//package HW3;
//
//public class Book{
//    String author;
//    int pagesNum;
//    String title;
//    int bookQuantity = 0;
//    public Book(String author, String title,int pagesNum ){
//        this.author = author;
//        this.title = title;
//        this.pagesNum = pagesNum;
//    }
//
//    public  int getBook(Book book,int quantity){
//        int available = this.bookQuantity - quantity;
//        if(available < 0){
//            System.out.println(quantity + " книг нет в наличии ");
//            this.bookQuantity = 0;
//            return available*(-1);
//        }else{
//            this.bookQuantity -= quantity;
//            return 0;
//    }
//
//    public void putBook(Book book, int quantity){
//        if(quantity < 0){
//            System.out.println("Невозможно вернуть отрицательное число книг!");
//        }
//        if(quantity+this.bookQuantity <= 500&&quantity < 0){
//            System.out.println("Книги приняты, в размере "+quantity+" штук.");
//            this.bookQuantity = this.bookQuantity + quantity;
//        }
//        else {
//            System.out.println("Нельзя вернуть столько книг! Максимально в библиотеке может принять "+(500-this.bookQuantity)+" экземпляров этой книги!");
//        }
//    }
//
//}
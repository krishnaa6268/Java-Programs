class Book{
    static int totalNoOfBooks;
    String title, author, ISBN;
    boolean isBorrowed;

    static{
        totalNoOfBooks=0;
    }

    {               // object initializer...
        totalNoOfBooks++;
    }

    Book(String title, String author, String ISBN){
        this.title=title;
        this.author=author;
        this.ISBN=ISBN;

    }
    Book(String ISBN){
        this("Unknown", "Unknown", ISBN );
    }


    static int getTotalBooks(){
        return totalNoOfBooks;
    }

    void borrowBook(){
        if(isBorrowed){
            System.out.println("Book is already borrowed...");
        }
        else{
            this.isBorrowed=true;
            System.out.println("Enjoy the Book...");
        }
    }

    void returnBook(){
        if(isBorrowed){
            this.isBorrowed=false;
            System.out.println("Hope you enjoyed, please leave a review...");
        }
        else{
            System.out.println("This book already in the library...");
        }
    }

    public static void main(String[] args) {
        Book Iot = new Book("IOT-Design", "KK", "123");
        Book C = new Book("345");

        System.out.println(Book.totalNoOfBooks);

        Iot.borrowBook();
        C.borrowBook();
        Iot.borrowBook();
        Iot.returnBook();
        Iot.returnBook();
    }

}

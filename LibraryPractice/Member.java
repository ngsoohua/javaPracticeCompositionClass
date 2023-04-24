package LibraryPractice;


import java.util.ArrayList;

public class Member {

    private String id;
    private String name;
    private ArrayList <Book> bookLoan = new ArrayList<>();

    public Member (String id, String name){

        this.id = id;
        this.name = name;

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Book> getBookLoan() {
        return bookLoan;
    }

    public void setBookLoan(ArrayList<Book> bookLoan) {
        this.bookLoan = bookLoan;
    }



    public void loanBook (Book book){

        boolean isFound = false;

        for(Book b : bookLoan){

            if(b.getISBN() == book.getISBN()){
                isFound = true;
            }
        }

        if(!isFound){
            bookLoan.add(book);
        }

    }

    public void returnBook (Book book){

        bookLoan.remove(book);

    }

    public int totalBookLoan(){
        return bookLoan.size();
    }


    public String toString() {
        return String.format("ID : %s, Name: %s ", this.id, this.name) + this.bookLoan;
    }



}

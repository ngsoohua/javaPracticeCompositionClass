package LibraryPractice;

import java.util.HashMap;

public class Library {

    private HashMap <String,Book> bookMap = new HashMap<>();
    private HashMap <String,Member> memberMap = new HashMap<>();


    public Library (){

        Book book1 = new Book("111", "title1", "author1");
        bookMap.put(book1.getISBN(), book1);
        Book book2 = new Book("222", "title2", "author2");
        bookMap.put(book2.getISBN(), book2);
        Book book3 = new Book("333", "title3", "author3");
        bookMap.put(book3.getISBN(), book3);
        Book book4 = new Book("444", "title4", "author4");
        bookMap.put(book4.getISBN(), book4);

        Member member1 = new Member("aaa", "Name1");
        memberMap.put(member1.getId(), member1);
        Member member2 = new Member("bbb", "Name2");
        memberMap.put(member2.getId(), member2);
        Member member3 = new Member("ccc", "Name3");
        memberMap.put(member3.getId(), member3);

    }





    public void addBook (String ISBN, String title, String author){
            Book newBook = new Book(ISBN, title, author);
            bookMap.put(newBook.getISBN(), newBook);
    }

    public HashMap<String, Book> getBooks(){
        return bookMap;
    }

    public Book findBook (String bookId){

        if(bookMap.containsKey(bookId)) {
            return bookMap.get(bookId);
        }
        return null;
    }


    public void addMember(String id, String name){

        Member newMember = new Member(id,name );
        memberMap.put(newMember.getId(), newMember);

    }


    public void loanBookToMember(String memberId, String bookId){

        if(memberMap.containsKey(memberId)){
            Member member = memberMap.get(memberId);
            if(bookMap.containsKey(bookId)){
                Book loanBook = bookMap.get(bookId);
                member.loanBook(loanBook);
            }
        }

    }

    public void returnBookFromMember( String memberId, String bookId){

        if(memberMap.containsKey(memberId)){
            Member member = memberMap.get(memberId);
            if(bookMap.containsKey(bookId)){
                Book returnBook = bookMap.get(bookId);
                member.returnBook(returnBook);
            }
        }

    }

    public Member displayMemberInformation(String memberId){
        if(memberMap.containsKey(memberId)){
            Member member = memberMap.get(memberId);
            return member;

        }

        return null;
    }


    public int totalBookLoan(String memberId){

        int size =0;

        if(memberMap.containsKey(memberId)){
            Member member = memberMap.get(memberId);
            size = member.getBookLoan().size();
        }
        return size;
    }


    public void removeMember(String id){

        if(memberMap.containsKey(id)){
            memberMap.remove(id);
        }
    }


    public void removeBook(String ISBN) {

        if (bookMap.containsKey(ISBN)) {
            bookMap.remove(ISBN);

        }

    }


    public String toString(){

        String memberMapTitle = "List of Library Members : \n";
        String bookMapTitle = "List of Book available in the Library : \n";

        String memberMapDisplay = "";


        for(Member m : memberMap.values()){
            memberMapDisplay += m +"\n";
        }

        String bookMapDisplay = "";


        for(Book b : bookMap.values()){
            bookMapDisplay += b +"\n";
        }

        return memberMapTitle + memberMapDisplay + bookMapTitle + bookMapDisplay;

    }

}

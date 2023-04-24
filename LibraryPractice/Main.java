package LibraryPractice;

public class Main {

    public static void main(String[] args) {

        Library newLibrary = new Library();
        System.out.println(newLibrary);

        newLibrary.addBook("555", "Master HTML", "Jean Looi");
        newLibrary.addBook("666", "Master CSS", "Jean Looi CSS");
        newLibrary.addMember("ddd","member4");

        newLibrary.loanBookToMember("ddd","555");
        newLibrary.loanBookToMember("ddd","666");

        System.out.println(newLibrary);

        //newLibrary.returnBookFromMember("ddd", "555");
        newLibrary.removeMember("bbb");
        newLibrary.removeBook("111");

        System.out.println(newLibrary);

        System.out.println(newLibrary.totalBookLoan("ddd"));

    }

}

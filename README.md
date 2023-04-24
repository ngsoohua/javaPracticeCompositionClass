# javaPracticeCompositionClass

Exercise 2:
A Library ‘has a’ Book and  ‘has a’ Member.

Implement a Library Class, Book Class and Member Class to model a Library system. 
Note: This example does not include the member loan of Book. - BookLoanService Class

A library has many Books (ISBN, title, author) 1 to many relationship
A library has many Members (id, name, age) 1 to many relationship
Can have many Libraries (branches) (branchId,  book(List), member(List)) - SK, Punggol etc


Book Class

Book
- ISBN:String
- title : String 
- author : String
+Book(ISBN:String, title:String, author: String) 
+getISBN(): String
+setISBN(name: String): void
+getTitle(): String
+setTitle(title: String): void
+getAuthor(): String
+setAuthor(author: String): void
+toString(): String


Member Class

Member
-id : String
-name : String
-bookLoan : ArrayList<Book>
+Member(name:String, id:String)
+getName(): String
+setName(name: String): void
+getId():String
+setId(id: String): void
+loanBook(book: Book):void
+returnBook(book:Book):void
+totalBookLoan():int
+getBookLoan():ArrayList<Course>
+toString():String

Library
-bookMap: HashMap<String, Book>
-memberMap: HashMap<String, Member>
+Library()
+addBook(ISBN:String, title:String, author:String): void
+getBooks() : HashMap<String, Book>
+findBook(bookId:String): Book
+addMember(id:String, name:String): void
+loanBookToMember(memberId:String, bookId:String):void
+returnBookFromMember(memberId:String, bookId:String):void
+displayMemberInformation(memberId:String):Student
+totalBookLoan(memberId:String):int
+removeMember(id:String): void
+removeBook(ISBN): void
+toString():String


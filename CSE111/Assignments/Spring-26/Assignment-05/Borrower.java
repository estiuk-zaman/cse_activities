public class Borrower{
  public static int book_count[] = {3, 3, 3};
  public static String book_name[] = {"Pather Panchali", "Durgesh Nandini", "Anandmath"};
  public String name;
  public String [] borrow=new String[3];
  public int count;


  public static void bookStatus(){
    System.out.println("available Books:");
    for(int i=0;i<book_count.length;i++){
        System.out.println(book_name[i]+": "+book_count[i]);
    }
  }

  public Borrower(String name){
    this.name=name;
  }

  public void borrowBook(String book_name_st){
    for(int i=0;i<book_count.length;i++){
        if (book_name_st.equalsIgnoreCase(book_name[i])) {
            if (book_count[i]!=0) {
                borrow[count]=book_name[i];
                book_count[i]-=1;
                count++;
            }
            else{
                System.out.println("This book is not available.");
            }
        }
    }
  }

  public void borrowerDetails(){
    System.out.println("Name: "+ this.name);
    System.out.println("Books Borrowed:");
    for(int i=0;i<count;i++){
        System.out.println(borrow[i]);
    }
  }

  public static int remainingBooks(String book_name_st){
    for(int i=0;i<book_count.length;i++){
        if (book_name_st.equalsIgnoreCase(book_name[i])) {
            return book_count[i];
        }
        }
        return 0;
    }
}
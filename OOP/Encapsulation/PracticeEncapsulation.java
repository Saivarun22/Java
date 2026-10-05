public class PracticeEncapsulation{
    private int pageNo;
    private int Books;
    private String BookName;

    public void setPageNo(int pageNo){
        if (pageNo >70){
            this.pageNo=pageNo;
        }
        else{
            System.out.println("Invalid Page Number");
        }
        }

        public int getpageno(){
            return pageNo;
        }

        public void setBooks(int Books){
            if(Books < 5){
                System.out.println("Rs:500");
                this.Books=Books;
            }
            else{
                System.out.println("Rs 1000");
                this.Books=Books;
            }
        }

        public int getBooks(){
            return Books;
        }

        public void setBookName(String BookName){
            this.BookName=BookName;
        }
        public String getBookName(){
            return BookName;

        }

        public static void main (String args[]){
            PracticeEncapsulation obj = new PracticeEncapsulation();
            obj.setPageNo(90);
            System.out.println(obj.getpageno());
            obj.setBooks(7);
            System.out.println(obj.getBooks());
            obj.setBookName("Java For Beginers");
            System.out.println(obj.getBookName());
        }
        
    }


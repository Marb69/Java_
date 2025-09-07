public class book {
    

    String title;
    String author;
    int yearPublished;

    public book(String title,String author,int yearPublished){

         this.title = title;
         this.author = author;
         this.yearPublished = yearPublished;
    }




    public void displaybook(){

        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Year Publish: " + yearPublished);
    }

    public void isOldbook(){

         if(yearPublished<2015){
            
            System.out.println(title + " Older than 10 years");

         }else{

            System.out.println(title + " Latest book");
         }
    }
}

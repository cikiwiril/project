
package game;


class KOKO {
    int page_num;
    String authorname, Title;
    int price;
    {
        page_num = 50;
        authorname = "Andrew Jones";
        Title = "The Living Ideas";
        price = 60000;        
    }
    public void displayinfo(){
        System.out.println(" the Title of the book is " +Title);
        System.out.println(" the Price of the book is " +price);
        System.out.println(" The Author is " +authorname);
        System.out.println(" Total page of the book is " +page_num);
    }
}    
 class PaperBooks extends KOKO {
     int shippingcharge = 10000;
     
     public void printinfo(){
         displayinfo();//Calling method of the book class
         System.out.println(" The shipping charge is "+shippingcharge);}
         
     public static void main(String[] args) {
         PaperBooks pb = new PaperBooks();
        pb.printinfo();
     }
     }
             
             
 

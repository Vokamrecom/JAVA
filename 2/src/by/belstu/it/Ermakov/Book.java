package by.belstu.it.Ermakov;

public class Book {
    public String name;
    public String author;
    public int year;
    public String pol;

   public Book(){

        name = "неизвестно";
        author = "неизвестно";
        year = 0;
        pol="Мужской";//для инспекции
    }

   public Book(String name, String author, int year){

        this.name = name;
        this.author = author;
        this.year = year;
    }

    public void info(){
        System.out.printf("Книга '%s' (автор %s) была издана в %d году \n", name, author, year);

   /* public String getString()
    {return "Hello from First project";
}

public int deleteString(){
    return 0;


}
*/

}
}
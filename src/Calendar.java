public class Calendar {

    public static void main(String[] args){
        Event e = new Event(24, 8, 1991, "The independence day of Ukraine");
        Event a = new Event(8, 6, 1977, "Happy day");
        Event b = new Event(1, 9, 2024, "Of the knowledge day!");
        Event c = new Event(1, 4, 2024, "The Fool man day!" );
        //Event d = new Event()


        System.out.printf("%s%n",e);
        System.out.printf("%s%n", e);
        System.out.printf("%s%n", a);
        System.out.printf("%s%n", b);
        System.out.printf("%s%n", c);

    }
}

public class Calendar {

    public static void main(String[] args){
        Event e = new Event(24, 8, 1991, "The independence day of Ukraine");
        Event a = new Event(8, 6, 1977, "Happy day");
        Event b = new Event(1, 9, 2024, "Of the knowledge day!");
        Event c = new Event(1, 4, 2024, "The Fool man day!" );
        Event d = new Event(1, 3, 2024, "The first day of the spring");
        Event f = new Event(1, 6, 2024, "The first day of the summer");
        Event g = new Event(1, 9, 2024, "The first day of the autumn");
        Event h = new Event(1, 12, 2024, "The first day of the winter");
        Event i = new Event(25, 12, 2024, "Christmas!");
        Event j = new Event(14, 1, 2025, "An old Christmas!");

        System.out.printf("%s%n",e);
        System.out.printf("%s%n", e);
        System.out.printf("%s%n", a);
        System.out.printf("%s%n", b);
        System.out.printf("%s%n", c);
        System.out.printf("%s%n", d);
        System.out.printf("%s%n", f);
        System.out.printf("%s%n", g);
        System.out.printf("%s%n", h);
        System.out.printf("%s%n", i);
        System.out.printf("%s%n", j);

    }
}

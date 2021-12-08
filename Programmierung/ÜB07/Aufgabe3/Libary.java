package ÜB07.Aufgabe3;

public class Libary {
    public static void main(String[] args) {
        Book harry_potter = new Book();
        harry_potter.setTitle("Harry Potter und der Stein der Weisen");
        harry_potter.setAuthor("J. K. Rowling");
        harry_potter.publish("978-3-551-35401-3", 8.99D);

        Book heimweg = new Book();
        heimweg.setTitle("Der Heimweg");
        heimweg.setAuthor("Sebastian Fitzek");
        heimweg.publish("978-3-426-28155-0", 22.99D);

        Book dry = new Book();
        dry.setTitle("DRY");
        dry.setAuthor("Neal & Jarrod Shusterman");
        dry.publish("978-3-7373-5638-1", 15.00D);

        System.out.println(harry_potter.getTitle() + ", " + harry_potter.getAuthor() + ", " + harry_potter.getIsbn()
                + ", " + harry_potter.getPrice());
        System.out.println(
                heimweg.getTitle() + ", " + heimweg.getAuthor() + ", " + heimweg.getIsbn() + ", " + heimweg.getPrice());
        System.out.println(dry.getTitle() + ", " + dry.getAuthor() + ", " + dry.getIsbn() + ", " + dry.getPrice());

    }

}

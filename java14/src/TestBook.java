public class TestBook {
    public static void main(String[] args) {
        AuthorClass ahTeck = new AuthorClass("Tan Ah Teck", "ahTeck@somewhere.com", 'm');
        System.out.println(ahTeck);


        Book dummyBook = new Book("Java for dummies", ahTeck, 9.99, 99);
        System.out.println(dummyBook);
        // chú ý in chữ nó thêm hơi ảo

        dummyBook.setPrice(8.88);
        dummyBook.setQty(88);
        System.out.println("name is: " + dummyBook.getName());
        System.out.println("price is: " + dummyBook.getPrice());
        System.out.println("qty is: " + dummyBook.getQty());
        System.out.println("author is: " + dummyBook.getAuthorClass());
        System.out.println("author's name is: " + dummyBook.getAuthorClass().getName());
        System.out.println("author's email is: " + dummyBook.getAuthorClass().getEmail());
        System.out.println("author's gender is: " + dummyBook.getAuthorClass().getGender());

        Book moreDummyBook = new Book("Java for more dummies",
                new AuthorClass("Peter Lee", "peter@nowhere.com", 'm'), 19.99, 8);
        System.out.println(moreDummyBook);

    }
}

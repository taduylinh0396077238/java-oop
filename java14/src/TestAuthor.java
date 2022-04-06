public class TestAuthor {
    public static void main(String[] args) {
        // Phương thức khởi tạo kiểm tra và toString ()
      AuthorClass ahTeck = new AuthorClass("Tan An Teck", "teck@nowhere.com", 'm');
        System.out.println(ahTeck);

        ahTeck.setEmail("teck@somewhere.com");
        System.out.println(ahTeck);

        System.out.println("name is: " + ahTeck.getName());
        System.out.println("gender is: " + ahTeck.getGender());
        System.out.println("email is:" + ahTeck.getEmail());
    }
}

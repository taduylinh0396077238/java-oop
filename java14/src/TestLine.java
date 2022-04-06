import java.awt.*;

public class TestLine {
    public static void main(String[] args) {
        // Phương thức khởi tạo kiểm tra và toString ()
        Line l1 = new Line(1, 2, 3, 4);
        System.out.println(l1);
        Line l2 = new Line(new Point(5, 6), new Point(7,8));
        System.out.println(l2);


        l1.setBegin(new Point(11,12));
        l1.setEnd(new Point(13,14));
        System.out.println(l1);
        //Line[begin=(11,12),end=(13,14)]
        System.out.println("begin is: " + l1.getBegin());
        //begin is: (11,12)
        System.out.println("end is: " + l1.getEnd());
        //end is: (13,14)


        l1.setBeginX(21);
        l1.setBeginY(22);
        l1.setEndX(23);
        l1.setEndY(24);
        System.out.println(l1);
        //Line[begin=(21,22),end=(23,24)]
        System.out.println("begin's x is: " + l1.getBeginX());
        //begin's x is: 21
        System.out.println("begin's y is: " + l1.getBeginY());
        //begin's y is: 22
        System.out.println("end's x is: " + l1.getEndX());
        //end's x is: 23
        System.out.println("end's y is: " + l1.getEndY());
        //end's y is: 24

    }
}

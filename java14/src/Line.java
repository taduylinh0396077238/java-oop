import java.awt.*;

public class Line {
    private Point begin;
    private Point end;
//    Xây dựng một cá thể Đường cho 2 điểm tại (x1, y1) và (x2, y2)
    public Line(int x1, int y1, int x2, int y2){
        begin = new Point(x1, y1);
        end = new Point(x2, y2);
    }
    public Line(Point begin, Point end){
        this.begin = begin;
        this.end = end;

    }

    public Point getBegin() {
        return begin;
    }

    public void setBegin(Point begin) {
        this.begin = begin;
    }

    public Point getEnd() {
        return end;
    }

    public void setEnd(Point end) {
        this.end = end;
    }
    public int getBeginX() {
        return begin.getX();  // Point's getX()
    }
    public void setBeginX(int x) {
        begin.setX(x);  // Point's setX()
    }
    public int getBeginY() {
        return begin.getY();  // Point's getY()
    }
    public void setBeginY(int y) {
        begin.setY(y);  // Point's setY()
    }
    public int[] getBeginXY() {
        return begin.getXY();  // Point's getXY()
    }
    public void setBeginXY(int x, int y) {
        begin.setXY(x, y);  // Point's setXY()
    }
    public int getEndX() {
        return end.getX();  // Point's getX()
    }
    public void setEndX(int x) {
        end.setX(x);  // Point's setX()
    }
    public int getEndY() {
        return end.getY();  // Point's getY()
    }
    public void setEndY(int y) {
        end.setY(y);  // Point's setY()
    }
    public int[] getEndXY() {
        return end.getXY();  // Point's getXY()
    }
    public void setEndXY(int x, int y) {
        end.setXY(x, y);  // Point's setXY()
    }

    /** Returns a self-descriptive String */
    public String toString() {
        return "Line[begin=" + begin + ",end=" + end + "]";
        // Invoke begin.toString() and end.toString()
    }

    /** Returns the length of this line */
    public double getLength() {
        return begin.distance(end);  // use Point's distance() method
    }
}

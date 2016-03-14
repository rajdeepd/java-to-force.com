/**
 * Created by ubuntu on 10/3/16.
 */
class Point {
    int x = 1, y = 1;
    void move(int dx, int dy) {
        x += dx;
        y += dy;
        alert();
    }
    void alert(){
        System.out.println("x:" + x + ", " + "y: " + y);
    }
}
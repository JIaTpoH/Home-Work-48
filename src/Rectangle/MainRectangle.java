package Rectangle;

import java.util.ArrayList;


public class MainRectangle {
  public static void main(String[] args) {

    ArrayList<Rectangle> rectangles = new ArrayList<>();
    rectangles.add(new Rectangle(10, 7));
    rectangles.add(new Rectangle(4, 8));
    rectangles.add(new Rectangle(5, 2));
    rectangles.add(new Rectangle(3, 8));

    rectangles.sort(new RectangleAreaComparator());
    for (Rectangle o : rectangles) {
      System.out.println
          ("Length: " + o.getLength() + " Width: " + o.getWidth() + " Area: " + o.getArea() );
    }
  }
}

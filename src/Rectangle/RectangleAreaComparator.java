package Rectangle;

import java.util.Comparator;

public class RectangleAreaComparator implements Comparator<Rectangle> {
  @Override
  public int compare(Rectangle o1, Rectangle o2) {
    int area1 = o1.getArea();
    int area2 = o2.getArea();

    return Integer.compare(area1, area2);
  }
}

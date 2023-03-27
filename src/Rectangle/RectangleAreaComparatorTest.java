package Rectangle;

import org.junit.Test;


public class RectangleAreaComparatorTest {
  public void testEquals() {
    RectangleAreaComparator comparator = new RectangleAreaComparator();
    Rectangle rectangle1 = new Rectangle(3, 4,  );
    Rectangle rectangle2 = new Rectangle(3, 4, );
    assertEquals(0, comparator.compare(rectangle1, rectangle2));
  }
// TODOO

  }
}
// Создать класс Rectangle (прямоугольник),
// которому в конструкторе нужно передавать длину и ширину.
// Написать компаратор, который сравнивает прямоугольники по площади.
// Написать тесты для этого компаратора.


public class Rectangle {
  private int length;
  private int width;

  public Rectangle(int length, int width) {
    this.length = length;
    this.width = width;
  }
}
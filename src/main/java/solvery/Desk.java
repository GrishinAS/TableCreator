package solvery;


import java.util.ArrayList;
import java.util.List;

public class Desk implements Movable {
  private final Point startPoint;
  private final int width;
  private final int length;

  public Desk(int width, int length) {
    this.startPoint = new Point();
    this.width = width;
    this.length = length;
  }

  public List<Point> getCornerPoints() {
    ArrayList<Point> result = new ArrayList<>();
    result.add(new Point(startPoint.getX(), startPoint.getY()));
    result.add(new Point(startPoint.getX(), startPoint.getY() + width));
    result.add(new Point(startPoint.getX() + length, startPoint.getY() + width));
    result.add(new Point(startPoint.getX() + length, startPoint.getY()));
    return result;
  }

  @Override
  public void move(int dx, int dy) {
    startPoint.move(dx, dy);
  }

  public Point getStartPoint() {
    return startPoint;
  }

  public int getWidth() {
    return width;
  }

  public int getLength() {
    return length;
  }

  @Override
  public String toString() {
    return "Desk{" +
      "startPoint=" + startPoint +
      ", width=" + width +
      ", length=" + length +
      '}';
  }
}

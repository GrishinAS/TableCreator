package solvery;

public class MathFunction {
  private float sign(Point p1, Point p2, Point p3)
  {
    return (p1.getX() - p3.getX()) * (p2.getY() - p3.getY()) - (p2.getX() - p3.getX()) * (p1.getY() - p3.getY());
  }

  public boolean pointInTriangle(Point pt, Point v1, Point v2, Point v3) {
    boolean b1, b2, b3;

    b1 = sign(pt, v1, v2) <= 0.0f;
    b2 = sign(pt, v2, v3) <= 0.0f;
    b3 = sign(pt, v3, v1) <= 0.0f;

    return ((b1 == b2) && (b2 == b3));
  }

  public boolean pointInRectangle(Point pt, Point v1, Point v2, Point v3, Point v4) {
    return (pointInTriangle(pt, v1, v2, v3) || pointInTriangle(pt, v1, v3, v4));
  }
}

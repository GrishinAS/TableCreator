package solvery;


import com.google.common.base.Objects;

public class Leg implements Movable {

  private final Point startPoint;
  private final int radius;
  private final int height;

  public Leg(Point startPoint, int radius, int height) {
    this.startPoint = startPoint;
    this.radius = radius;
    this.height = height;
  }

  @Override
  public void move(int dx, int dy) {
    startPoint.move(dx, dy);
  }

  public Point getStartPoint() {
    return startPoint;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Leg leg = (Leg) o;
    return radius == leg.radius && height == leg.height && Objects.equal(startPoint, leg.startPoint);
  }

  @Override
  public int hashCode() {
    return Objects.hashCode(startPoint, radius, height);
  }

  @Override
  public String toString() {
    return "Leg{" +
      "startPoint=" + startPoint +
      ", radius=" + radius +
      ", height=" + height +
      '}';
  }
}

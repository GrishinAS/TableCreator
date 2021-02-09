package solvery;

import com.google.common.base.Objects;

public class Point implements Movable {
  private int x;
  private int y;

  public Point(int x, int y) {
    this.x = x;
    this.y = y;
  }

  public Point() {
    this.x = 0;
    this.y = 0;
  }

  @Override
  public void move(int dx, int dy) {
    x = x + dx;
    y = y + dy;
  }

  public int getX() {
    return this.x;
  }

  public int getY() {
    return this.y;
  }

  public void setX(int x) {
    this.x = x;
  }

  public void setY(int y) {
    this.y = y;
  }

  public String toString() {
    return "Point(x=" + this.getX() + ", y=" + this.getY() + ")";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Point point = (Point) o;
    return x == point.x && y == point.y;
  }

  @Override
  public int hashCode() {
    return Objects.hashCode(x, y);
  }
}

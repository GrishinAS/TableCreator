package solvery;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public class Table {
  private final List<Leg> legs;
  private final Desk desk;

  public Table(List<Leg> legs, Desk desk) {
    checkTablePoint(legs, desk);
    this.legs = legs;
    this.desk = desk;
  }

  public static Table create(Desk desk, int legRadius, int legHeight) {
    List<Leg> tableLegs = getLegsForDesk(desk, legRadius, legHeight);
    return new Table(tableLegs, desk);
  }

  @NotNull
  private static List<Leg> getLegsForDesk(Desk desk, int legRadius, int legHeight) {
    List<Leg> tableLegs = new ArrayList<>();
    for (Point cornerPoint : desk.getCornerPoints()) {
      tableLegs.add(new Leg(cornerPoint, legRadius, legHeight));
    }
    return tableLegs;
  }

  private void checkTablePoint(List<Leg> legs, Desk desk) {
    List<Point> cornerPoints = desk.getCornerPoints();
    for (Leg leg : legs) {
      if (!contains(cornerPoints, leg.getStartPoint())) {
        throw new IllegalArgumentException("Wrong parameters : " + desk +  legs);
      }
    }
  }

  private boolean contains(List<Point> points, Point point) {
    MathFunction mathFunction = new MathFunction();
    return mathFunction.pointInRectangle(point, points.get(0), points.get(1), points.get(2), points.get(3));
  }


  public void move(int dx, int dy) {
    desk.move(dx, dy);
    for (Leg leg : legs) {
      leg.move(dx, dy);
    }
  }

  public List<Leg> getLegs() {
    return legs;
  }

  public Desk getDesk() {
    return desk;
  }

  @Override
  public String toString() {
    return "Table{" +
      "legs=" + legs +
      ", desk=" + desk +
      '}';
  }
}

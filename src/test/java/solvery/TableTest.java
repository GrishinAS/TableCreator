package solvery;

import org.jetbrains.annotations.NotNull;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class TableTest {

  @Test
  void testSuccessfulTableInit() {
    List<Leg> legs = createLegs(0, 0, 100, 200, 0);
    new Table(legs, new Desk(100, 200));
  }

  @Test
  void testFailedTableInit() {
    List<Leg> legs = createLegs(-100, 200, 0, 0, 100);

    Assertions.assertThrows(IllegalArgumentException.class, () ->
      new Table(legs, new Desk(100, 200)));
  }

  @Test
  void testFactoryTableCreation() {
    Desk desk = new Desk(100, 200);
    List<Leg> legs = createLegs(0, 0, 100, 200, 0);

    Table table = Table.create(desk, 10, 70);
    Assertions.assertEquals(desk, table.getDesk());
    Assertions.assertEquals(legs, table.getLegs());
  }

  @NotNull
  private List<Leg> createLegs(int i, int i2, int i3, int i4, int i5) {
    List<Leg> legs = new ArrayList<>();
    legs.add(new Leg(new Point(i, 0), 10, 70));
    legs.add(new Leg(new Point(i2, i3), 10, 70));
    legs.add(new Leg(new Point(i4, 100), 10, 70));
    legs.add(new Leg(new Point(200, i5), 10, 70));
    return legs;
  }
}
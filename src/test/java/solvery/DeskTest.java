package solvery;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class DeskTest {

  Desk testDesk;

  @BeforeEach
  void setUp() {
    testDesk = new Desk(100, 200);
  }

  @Test
  void testCornerPoints() {
    List<Point> expected = new ArrayList<>();
    expected.add(new Point(0, 0));
    expected.add(new Point(0, 100));
    expected.add(new Point(200, 100));
    expected.add(new Point(200, 0));
    List<Point> actual = testDesk.getCornerPoints();
    Assertions.assertEquals(expected, actual);
  }

  @Test
  void checkMove() {
    testDesk.move(100, 200);
    Assertions.assertEquals(new Point(100, 200), testDesk.getStartPoint());
  }

}
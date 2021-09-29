//ID: 45911355  Name: Thien Tran

import java.util.List;

interface MoveStrategy {
  public Cell chooseNextLoc(List<Cell> possibleLocs);
}
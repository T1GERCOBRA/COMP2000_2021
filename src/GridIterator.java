
import java.util.Iterator;

public class GridIterator implements Iterator<Cell> {

    Cell[][] cells;
    int row,column;

    public GridIterator(Cell[][]c){
      cells=c;
      row=0;
      column=0;
    }
    @Override
    public boolean hasNext() {
        
        return row< cells.length && column<cells[row].length;
    }
    @Override
    public Cell next() {
        Cell result = cells[row][column];
        column+=1;
        if(column >= cells[row].length){
            column=0;
            row+=1;
        }
        return result;
    }
}

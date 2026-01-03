package h1;

public class Grid {
    private Cell [] [] gridArray ;
    public Grid(Cell[] cells, int gridRows, int gridCols ){
        gridArray=new Cell[gridRows][gridCols];
        for(int i=0;i<gridArray.length;i++){
            for(int j=0;j<gridArray[i].length;j++){
                gridArray[i][j]=new Cell(i,j,false);
                if(cells!=null){
                for(int k=0;k<cells.length;k++){
                    if(cells[k].getIndexRow()==i&&cells[k].getIndexCol()==j){
                        gridArray[i][j].setAlive(true);
                        break;

                    }


                }
            }

            }
        }
        for(int i=0;i<gridArray.length;i++){
             for(int j=0;j<gridArray[i].length;j++){
                gridArray[i][j].countLivingNeighbors(getGridArray());
             }

        }
       
    }
    public Cell[][] getGridArray() {
        return gridArray;
    }
    public void setGridArray(Cell[][] gridArray) {
        this.gridArray = gridArray;
    }
    public void computeNextGen(){
        for(int i=0;i<gridArray.length;i++){
             for(int j=0;j<gridArray[i].length;j++){
                gridArray[i][j].countLivingNeighbors(this.getGridArray());

             }
            }
         for(int i=0;i<gridArray.length;i++){
             for(int j=0;j<gridArray[i].length;j++){
                gridArray[i][j].setAlive(gridArray[i][j].isAliveNextGen());
             }
            }
        for(int i=0;i<gridArray.length;i++){
             for(int j=0;j<gridArray[i].length;j++){
                gridArray[i][j].countLivingNeighbors(this.getGridArray());

             }
            }
    }
    public void computeGeneration(int n){
        if(n>=0){
        for(int i=0;i<n;i++){
            this.computeNextGen();

        }
        }
    }









}

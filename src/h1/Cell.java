package h1;

public class Cell {
    private int indexRow;
    private int indexCol;
    private boolean alive;
    private int numLivingNeighbors;
    private boolean isAliveNextGen;
    public int getIndexRow() {
        return indexRow;
    }
    public void setIndexRow(int indexRow) {
        this.indexRow = indexRow;
    }
    public int getIndexCol() {
        return indexCol;
    }
    public void setIndexCol(int indexCol) {
        this.indexCol = indexCol;
    }
    public boolean isAlive() {
        return alive;
    }
    public void setAlive(boolean alive) {
        this.alive = alive;
    }
    public int getNumLivingNeighbors() {
        return numLivingNeighbors;
    }
    public void setNumLivingNeighbors(int numLivingNeigbors) {
        this.numLivingNeighbors = numLivingNeigbors;
    }
    public boolean isAliveNextGen() {
        return isAliveNextGen;
    }
    public void setAliveNextGen(boolean isAliveNextGen) {
        this.isAliveNextGen = isAliveNextGen;
    }
    public Cell(int indexRow,int indexCol,boolean alive){
        this.indexRow=indexRow;
        this.indexCol=indexCol;
        this.alive=alive;
        this.numLivingNeighbors = 0;
        this.isAliveNextGen = false;
    }
    public Cell(int indexRow,int indexCol){
        this(indexRow, indexCol, false);

    }
    public void countLivingNeighbors(Cell [][] gridArray){
        int livingNeighbors=0;
        for(int i=this.getIndexRow()-1;i<=this.getIndexRow()+1;i++){
            for(int j=this.getIndexCol()-1;j<=this.getIndexCol()+1;j++){
                if(i>=0&&j>=0&&i<gridArray.length&&j<gridArray[i].length){
                    if(!(i==this.getIndexRow()&&j==this.getIndexCol())){
                        if(gridArray[i][j].isAlive()==true){
                            livingNeighbors++;
                        }
                    }
                }

            }

        }
        this.setNumLivingNeighbors(livingNeighbors);
        this.decideNextStatus();
       
            
         }
 
     private void decideNextStatus(){
        if(this.isAlive()==true){
            if(this.getNumLivingNeighbors()==2||this.getNumLivingNeighbors()==3){
                this.setAliveNextGen(true);

            }
            else{
                this.setAliveNextGen(false);

            }

        }
        else{
            if(this.getNumLivingNeighbors()==3){
                this.setAliveNextGen(true);
            }
            else{
                this.setAliveNextGen(false);

            }
        }

         }

}

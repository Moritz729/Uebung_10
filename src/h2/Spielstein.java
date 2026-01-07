package h2;

public class Spielstein {
    private int currentRow;
    private int currentCol;
    private Spielbrett brett;
    
    public int getCurrentRow() {
        return currentRow;
    }
    public void setCurrentRow(int currentRow) {
        this.currentRow = currentRow;
    }
    public int getCurrentCol() {
        return currentCol;
    }
    public void setCurrentCol(int currentCol) {
        this.currentCol = currentCol;
    }
    public Spielbrett getBrett() {
        return brett;
    }
    public void setBrett(Spielbrett brett) {
        this.brett = brett;
    }
    public  Spielstein(Spielbrett brett, int indexRow, int indexCol){
        currentRow=indexRow;
        currentCol=indexCol;
        this.brett=brett;
    }
    private boolean movesOut(){
        Feld[][] s=brett.getBrett();
        if(s[currentRow][currentCol].getDirection()=='U'&&currentRow-1<0){
            return true;

        }
        if(s[currentRow][currentCol].getDirection()=='D'&&currentRow+1>=s.length){
            return true;

        }
         if(s[currentRow][currentCol].getDirection()=='L'&&currentCol-1<0){
            return true;

        }
        if(s[currentRow][currentCol].getDirection()=='R'&&currentCol+1>=s[currentRow].length){
            return true;

        }
        return false;
    }
    public void go(int n){
        Feld[][] s=brett.getBrett();

        for(int i=0; i<n;i++){
            if(s[currentRow][currentCol].getDirection()=='U'&&!this.movesOut()&&!s[currentRow][currentCol].isBoese()){
                currentRow-=1;
                
            }
             else if(s[currentRow][currentCol].getDirection()=='D'&&!this.movesOut()&&!s[currentRow][currentCol].isBoese()){
                currentRow+=1;
               
            }
            else if(s[currentRow][currentCol].getDirection()=='L'&&!this.movesOut()&&!s[currentRow][currentCol].isBoese()){
                currentCol-=1;
                
            }
             else if(s[currentRow][currentCol].getDirection()=='R'&&!this.movesOut()&&!s[currentRow][currentCol].isBoese()){
                currentCol+=1;
                
            }
        }
        }

    }



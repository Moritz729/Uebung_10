package h1;

public class H1_Main {

    public static void main(String[] args) {
        Cell myCell=new Cell(3,5);
         Cell myCell2=new Cell(4,5,true);
         Cell myCell3=new Cell(3,6);
         Cell myCell4=new Cell(5,7);
         Cell []cells= {myCell,myCell2,myCell3,myCell4};
         Grid myGrid=new Grid(cells, 8, 8);
         Cell[][] myGridCell=myGrid.getGridArray();
         
         for(int i=0;i<8;i++){
            for(int j=0;j<8;j++){
                if(myGridCell[i][j].isAlive()){
                    System.out.print(" "+1+" ");
                }
                else{
                    System.out.print(" "+0+" ");
                }
            }
            System.out.println();
         }
         System.out.println();
         System.out.println();
         System.out.println();
         System.out.println();
         System.out.println();

         myGrid.computeNextGen();
         myGridCell=myGrid.getGridArray();
          for(int i=0;i<8;i++){
            for(int j=0;j<8;j++){
                if(myGridCell[i][j].isAlive()){
                    System.out.print(" "+1+" ");
                }
                else{
                    System.out.print(" "+0+" ");
                }
            }
            System.out.println();
         }

         


    }

































































}

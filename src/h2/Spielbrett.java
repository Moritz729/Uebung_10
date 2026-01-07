package h2;

public class Spielbrett {
   private Feld[][] Brett;
    private int dim;
    public Feld[][] getBrett() {
        return Brett;
    }
    public void setBrett(Feld[][] brett) {
        Brett = brett;
    }
    public int getDim() {
        return dim;
    }
    public void setDim(int dim) {
        this.dim = dim;
    }
    public Spielbrett(int dim){
        this.dim=dim;
        Brett=new Feld[dim][dim];
    }

}

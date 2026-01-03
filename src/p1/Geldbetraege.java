package p1;

public class Geldbetraege {
    int euro;
    int cent;
    public int getEuro() {
        return euro;
    }
    public int getCent() {
        return cent;
    }
    public void setEuro(int euro) {
        this.euro = euro;
    }
    public void setCent(int cent) {
        if(cent>100){
            int umgewandelterEuro=cent/100;
            euro+=umgewandelterEuro;
            this.cent+=cent%100;
        }
        else{
            this.cent = cent;
        }
        
    }
    public Geldbetraege(int euro, int cent) {
        this.euro = euro;
        this.cent = cent;
    }

}

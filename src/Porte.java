public class Porte extends Bloc {

    private boolean verouille;

    public Porte(final int longueur, final int largeur, final int hauteur, final boolean verouille){
        super(longueur, largeur, hauteur);
        this.verouille = verouille;
    }

    public boolean estVerouille(){
        if (verouille) {
            return true;
        }
        return false;
    }

}

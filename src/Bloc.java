public abstract class Bloc {

    // Attributs
    protected int longueur;
    protected int largeur;
    protected int hauteur;

    // Constructeur
    public  Bloc(final int longueur, final int largeur, final int hauteur){
        this.longueur = longueur;
        this.largeur = largeur;
        this.hauteur = hauteur;
    }

    // Méthodes
    public int getLongueur(){
        return this.longueur;
    }

    public int getLaregur(){
        return this.largeur;
    }

    public int getHauteur(){
        return this.hauteur;
    }
}

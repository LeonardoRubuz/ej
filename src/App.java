import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");
        int somme = App.addition(2, 7);
        // System.out.println(somme);  
        // App.affichage("Leonardo");

        List<Integer> tableau = Arrays.asList(1, 0, 3, 0, 5, 6, 7);
        Integer cpt = 0;
        for (Integer valeur : tableau) {
            switch (valeur) {
                case 0 -> cpt ++;
            };
        }
        // System.out.println("CPT : " + cpt);
        // Bloc bloc = new Bloc(1, 2, 0);

        
    }

    public static int addition(final int entier1, final int entier2){
        return entier1 + entier2;
    }

    public static void affichage(final String nom) {
        System.out.println("Bonjour "+ nom);
        
    }
}

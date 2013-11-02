/*
*   Classe Joueur
*
*   - contient un nom
*   - contient un score
*   - assigne le nom
*   - retourne le nom
*   - augmente le score
*   - retourne le score
*/
public class Player {

    /* on declare un joueur */
    private String name;    // declaration de variable pour stocker le nom
    private int score;      // declaration de varibale pour stocker le score du joueur

    /* constructeur de classe */
    public Player() {
        score = 0;          // initialisation du score à 0
        name = "joueur";    // declaration d'un nom par defaut
    }

    /* methode d'assignation du nom du joueur */
    public void setName(String n) {
        name = n;
    }

    /* methode de recuperation du nom du joueur */
    public String getName() {
        return name;        // a l'appel de la methode, on retourne le nom du joueur
    }

    /* methode de recuperation du score */
    public int getScore() {
        return score;
    }

    /* methode d'augmentation du score */
    public void incScore() {
        score++;            // on augmente le score du joueur de 1
    }
}

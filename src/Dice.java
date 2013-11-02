/*
*   Classe Dé
*
*   - contient une valeur courrante de face
*   - dispose d'un nombre de faces fixe
*   - attribue aléatoirement une valeur à la face courrante
*
*/

public class Dice {

    private int faceVal; // declaration de la variable qui stock la valeur de la face du de
    private final int MAX_FACES;    // constante pour le nombre de faces

    /* constructeur de classe */
    public Dice() {
        faceVal = 1;                // initialisation de la valeur a 1
        MAX_FACES = 6;              // de a 6 faces
    }

    /* methode de resultat aleatoire pour le de */
    public int roll() {
        faceVal = (int)((Math.random()*MAX_FACES)+1);
        return faceVal;
    }
}

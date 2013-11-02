/*
*   Classe Regles du jeu
*
*   - verifie le resultat d'un lancé de dé
*   - verifie si la valeur d'une face correspond aux valeurs autorisées
*   - verifie si un joueur a gagné
*
*/

public class Rules {

    /* declaration des variables */
    private Integer[] rule;         // creation d'un tableau avec les valeurs à obtenir

    /* constructeur */
    public Rules() {
        /* assignation des valeurs (no magic numbers) */
        rule = new Integer[]{1, 2, 4};
    }

    /* methode de verification si la valeur du dé est différente de 1, 2 et 4 */
    public boolean notInArray(int val) {
        if (val!=rule[0] && val!=rule[1] && val!=rule[2])
            return true;
        return false;
    }

    /* methode de verification du resultat */
    public boolean checkResult(Integer[] array) {
        for (int i = 0; i < array.length; i++) {
            if (notInArray(array[i]))
                return false;
            for (int n = 0; n < i; n++) {
                if (array[i] == array[n]) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean isWinner(int score) {
        return score == 5;
    }
}

/*
*   Classe Gobelet
*
*   - contient 2 dés
*   - lance les dés et retourne un tableau des resultats
*
*/
public class Pot {

    /* declaration des variables */
    private Dice[] dices;                   // creation d'un tableau pour stocker les des
    private Integer[] retval;                // creation d'un tableau des resultats

    public Pot() {
        dices = new Dice[3];                // instanciation du tableau de des
        retval = new Integer[3];

        /* assignation d'un de à chaque case du tableau */
        for (int i = 0; i < dices.length; i++) {
            dices[i] = new Dice();
        }
    }

    /* methode pour lancer les des */
    public Integer[] playRound() {
        int i=0;
        for (Dice d : dices) {              // pour chaque de du tableau
            retval[i] = d.roll();           // on lance le de
            i++;
        }
        return retval;                      // on retourne les resultats de chaque de
    }

}

/*
*   Classe Jeu
*
*   - contient un tableau de joueurs
*   - contient un tableau de resultats
*   - contient un gobelet
*   - fait jouer chaque joueur
*   - annonce le vainqueur
*/

public class Game {

    /* declaration des variables pour jouer */
    private Player[] players;                                   // creation d'un tableau pour stocker les joueurs
    private String[] names;                                     // creation d'un tableau pour declarer les noms des joueurs
    private Integer[] result;                                   // creation d'un tableau des resultats de chaque lancé
    private Pot pot;                                            // creation du gobelet
    private Rules rule;                                         // creation d'une variable des regles
    boolean win;                                                // variable de victoire

    /* constructeur */
    public Game() {
        names = new String[3];                                  // initialisation du tableau des noms à 3
        players = new Player[3];                                // initialisation du tableau des joueurs à 3
        pot = new Pot();                                        // instanciation de l'objet gobelet
        result = new Integer[3];                                // instanciation du tableau des resultats
        rule = new Rules();                                     // instanciation des regles
        win = false;                                            // initialisation de la variable de victoire à false

        /* remplissage du tableau des noms */
        names[0] = "Riri";
        names[1] = "Fifi";
        names[2] = "Loulou";

        /* creation de chaque joueur et affectation du nom pour chacun */
        Player j;
        for (int i=0; i < players.length; i++) {
            j = new Player();                                   // creation du joueur
            j.setName(names[i]);                                // affectation du nom par rapport au tableau des noms
            players[i] = j;                                     // stockage du joueur dans le tableau des joueurs
        }
    }

    /* methode pour jouer une partie */
    public void playGame() {

        /* on joue tant qu'il n'y a pas de gagnant */
        while (!win) {

            /* pour chaque joueur du tableau... */
            for (Player p : players) {
                System.out.println(p.getName() + " lance les dés...");

                result = pot.playRound();                       // le joueur lance les des

                for (int r : result)                            // pour chaque valeur de resultat
                    System.out.println(r);                      // on affiche la valeur

                if (rule.checkResult(result)) {                 // on verifie les resultats
                    p.incScore();                               // si 421 alors le score du joueur augmente
                }

                System.out.println("Score = "+p.getScore());    // on affiche le score du joueur

                /* si le joueur a gagné... */
                if (rule.isWinner(p.getScore())) {
                    win = true;
                    System.out.println(p.getName()+" a remporté la partie !");
                    break;
                }
            }
        }
    }
}

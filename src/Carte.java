public class Carte {
    private int nbLigne;
    private int nbColonne;
    private Case matriceDeCase[][];
    private int taille;
    /** Constructeur initialise la matrice 
     * @param nbLigne 
     * @param nbColonne 
    */
     Carte(int nbLigne,int nbColonne,int taille) {
	 this.taille=taille;
	 this.nbLigne = nbLigne;
	 this.nbColonne = nbColonne;
	 this.matriceDeCase = new Case [nbLigne][nbColonne];
     }
     /** Initialise la case demandé 
      * @param ligne : coordonnée ligne de la case a initialiser
      * @param colonne : coordonnée colonne de la case a initialiser 
      * @param terrain : Nature du terrain a initialiser
      */
     public void initCase(int ligne,int colonne,NatureTerrain terrain) {
	 this.matriceDeCase[ligne][colonne] = new Case(ligne,colonne,terrain);
     }
     /** Donne la case voisine dans la direction demandé
      * @param ligne : ligne de la case mère 
      * @param colonne : colonne de la case mère 
      * @param direction : donne la direction de la case demandé 
      * @return La case voisine de la case mère dans la direction indiqué
      * Si la case voisine n'existe pas le type de la case sera NatureTerrain.ERREUR
      */
     Case getVoisin(int ligne, int colonne, Direction direction) {
	    switch(direction) {
		case NORD:
		    if(ligne!=0) {
			return this.matriceDeCase[ligne-1][colonne];
		    }
		    else { 
			return new Case(-1,-1,NatureTerrain.ERREUR); 
		    }
		case SUD:
		    if(ligne!=nbLigne) {
			return this.matriceDeCase[ligne+1][colonne];
		    }
		    else { 
			return new Case(-1,-1,NatureTerrain.ERREUR); 
		    }
		case EST:
		    if(colonne!=nbColonne) {
			return this.matriceDeCase[ligne][colonne+1];
		    }
		    else { 
			return new Case(-1,-1,NatureTerrain.ERREUR); 
		    }
		case OUEST: 
		    if(colonne!=0) {
			return this.matriceDeCase[ligne][colonne-1];
		    }
		    else { 
			return new Case(-1,-1,NatureTerrain.ERREUR); 
		    }
		default:
		    return new Case(-1,-1,NatureTerrain.ERREUR);
	    }
     }
    /** Renvoie la case aux coordonnées demandé 
     * @param ligne : ligne de la case demandé 
     * @param colonne : colonne de la case demandé 
     * @return Case définie par les coordonnées passé en entrée 
     */
     Case getCase(int ligne, int colonne) {
	 return matriceDeCase[ligne][colonne];
     }
     /** Renvoie le nombre de ligne de la carte 
      * @return le nombre de ligne de la carte 
      */
     int getNbLigne() {
	 return this.nbLigne;
     }
     /** Renvoie le nombre de colonne de la carte
      * @return le nombre de colonne de la carte
      */
     int getNbColonne() {
	 return this.nbColonne;
     }

     /** Renvoie la taille des cases de la carte
      * @return la taille des cases de la carte
      */
     int getTaille() {
	 return this.taille;
     }
     /** Je sais pas cec que ca fait 
      * @param date : date a la quelle a lieu l'evenement 
      */
     public void evenement(long date) {
	 return;
     }
}

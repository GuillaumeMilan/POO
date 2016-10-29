class Incendie {
    /* nombre de litre d'eau encore necessaire pour éteindre l'incendie */
    private int nbLitreEau;
    /* copie de la case de la carte sur la quel l'incendie s'est déclaré */
    private Case localisation;
    /** Constructeur 
     * @param nbLitreEau : nb de litre d'eau encore necessaire pour eteindre le feu
     * @param localisation : emplacement du feu sur la carte 
     */
    Incendie(int nbLitreEau,Case localisation) {
	this.nbLitreEau=nbLitreEau;
	this.localisation=localisation;
    }
    /** Renvoie la nature du terrain de la case 
     * @return Nature du terrain de la case 
     */
    public NatureTerrain getFieldNature() {
	return localisation.getFieldNature();
    }
    /** Renvoie la colonne sur la quel se situe l'incendie 
     * @return Colonne de l'incendie
     */
    public int getColumn() {
	return localisation.getColumn();
    }
    /** Renvoie la ligne sur la quelle se situe l'incendie 
     * @return Ligne de l'incendie
     */
    public int getLine() {
	return localisation.getLine();
    }
    /** Verse n litre sur l'incendie 
     * @param nbLitre : nb de litre d'eau versé 
     */
    public void verserEau(int nbLitre) {
	this.nbLitreEau = this.nbLitreEau-nbLitre;
    }
}

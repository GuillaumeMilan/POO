public class Case {
    private int ligne;
    private int colonne; 
    private NatureTerrain terrain;
    /** Constructeur
    * @param ligne ligne de la case 
    * @param colonne colonne de la case
    * @param terrain nature du terrain 
    */
    Case(int ligne,int colonne,NatureTerrain terrain) {
	this.ligne = ligne;
	this.colonne = colonne;
	this.terrain = terrain;
    }
    /** mettre le terrain de la case demandé
     * @param terrain : met le terrain de la case a la valeur terrain
     */
    void setTerrain(NatureTerrain terrain) {
	this.terrain = terrain;
    }
    /** donne la ligne de la case 
     * @return ligne de la case 
     */
    int getLine() {
	return this.ligne;
    }
    /** donne la colonne de la case 
     * @return colonne de la case 
     */
    int getColumn() {
	return this.colonne;
    }
    /** donne la nature du terrain de la case 
     * @return nature du terrain de la case 
     */
    NatureTerrain getFieldNature() {
	return this.terrain;
    }
}

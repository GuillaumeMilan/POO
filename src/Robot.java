public abstract class Robot {
    /** Volume du réservoir (-1 signifie que le réservoir est infinie)*/
    private int volumeReservoir;
    /** Nombre de litre dans le réservoir*/
    private int nbLitre;
    /** Position (est une copie de la référence de la Case de la carte) */
    private Case position;
    /** Incendie qui a le focus du robot */
    private Incendie incendieFocused;
    /** Deplace le robot vers la case voisine dans la direction deamandé
     * @param direction : direction dans la quel le robot doit se déplacer
     */
    public abstract void deplace(Direction direction);
    /** Effectue n vidage unitaire du robot sur l'incendie dans la direction indiqué(la fonction doit vérifier que la case arrosé possède l'incendie sous focus)
     * @param direciton : direction vers la quel le robot doit jeter sont reservoir pour le drone peut importe la direciton passé en paramètre
     */
    public abstract void arrose(Direction direction);
}
    

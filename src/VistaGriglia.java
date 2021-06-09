package upo.battleship.cecciTragno;

public interface VistaGriglia {
	
	/**
	 * Colora la cella di giallo, perch� al suo interno c'� una nave
	 *@param x la coordinata x
	 * @param y la coordinata y
	 */
	abstract void colpisciCellaPiena(int x, int y);
	
	/**
	 * Colora la cella di blu, perch� al suo interno non c'� una nave
	 * @param x la coordinata x
	 * @param y la coordinata y
	 */
	abstract void colpisciCellaVuota(int x, int y);
	
	/**
	 * Colora la cella di rosso, perch� al suo interno c'� una nave e la nave � stata affondata
	 * @param x la coordinata x
	 * @param y la coordinata y
	 */
	abstract void colpisciNaveColpita(int x, int y);
	
	/**
	 * Colora il campo quando finisce la partita
	 */
	abstract void finePartita();
	
	/**
	 * Resetta la vista della griglia quando si inizia una nuova partita
	 */
	abstract void reset();
}

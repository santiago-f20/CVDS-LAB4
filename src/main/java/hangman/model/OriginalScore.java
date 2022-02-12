/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hangman.model;

/**
 *
 * @author santiago.fetecua
 */
public class OriginalScore implements GameScore{
    
    
    /**
     * Función creada para calcular el score del juego de acuerdo a las
     * condiciones especiales OriginalScore
     * El juego inicia en 100 puntos.   
     * No se bonifican las letras correctas.
     * Se penaliza con 10 puntos con cada letra incorrecta.
     * El puntaje minimo es 0.
       
     * @pre ScoreCalculated = 100
     * @pos ScoreClculated se calcula asi 100-(10*incorrectCount). Si incorrectCount es mayor a 10 
     * su valor se mantiene en 0.
     *      
     * @param correctCount
     * @param incorrectCount
     * @throws ScoreException
     */

    @Override
    public int calculateScore(int correctCount, int incorrectCount) throws scoreException{
        return 0;
    }
}

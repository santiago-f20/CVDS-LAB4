/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hangman.model;

/**
 *
 * @author santiago.fetecua
 */
public class BonusScore implements GameScore{
    
    /**
     * Función creada para calcular el score del juego de acuerdo a las
     * condiciones especiales BonusScore
     * El juego inicia en 0 puntos.   
     *Se bonifica con 10 puntos cada letra correcta.
     *Se penaliza con 5 puntos cada letra incorrecta.
     *El puntaje mínimo es 0
       
     * @pre ScoreCalculated = 0
     * @pos ScoreCalculated se calcula asi (10*correctCount-5*incorrectCount). Si ScoreCalculated es menor a 0,
     * su valor se mantiene en 0.
     *      
     * @param correctCount
     * @param incorrectCount
     * @throws ScoreException
     */
    
    @Override
    public int calculateScore(int correctCount, int incorrectCount){
        return 0;
    }
}

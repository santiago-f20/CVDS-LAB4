/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hangman.model;

/**
 * LAB 4 CVDS
 * Santiago Fetecua 
 * Edwar Lozano
 */
public class PowerScore implements GameScore{
    private int scoreCalculated = 0;
    /**
     * Función creada para calcular el score del juego de acuerdo a las
     * condiciones especiales PowerScore
     * El juego inicia en 0 puntos.
     * La $i-ésima$ letra correcta se bonifica con $5^i$.
     * Se penaliza con 8 puntos cada letra incorrecta.
     * El puntaje mínimo es 0
     *Si con las reglas anteriores sobrepasa 500 puntos, el puntaje es 500.
     * 
     * @pre ScoreCalculated = 0
     * @pos ScoreCalculated se calcula asi (5^i-8*incorrectCount) Donde i es la i-ésima letra correcta. Si ScoreCalculated es menor a 0,
     * su valor se mantiene en 0.
     *      
     * @param correctCount
     * @param incorrectCount
     * @throws ScoreException
     */
    
    @Override
    public int calculateScore(int correctCount, int incorrectCount) throws ScoreException{
        if(correctCount < 0 || incorrectCount < 0){
            throw new ScoreException(ScoreException.NEGATIVE);
        }
        correct(correctCount);
        incorrect(incorrectCount);
        
        return (scoreCalculated > 500)?500:(scoreCalculated<0)?0:scoreCalculated;

    }

    private void incorrect(int incorrectCount){
        scoreCalculated -= 8*incorrectCount;
    }

    private void correct(int correctCount){
        if(correctCount != 0){
            for(int i = 1; i<= correctCount;i++){
                scoreCalculated += Math.pow(5, i);
            }
        }
    }
}

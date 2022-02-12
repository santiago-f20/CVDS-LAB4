/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package hangman.model;

/**
 *
 * @author santiago.fetecua
 */
public interface GameScore {
    abstract public int calculateScore(int correctCount, int incorrectCount) throws ScoreException;
}

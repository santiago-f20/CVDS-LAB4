/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package hangman.model;

/**
 * LAB 4 CVDS
 * Santiago Fetecua 
 * Edwar Lozano
 */
public interface GameScore {
    abstract public int calculateScore(int correctCount, int incorrectCount) throws ScoreException;
}

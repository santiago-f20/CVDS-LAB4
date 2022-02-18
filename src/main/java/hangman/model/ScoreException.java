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
public class ScoreException extends Exception{
    public static final String INVALID_SCORE = "Score Invalido";
    public static final String NEGATIVE = "Numeo Negativo";
    
    public ScoreException(String e){
        super(e);
    }
}

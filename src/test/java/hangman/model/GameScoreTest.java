/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hangman.model;

import org.junit.Assert;
import org.junit.Test;

/**
 * LAB 4 CVDS
 * Santiago Fetecua 
 * Edwar Lozano
 */
public class GameScoreTest {
    /**
     * 
     * Original Score:
     * s = Score
     * s = -15 | (-inf,0) | Invalido
     * s = 55  | [0, inf) | Valido 
     * 
     * Bonus Score:
     * s = Score
     * s = -15 | (-inf,0) | Invalido
     * s = 55  | [0, inf) | Valido 
     * 
     * Power Bonus Score:
     * s = Score
     * s = -15 | (-inf,0)  | Invalido
     * s = 100 | [0, 500]  | Valido
     * s = 600 |(500, inf) | Invalido
     * 
     * Condicion Frontera:
     * s = 0 
     * 
     * @throws hangman.model.ScoreException
     */
    
    
    @Test
    public void shouldGiveOriginalScore() throws ScoreException{
       GameScore original = new OriginalScore();
       Assert.assertEquals(70, original.calculateScore(5, 3));
    }
    
    @Test
    public void shouldGiveInvOriginalScore() throws ScoreException{
       GameScore original = new OriginalScore();
       Assert.assertEquals(0, original.calculateScore(5, 11));
    }
    
    @Test
    public void shouldGiveBonusScore() throws ScoreException{
       GameScore bonus = new BonusScore();
       Assert.assertEquals(30, bonus.calculateScore(4, 2));
    }
    
    @Test
    public void shouldGiveInvBonusScore() throws ScoreException{
       GameScore bonus = new BonusScore();
       Assert.assertEquals(0, bonus.calculateScore(2, 5));
    }
    
    @Test
    public void shouldGivePowerScore() throws ScoreException{
       GameScore power = new PowerScore();
       Assert.assertEquals(115, power.calculateScore(3, 5));
    }
    
    @Test
    public void shouldGiveInvDownPowerScore() throws ScoreException{
       GameScore power = new PowerScore();
       Assert.assertEquals(0, power.calculateScore(1, 2));
    }
    
    @Test
    public void shouldGiveInvUpPowerScore() throws ScoreException{
       GameScore power = new PowerScore();
       Assert.assertEquals(500, power.calculateScore(4, 5));
    }
}

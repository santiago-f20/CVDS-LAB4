/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hangman.setup.guice;

/**
 *
 * @author 2106913
 */

import hangman.model.French;
import hangman.model.Language;
import hangman.model.*;
import hangman.model.dictionary.EnglishDictionaryDataSource;
import hangman.model.dictionary.HangmanDictionary;
import hangman.model.dictionary.FrenchDictionaryDataSource;
import hangman.model.dictionary.SpanishDictionaryDataSource;
import hangman.view.HangmanNoviolentoPanel;
import hangman.view.HangmanPanel;
import hangman.view.HangmanStickmanPanel;

public class HangmanFactoryServices extends com.google.inject.AbstractModule {

    @Override
    protected void configure() {
        /* Guice dependency injection */
        // bind(Interface.class).to(Concrete.class);

        // Para tener el idioma en Ingles
        //bind(Language.class).to(English.class);
        //bind(HangmanDictionary.class).to(EnglishDictionaryDataSource.class);

        // Para tener el idioma en frances
        //bind(Language.class).to(French.class);
        //bind(HangmanDictionary.class).to(FrenchDictionaryDataSource.class);

        // Para tener el idioma en español
        bind(Language.class).to(Spanish.class);
        bind(HangmanDictionary.class).to(SpanishDictionaryDataSource.class);

        bind(HangmanPanel.class).to(HangmanStickmanPanel.class);

        // Para usar el esquema Original Score
           bind(GameScore.class).to(OriginalScore.class);

        // Para usar el esquema Bonus Score
        // bind(GameScore.class).to(BonusScore.class);

        // Para usar el esquema Power Score
        // bind(GameScore.class).to(PowerScore.class);
    }

}

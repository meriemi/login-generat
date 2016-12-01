package geco;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
Exigence #1
 */
/**
 * Classe de service permettant la gestion des login
 */
public class PasswordGenneration {

    public String getRandomPassword(){
        StringBuilder sb = new StringBuilder(8);
        static Random rnd = new Random();
        static final String AB = "abcdefghijklmnopqrstuvwxyz";
        Random r = new Random();

                for( int i = 0; i < 8; i++ )
                    sb.append( AB.charAt( rnd.nextInt(AB.length()) ) );
                return sb.toString();
            }

    }

}
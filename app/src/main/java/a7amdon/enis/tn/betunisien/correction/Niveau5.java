package a7amdon.enis.tn.betunisien.correction;

import java.util.ArrayList;

import a7amdon.enis.tn.betunisien.R;
import a7amdon.enis.tn.betunisien.util.QuestionImage;
import a7amdon.enis.tn.betunisien.util.QuestionTexte;
import a7amdon.enis.tn.betunisien.util.Reponse;

/**
 * Created by 7amdon on 13/10/2016.
 */
public class Niveau5 {

    public static QuestionTexte questionTexte ;
    public static QuestionImage questionImage;

    public Niveau5()
    {
        questionTexte = new QuestionTexte("8ala bel 9loub");
        ArrayList<Reponse> list_response = null;
        //les réponses de la question n°1
        list_response.add(new Reponse("dele3",31));
        list_response.add(new Reponse("3neb",20));
        list_response.add(new Reponse("hendi",16));
        list_response.add(new Reponse("madalina",11));
        list_response.add(new Reponse("bati5",8));
        list_response.add(new Reponse("tofe7",7));
        list_response.add(new Reponse("bousa3",5));
        list_response.add(new Reponse("anjas",2));

        questionTexte.setListe_reponses(list_response);

        /*******image setting*******/
        questionImage = new QuestionImage(R.drawable.i5);
        ArrayList<Reponse> list_response1 = null;
        //les réponses de la question n°1
        list_response1.add(new Reponse("rajel",40));
        list_response1.add(new Reponse("sid",23));
        list_response1.add(new Reponse("so7ba",16));
        list_response1.add(new Reponse("dho7k",12));
        list_response1.add(new Reponse("nature",9));

        questionImage.setListe_reponses(list_response1);
    }
}

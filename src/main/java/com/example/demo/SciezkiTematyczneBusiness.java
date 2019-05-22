package com.example.demo;

import java.util.ArrayList;
import java.util.List;

public class SciezkiTematyczneBusiness {

    public List<SciezkiTematyczne> getSciezkiList() {


        List<SciezkiTematyczne> tematyczneList = new ArrayList<>();

        tematyczneList.add(new SciezkiTematyczne("1","Kolekcje, nie tak trudne jak Ci się wydają", "Stwórz swoją pierwszą stronę w mniej niż godzinę", "Czy grafik może zostać Frontendowcem? Zalety przebranżowienia"));
        tematyczneList.add(new SciezkiTematyczne("2","Wykorzystanie RPi oraz ubidots do streamingu danych", "NodeJS w dwie godziny", "Sass, LESS, Stylus - co wybrać by Twoje strony lepiej się prezentowały"));
        tematyczneList.add(new SciezkiTematyczne("3","Clean Code", "Testing for modern web", "Zapoznaj się z TypeScriptem"));
        tematyczneList.add(new SciezkiTematyczne("4","Nie zapominaj i Garbage Collectorze, czyli jak Tworzyć smart obiekty", "Czy klient REST może być tylko statyczny? - napisz swój pierwszy socket", "Zarys historyczny technologi frontEndowych"));

        return tematyczneList;
    }
}

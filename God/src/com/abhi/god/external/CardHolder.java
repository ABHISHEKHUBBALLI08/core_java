package com.abhi.god.external;

import com.abhi.god.internal.Card;

public class CardHolder {
    public  void info(){
        System.out.println(" info running in card holder");
        Card card=new Card();
        card.type();
    }
}

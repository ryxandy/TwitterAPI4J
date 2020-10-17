package com.ryxandy;

import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;

public class Metodos {

    //Método que faz um post

    public void  novoTweet(){
        Twitter twitter = TwitterFactory.getSingleton();
        String meuTweet = "Hello World, esse post foi feito via código";
        try {
            Status status = twitter.updateStatus(meuTweet);
            System.out.println("Status atualizado com sucesso! "+ status.getText());
        } catch (TwitterException e){
            e.printStackTrace();
        }

    }

}

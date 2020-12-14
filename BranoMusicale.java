/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esercizio5;

/**
 *
 * @author 4AIA
 */
public class BranoMusicale {
    private String titolo;
    private String autore;
    private String genere;
    private int anno;
    private int durata;

    public String getTitolo() {
        return titolo;
    }

    public String getAutore() {
        return autore;
    }

    public String getGenere() {
        return genere;
    }

    public int getAnno() {
        return anno;
    }

    public int getDurata() {
        return durata;
    }
    
    
    
    
    
    public BranoMusicale (String t, String a, String g, int ann, int dur ){
    titolo=t;
    autore=a;
    genere=g;
    anno=ann;
    durata=dur;
    
    }
    
    public boolean equals (BranoMusicale b){
    if(titolo==b.getTitolo() && autore==b.getAutore() && genere==b.getGenere() && anno==b.getAnno() && durata==b.getDurata()){
        return true;
    }
    
    return false;
    }
    
}

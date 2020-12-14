/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esercizio5;
import java.util.ArrayList;
/**
 *
 * @author 4AIA
 */
public class CDAudio {
 private String nome;
 private ArrayList <BranoMusicale> canzoni;
 
 public CDAudio (){
nome="";
canzoni=new ArrayList <>();

}
 public CDAudio (String name){
nome=name;
canzoni=new ArrayList <>();
}
 
 public void aggiungiBrano(BranoMusicale brano){
 canzoni.add(brano);
 
 }
 public void cancellaBrano(String titolobran){
 for(int i=0;i<canzoni.size();i++){
 if(titolobran==canzoni.get(i).getTitolo()){
 canzoni.remove(i);
 }
 }
 }
 
 public BranoMusicale search(String titolo){
 for(int i=0; i<canzoni.size();i++){
 if(titolo==canzoni.get(i).getTitolo()){
 return canzoni.get(i);
 }
 
 }
 return null;
 }
 
 public void modificaBrano(BranoMusicale nuovoBrano){
     
     
  for(int i=0; i<canzoni.size();i++){
 if(nuovoBrano.getTitolo()==canzoni.get(i).getTitolo()){
 canzoni.get(i).getAutore()= nuovoBrano.getAutore();
 canzoni.get(i).getDurata()= nuovoBrano.getDurata();
 canzoni.get(i).getGenere()= nuovoBrano.getGenere();
 canzoni.get(i).getAnno()=nuovoBrano.getAnno();
 
 }
 
 }
 
 
 }
 
 public int contaBraniAnno (int anno){
 int x=0;
 for(int i=0; i<canzoni.size(); i++){
 if (anno==canzoni.get(i).getAnno()){
 x++;
 }
 }
 
 return x;
 }
 
  public int contaBraniAutore (String autore){
 int x=0;
 for(int i=0; i<canzoni.size(); i++){
 if (autore==canzoni.get(i).getAutore()){
 x++;
 }
 }
 
 return x;
 }
 
  public BranoMusicale maxDurata(){
   int duratamax=0;   
   int pos=0;
  duratamax=canzoni.get(0).getDurata();
  
  for(int i=0; i<canzoni.size();i++){
  if(canzoni.get(i).getDurata()>duratamax){
  pos=i;
  duratamax=canzoni.get(i).getDurata();
  }
  }
  
  return canzoni.get(pos);
  }
  public CDAudio braniGenre(String genere){
  
  
  return null;
  }
  
}

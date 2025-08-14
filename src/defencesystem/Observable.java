/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package defencesystem;

   // import java.util.ArrayLis
import java.util.ArrayList;

//    import java.util.List;
/**
 *
 * @author User
 */
public class Observable{
   private ArrayList<Obsever>observerList=new ArrayList<>();
   
   public void addToObsever(Obsever obsever){
       observerList.add(obsever);
   }
   
   public void areaClear(boolean isChecked){
       for(Obsever obsever:observerList){
           obsever.setAreaClear(isChecked);
       }
   }
}
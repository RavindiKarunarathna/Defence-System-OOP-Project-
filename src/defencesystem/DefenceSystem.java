
package defencesystem;

public class DefenceSystem {

    public static void main(String[] args) {
        Observable observable=new Observable();
        
        MainController mainController=new MainController(observable);
        
        observable.addToObsever(new Helicopter());
        observable.addToObsever(new Tank());
        observable.addToObsever(new Submarine());
        
    }
    
}

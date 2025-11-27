
package defencesystem;

public class DefenceSystem {

    public static void main(String[] args) {
        Observable observable=new Observable();
        
        MainController mainController=new MainController(observable);
        
        observable.addToObsever(new Helicopter(mainController));
        observable.addToObsever(new Tank(mainController));
        observable.addToObsever(new Submarine(mainController));
        
    }
    
}

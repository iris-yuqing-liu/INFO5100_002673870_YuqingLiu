import java.util.ArrayList;
import java.util.List;

//Factory method
interface Violin {
    public void playViolin();
    public String type="";

}
class sytheticViolin implements Violin{
    public void playViolin(){
        System.out.println("Playing a sythetic violin.");
    }
}
class gutViolin implements Violin{
    public void playViolin(){
        System.out.println("Playing a gut violin.");
    }
}
class steelViolin implements Violin{
    public void playViolin(){
        System.out.println("Playing a steel violin.");
    }
}
public class ViolinFactory{
    public Violin createViolin(String type){
        switch (type) {
            case "sythetic":
                return new sytheticViolin();
            case "gut":
                return new gutViolin();
            case "steel":
                return new steelViolin();
            default:
                throw new IllegalArgumentException("Invalid voilin string type: " + type);
        }
    }

}

//Decorator pattern
class violinDecorator implements Violin{
    public Violin baseViolin;
    public void playViolin(){
        baseViolin.playViolin();
        System.out.println("Adding decorator to the base violin");
    }
    public violinDecorator(Violin baseViolin){
        this.baseViolin=baseViolin;
    }
}

class violinDecoratorAmplifier extends violinDecorator{
    public violinDecoratorAmplifier(Violin baseViolin) {
        super(baseViolin);
    }
    public void playViolin(){
        super.playViolin();
        System.out.println("Adding amplifier to the base violin.");
    }
}

class violinDecoratorBridge extends violinDecorator{
    public violinDecoratorBridge(Violin baseViolin) {
        super(baseViolin);
    }
    public void playViolin(){
        super.playViolin();
        System.out.println("Adding bridge to the base violin.");
    }
}

//Iterator pattern
interface Iterator{
    boolean hasNext();

}

class violinListIterator implements Iterator {
    private List<Violin> violinList;
    private int cursor=0;
    public violinListIterator(List<Violin> violinList){
        this.violinList=violinList;
    }
    public String getCursor(){
        return String.valueOf(cursor);
    };
    public boolean hasNext(){
        if (cursor < violinList.size()){
            return true;
        }
        else{
            return false;
        }
    };
    public Violin getNextViolin(){
        return violinList.get(cursor++);

    }
}
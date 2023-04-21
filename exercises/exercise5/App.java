import java.util.ArrayList;
import java.util.List;
public class App {
    public static void main(String[] args) throws Exception {
        // Factory pattern demo
        ViolinFactory factory = new ViolinFactory();
        Violin myViolin = factory.createViolin("gut");
        myViolin.playViolin();

        // Decorator pattern demo
        Violin myViolinAmplifier = new violinDecoratorAmplifier(myViolin);
        myViolinAmplifier.playViolin();
        Violin myViolinAmplifierBridge = new violinDecoratorBridge(myViolinAmplifier);
        myViolinAmplifierBridge.playViolin();

        //Iterator pattern demo
        List<Violin> myViolinList = new ArrayList<>();
        myViolinList.add(myViolin);
        myViolinList.add(myViolinAmplifier);
        myViolinList.add(myViolinAmplifierBridge);
        violinListIterator iterator = new violinListIterator(myViolinList);
        while(iterator.hasNext()){
            // Violin currentviolin=iterator.getNextViolin();
            System.out.println("No."+iterator.getCursor()+" violin is playing");
            iterator.getNextViolin();
        }

    }
}


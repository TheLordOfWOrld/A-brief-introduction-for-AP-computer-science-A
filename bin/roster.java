import java.util.ArrayList;

public class roster {

    private ArrayList<Double> removeEvens(ArrayList<Double> input){
        for(int i=0; i<input.size(); i++){
            if(input.get(i)%2==0){
                input.remove(i);
                i--;
            }
        }
        return input;
    }

    private static void print(ArrayList<Double> input){
            for(double i : input){
                System.out.print(i + " ");
            }
    }

    private static void condense(ArrayList<Double> input){
        ArrayList<Double> temp = new ArrayList<Double>();
        for(int i=0; i<input.size(); i+=2){
            temp.add(input.get(i)*input.get(i+1));
        }
        input.clear();
        input.addAll(temp);
    }

    private static void duplicate(ArrayList<Double> input){
        for(Double d : input){
            input.add(d);
        }
    
    }
    public static void main(String[] args) {
   

}
}

import java.util.ArrayList;

public class HWWWW {
    public String inc(){
        return null;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        int[] arr = new int[list.size()];
        arr[0] = list.get(2);
        list.add(3);
        list.add(2);
        list.add(1);
        list.add(0);
        list.add(0,4);
        list.set(3,2);
        list.remove(1);
        list.clear();
        System.out.println(list);

    }
}

public class Hawk extends Bird
{

private int talonStrength;


public Hawk(int talon, int beak)

{

super(beak);

talonStrength = talon;

}

public static void main(String[] args) {
    Bird b= new Hawk(0, 0);
    int[][] ar = new int[2][2];
    int[][] br = new int[2][4];
    int[] a = {1,2,3,4,5,6,7,8,9,10};
    ar[1] = br[1];

    System.out.println(ar[0].length);
    System.out.println();
}
}
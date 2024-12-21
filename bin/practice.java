public class practice {
    public static void main(String[] args) {
        for (int i = 1; i <=6; i++) {
            for (int k = 1; k <=i; k++) {
               
                    System.out.print(" "+k);
                
            }
            
            System.out.println();
        }
        System.err.println("");

        for (int i = 7; i >=1; i--) {
            for (int k = 1; k <i; k++) {
                System.out.print(" "+k);
            }
            
            System.out.println();
        }

        System.err.println("");

        for (int i = 1; i <=6; i++) {
            for (int k = i; k <=6; k++) {
                System.out.print("  ");
            }
            for (int j = 1; j <=i; j++) {
                System.out.print(" "+j);
            }
            
            System.out.println();
        }

       System.err.println("");

       for (int i = 6; i >=1; i--) {
        for (int k = i; k <=6; k++) {
            System.out.print("  ");
        }
        for (int k = 1; k <=i; k++) {
            System.out.print(" "+k);
        }
        
        System.out.println();
    }

    }
}
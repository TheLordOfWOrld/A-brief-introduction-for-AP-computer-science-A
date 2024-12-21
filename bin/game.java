public class game {

    public int getPlayer1Move(int round){
        int result;
        if(round % 3 == 0){
            result = 3;
        }
        else if(round % 2 == 0){
            result = 2;
        }
        else{
            result = 1;
        }
        return result;
    }
    public int getPlayer2Move(int round){
            int result;
            if(round % 3 == 0){
                result = 3;
           }
           else if(round % 2 == 0){
               result = 2;
           }
           else{
            result = 1;
        }
        return result;
    }
    public void playGame(){
        int startingcoins = 0;
        int maxrounds = 4;
        for(int i = 1; i <= maxrounds; i++){
            if(getPlayer1Move(startingcoins)==getPlayer2Move(startingcoins)&&i==4){
                System.err.println("tie game");
            }
            else if((getPlayer1Move(startingcoins)-getPlayer2Move(startingcoins))>=2){
                System.err.println("player 1 wins");
            }
            else if((getPlayer2Move(startingcoins)-getPlayer1Move(startingcoins))>=2){
                System.err.println("player 2 wins");
            }
        }
    }




    public static void main(String[] args) {

}
}
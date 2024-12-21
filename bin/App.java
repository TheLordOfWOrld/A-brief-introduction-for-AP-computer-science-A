import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception{
        System.err.print("enter the key :");
        Scanner input = new Scanner(System.in);
        String text = input.nextLine();
        String key0 = "QIWJDEOI233D";
        String key1 = "FNDJVNRWE234";
        String real_key = "1145141919810";
             if(text.equals(key1)||text.equals(key0)){
                   System.err.println("system active.......");

                           }
             else if (input.equals(real_key)){
                System.err.println("得分为：10但是该成绩不会上传至MAA（Mathematics Association of Afghanistan）");
                           }
             else{
                   System.err.println("wrong key ");
                   System.exit(0);
                                   }
        
        boolean ans =false;
        System.err.println("欢迎参加AMC（Afghanistan mathematics competition）输入Y可开始考试\n输入其他字符将视为弃权 ");
        String enter = input.nextLine();
        if(enter.equals("Y")){
            System.err.println("本次竞赛共有10道计算题，题目中的数字均为随机生成，答题时间不限，答对加一分答错扣两分不可以空题，\n输入除数字以外的符号程序将视为弃权并会退出\n请认真作答");
        }
        else if(enter.equals("CNMD")){
            System.err.println("已登录管理员账号，输入AAA可以显示答案");
            String key = input.nextLine();
            if (key.equals("AAA")) {
                ans =true;
            }

        }
        else if(enter.equals("FUCK")){
            System.err.println("我操死你的妈");
            System.exit(0);
        }
        else{
            System.err.println("你已弃权,程序即将推出。。。。。。");
            System.exit(0);
        }
        int score = 0;
        for(int i = 1; i<=10;i++){
        double num1 = Math.random()*10;
        double num2 = Math.random()*10;
        System.err.println("第"+i+"题"+num1+"+"+num2+"=？");
        if(ans){
         System.err.println(num1+num2);
        }
        
        double a = input.nextDouble();
       
        if(a==(num1+num2)){
            score+=1;
            
        }
        else{
            score-=2;
                }
    
    }
    
    System.err.println("考试已结束你的得分为："+score+"该成绩将上传至MAA（Mathematics Association of Afghanistan）");
    System.exit(0);
    input.close();
}    
}
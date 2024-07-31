public class LogicalOperators {

    public static void main(String[] args) {

        int boy = 18, girl = 68;

        if(boy > 10 && girl < 60){
            System.out.println("You can enter");
        }else{
            System.out.println("You can not enter");
        }


        if(boy > 10 || girl < 60){
            System.out.println("You can enter");
        }else{
            System.out.println("You can not enter");
        }
    }
}

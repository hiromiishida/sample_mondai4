public class Main {
    public static void main(String[] args) {

        System.out.println(gcp(1510, 350));

    }

    private static int gcp(int num1, int num2){
        int x = num1;
        int y = num2;

        while(x != y){
            if(x > y){
                x = x - y;
            }else{
                y = y - x;
            }
        }
        return x;
    }
}
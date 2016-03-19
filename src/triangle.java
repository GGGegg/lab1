import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 * Created by gewen on 16/3/18.
 */
public class triangle {
    /**
     * * @param 1：等边
     * * @param 2：等腰
     * * @param 3：其他种类
     * * @param 4：不能构成三角形
     * * @return
     * */
    public int type(double a,double b,double c){
        int result = 0;
        boolean b11 = a + b > c;
        boolean b12 = a + c > b;
        boolean b13 = b + c > a;
        if(b11 && b12 && b13){
            if(a == b && b == c){
                result = 1;
                System.out.println("等边三角形");
            }
            else if(a == b || b == c || a == c) {
                result = 2;
                System.out.println("等腰三角形");
            }
            else{
                result = 3;
                System.out.println("其他种类");
            }
        }
        else{
            result = -1;
            System.out.println("不能构成三角形");
        }
        return result;
    }
    public static void main(String[] args) {
        triangle t = new triangle();
        System.out.println(t.type(4, 4, 4));
    }
}



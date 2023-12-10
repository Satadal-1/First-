import java.util.*;
public class Arrays{
    public static void main(String Args[]){
     Scanner sc = new Scanner(System.in);
     int number = sc.nextInt();
     String[]name = new String[number];
     //input value
     for(int i = 0; i < number ; i++){
        name[i] = sc.next();
     }
     //output vaalue
     for(int i = 0; i < number; i++){
        System.out.println(name[i]);
     }

    }
}
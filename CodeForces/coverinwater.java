import java.util.*;
public class coverinwater {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n =sc.nextInt();
            String s = sc.next();
            int water = 0;
            int count =0;
            for(int i=0; i<n; i++){
                if(s.charAt(i)=='.'){
                    water++;
                    count++;
                    if(count==3){
                        water=2;
                        break;
                    }
                }
                else{
                    count=0;
                }
            }

            System.out.println(water);
        }
    }
}

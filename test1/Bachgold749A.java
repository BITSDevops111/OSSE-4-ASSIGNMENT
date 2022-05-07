import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bachgold749A {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        if(n%2 ==0)
        {
            System.out.println(n/2);
            for(int i =0;i<n/2;i++)
            {
                System.out.print(2+ " ");
            }
            System.out.println();
        }
        else
        {
            System.out.println(n/2);
            for(int i =0;i<n/2 -1;i++)
            {
                System.out.print(2+ " ");
            }
            System.out.print(3);
            System.out.println();


        }

    }
}

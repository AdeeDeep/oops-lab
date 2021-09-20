import java.io.*;
public class OddEven
{
    public static void main(String[] args)
    {
        try
        {
            FileReader fr = new FileReader("numbers.txt");
            BufferedReader br = new BufferedReader(fr);
            FileWriter fw1 = new FileWriter("even.txt");
            BufferedWriter bw1 = new BufferedWriter(fw1);
            FileWriter fw2 = new FileWriter("odd.txt");
            BufferedWriter bw2 = new BufferedWriter(fw2);
            String s;
            int a;
            while ((s = br.readLine()) != null) {
                a = Integer.parseInt(s);
                if (a % 2 == 0)
                    {
                        bw1.write(Integer.toString(a));
                        bw1.newLine();
                        bw1.flush();
                    }

                else {
                    bw2.write(Integer.toString(a));
                    bw2.newLine();
                    bw2.flush();
                }
            }


            br.close();
            fr.close();
            bw1.close();
            fw1.close();
            bw2.close();
            fw2.close();
        }
        catch(Exception e){

    }

    }
}
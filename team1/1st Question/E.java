import java.util.*;
public class E
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        ArrayList<String> problems = new ArrayList<String>();
        for(int x = 0; x<n;x++)
        {
            problems.add(input.next());
        }
        String answer;
        int x = 0;
        while(problems.indexOf("*")!=-1 || problems.indexOf("/")!=-1 || problems.indexOf("+")!=-1 || problems.indexOf("-")!=-1)
        {
            if(problems.get(x+1).equals("-"))
            {
                double first = Double.parseDouble(problems.get(x));
                double second = Double.parseDouble(problems.get(x+2));
                answer = "" + (double)(first-second);
                problems.set(x,answer);
                problems.remove(x+1);
                problems.remove(x+1);
            }
            else if(problems.get(x+1).equals("+"))
            {
                double first = Double.parseDouble(problems.get(x));
                double second = Double.parseDouble(problems.get(x+2));
                answer = "" + (double)(first+second);
                problems.set(x,answer);
                problems.remove(x+1);
                problems.remove(x+1);
            }
            else if(problems.get(x+1).equals("*"))
            {
                double first = Double.parseDouble(problems.get(x));
                double second = Double.parseDouble(problems.get(x+2));
                answer = "" + (double)(first*second);
                problems.set(x,answer);
                problems.remove(x+1);
                problems.remove(x+1);
            }
            else if(problems.get(x+1).equals("/"))
            {
                double first = Double.parseDouble(problems.get(x));
                double second = Double.parseDouble(problems.get(x+2));
                answer = "" + (double)(first/second);
                problems.set(x,answer);
                problems.remove(x+1);
                problems.remove(x+1);
            }
        }
        if(Double.parseDouble(problems.get(0))%1==0)
        {
            System.out.println((int)Double.parseDouble(problems.get(0)));
        }
        else
        System.out.println(String.format("%.1f",Double.parseDouble(problems.get(0))));
    }
}
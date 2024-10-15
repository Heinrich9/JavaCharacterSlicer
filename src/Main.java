import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main
{
    static void print(String s)
    {
        System.out.println(s);
    }
    public static void main(String[] args)
    {
        int numIndexesChosen = 0;
        Scanner scanner = new Scanner(System.in);

        Character [] chars = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        ArrayList<ArrayList<Character>> charsMatrix = new ArrayList<>();

        for (int i = 0; i < chars.length; i++)
        {
            System.out.println("index: "+ i + " = " + chars[i]);
        }

        print("\nChoose your indexes you wish to slice at (press 0 to end): \n");

        String lineRead = scanner.next();
        int indexRead = Integer.parseInt(lineRead);

        ArrayList <Integer> indexSlices = new ArrayList<>();

        while(!lineRead.equals("0"))
        {
            indexSlices.add(indexRead);

            numIndexesChosen++;
            lineRead = scanner.next();
            indexRead = Integer.parseInt(lineRead);
        }
        int firstIndex = 0;
        int lastIndex = chars.length-1;

        print("\nYou have inputted "+numIndexesChosen+" indexes");

        print("The indexes you entered: \n");

        for (int i = 0; i < indexSlices.size(); i++)
        {
            print(indexSlices.get(i).toString());
        }

        print("\nThe characters for those indexes: \n");

        for (int i = 0; i < indexSlices.size(); i++)
        {
            print(chars[indexSlices.get(i)].toString());
        }

        print("\nSorting indexes...\n");

        indexSlices.add(firstIndex);
        indexSlices.add(lastIndex);

        Collections.sort(indexSlices);

        int numIndexesInTotal = indexSlices.size();

        print("These are all the indexes you'll need to do the slices: \n");

        print(indexSlices +"\n");

        for (int i = 1; i < indexSlices.size(); i++)
        {
            for (int j = indexSlices.get(i-1); j <= indexSlices.get(i); j++)
            {
                print(chars[j].toString());
            }
            print("********************");
        }
    }
}
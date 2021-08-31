package zpracticeQuestions;
import java.util.*;
public class NestedLists {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of ArrayLists : ");
        int n = sc.nextInt();
        List<List<Integer>> rows = new ArrayList<>();
        int count = 1;
        for(int i=0; i<n; i++){
            System.out.print("Enter size of List " + count + " : ");
            count++;
            int d = sc.nextInt();
            System.out.print("Enter elements : ");
            List<Integer> row = new ArrayList<>();
            for(int j=0; j<d; j++){
                row.add(sc.nextInt());
            }
            rows.add(row);
        }
        System.out.println();
        int count2 = 1;
        System.out.print("Enter number of queries : ");
        int q = sc.nextInt();
        for(int i=0; i<q; i++){
            System.out.print("Enter query number " + count2 + " : ");

            System.out.println(" Enter x and y : ");
            int x = sc.nextInt();
            int y = sc.nextInt();

            System.out.println("Solution for query "+ count2 + " : ");
            try{
                System.out.println(rows.get(x-1).get(y-1));
            }
            catch (Exception e){
                System.out.println("ERROR!!!");
            }
            count2++;
        }
    }
}

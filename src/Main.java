import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Consumer res = m -> {
            int max = 0, maxIndex = 0;
            for(int i = 0; i < m.length; i++){
                HashSet<Character> letterHashSet = new HashSet<>();
                for(int j = 0; j < m[i].length(); j++){
                    letterHashSet.add(m[i].charAt(j));
                }
                if(max <= letterHashSet.size()){
                    max = letterHashSet.size();
                    maxIndex = i;
                }
            }
            return m[maxIndex];
        };

        Scanner in = new Scanner(System.in);
        int linesAmount = in.nextInt();
        String[] lines = new String[++linesAmount];
        for(int i = 0; i < linesAmount; i++){
            lines[i] = in.nextLine();
        }

        System.out.println(res.diversity(lines));
    }
}

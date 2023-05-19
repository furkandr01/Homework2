import java.util.*;

public class question2 {
    public static void main(String[] args) {
        List<LinkedList<Integer>> input = new ArrayList<>();
        input.add(new LinkedList<>(List.of(1, 2, 4)));
        input.add(new LinkedList<>(List.of(2, 3, 5)));
        input.add(new LinkedList<>(List.of(3, 6)));

        LinkedList<Integer> mergedList = mergeLinkedLists(input); 
        System.out.println("Birleştirilmiş Liste: " + mergedList);
    }

    private static LinkedList<Integer> mergeLinkedLists(List<LinkedList<Integer>> lists) {
        LinkedList<Integer> mergedList = new LinkedList<>();

        // Tüm linked listlerin elemanlarını yeni bir birleştirilmiş liste yap
        for (LinkedList<Integer> list : lists) {
            mergedList.addAll(list);
        }

        // Birleştirilmiş listeyi sırala
        Collections.sort(mergedList);

        return mergedList;
    }
}
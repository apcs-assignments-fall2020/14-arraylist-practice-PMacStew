import java.util.ArrayList;

public class MyMain {

    // Counts the number of odd numbers in list
    public static int countOdd(ArrayList<Integer> list) { 
        int count = 0;
        for (int i = 0; i < list.size(); i++) {
            if (Math.abs(list.get(i)) % 2 == 1) 
                count++;
        }
        return count;
    }

    // Returns true if there is an int that appears in both lists
    public static boolean checkDuplicates(ArrayList<Integer> list1, ArrayList<Integer> list2) { 
        for (int i = 0; i < list1.size(); i++) {
            for (int j = 0; j < list2.size(); j++) {
                if (list1.get(i) == list2.get(j))
                    return true;
            }
        }
        return false;
    }

    // Takes an int[] as input and returns the equivalent ArrayList<Integer>
    public static ArrayList<Integer> convertToArrayList(int[] arr) { 
        ArrayList<Integer> list = new ArrayList();
        for (int i = 0; i < arr.length; i++) 
            list.add(arr[i]);
        return list;
    }


    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList();
        list.add(2);
        list.add(2);
        list.add(3);
        list.add(3);
        System.out.println(list);
        System.out.println(countOdd(list));
    }
}

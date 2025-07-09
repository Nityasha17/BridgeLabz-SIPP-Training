package DSA_Sorting;

public class CountingSortStudentAges {
    public static void countingSort(int[] ages, int maxAge) {
        int[] count = new int[maxAge + 1];
        for (int age : ages) {
            count[age]++;
        }

        int index = 0;
        for (int i = 0; i <= maxAge; i++) {
            while (count[i]-- > 0) {
                ages[index++] = i;
            }
        }
    }

    public static void main(String[] args) {
        int[] ages = {15, 13, 12, 18, 13, 15, 10};
        int maxAge = 18; // known max
        countingSort(ages, maxAge);
        System.out.println("Sorted Student Ages:");
        for (int age : ages) {
            System.out.print(age + " ");
        }
    }
}

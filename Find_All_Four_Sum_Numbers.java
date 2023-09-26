package ashhad.array;

import java.util.ArrayList;
import java.util.Arrays;

public class Find_All_Four_Sum_Numbers {
    public static void main(String[] args) {
        int[] arr = {0,0,2,1,1};
        int k = 3;
        ArrayList<ArrayList<Integer>> result = fourSum(arr,k);
        System.out.println(result.toString());
    }

    private static ArrayList<ArrayList<Integer>> fourSum(int[] arr, int k) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        Arrays.sort(arr);

        int n = arr.length;

        for (int i = 0; i < n - 3; i++) {
            if (i > 0 && arr[i] == arr[i - 1]) {
                continue; // Skip duplicates
            }

            for (int j = i + 1; j < n - 2; j++) {
                if (j > i + 1 && arr[j] == arr[j - 1]) {
                    continue; // Skip duplicates
                }

                int left = j + 1;
                int right = n - 1;

                while (left < right) {
                    int sum = arr[i] + arr[j] + arr[left] + arr[right];

                    if (sum == k) {
                        ArrayList<Integer> list = new ArrayList<>();
                        list.add(arr[i]);
                        list.add(arr[j]);
                        list.add(arr[left]);
                        list.add(arr[right]);
                        result.add(list);
                        left++;
                        right--;

                        // Skip duplicates
                        while (left < right && arr[left] == arr[left - 1]) {
                            left++;
                        }

                        while (left < right && arr[right] == arr[right + 1]) {
                            right--;
                        }
                    } else if (sum < k) {
                        left++;
                    } else {
                        right--;
                    }
                }
            }
        }
        return result;
    }
}

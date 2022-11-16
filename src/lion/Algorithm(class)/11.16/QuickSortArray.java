package javalion.week9.day3;

public class QuickSortArray {



    public static void main(String[] args) {
        var arr = new int[] {20, 18, 5, 19, 40, 50, 5, 25};
        int pivot = arr[arr.length / 2 ];
        System.out.println(pivot);

        int leftIdx = 0;
        int rightIdx = arr.length - 1;
        while(arr[leftIdx] < pivot) {
            leftIdx += 1;
            System.out.println();
        }
        while(arr[rightIdx] > pivot) {
            leftIdx -= 1;
        }

        int temp = arr[leftIdx];
        arr[leftIdx] = arr[rightIdx];
        arr[rightIdx] = temp;

        leftIdx += 1; // 교환했으므로 +1
        rightIdx -= 1; // 교환했으므로 -1

        System.out.printf("4:%d 7:%d", arr[4], arr[7]);
        System.out.printf("leftIdx:%d right:%d%n", leftIdx, rightIdx);
    }
}


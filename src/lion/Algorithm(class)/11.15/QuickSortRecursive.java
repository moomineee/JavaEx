package javalion.week9.day2;

import java.util.ArrayList;
import java.util.List;


// 탈출 조건 추가
public class QuickSortRecursive {
    // list 합치는 것
    public List<Integer> merge(List<Integer> left, List<Integer> mid, List<Integer> right) {
        List<Integer> answer = new ArrayList<>();
        answer.addAll(left);
        answer.addAll(mid);
        answer.addAll(right);
        return answer;
    }

    public List<Integer> sort(List<Integer> arr) {

        // 3. 재귀 탈출 조건
        if (arr.size() <= 1) {
            return arr;
        }

        // 1. 기준값 뽑는 로직 구현
        int pivot = arr.get(arr.size() / 2);
        System.out.println(pivot);

        // 2. 기준값 기준으로 좌 우로 나누어 담는 로직 구현
        // List<Integer>, List<Integer>, List<Integer>에 담는다.
        List<Integer> left = new ArrayList<>();
        List<Integer> right = new ArrayList<>();
        List<Integer> mid = new ArrayList<>();

        for (int i = 0; i < arr.size(); i++) {
            if(pivot > arr.get(i)) {
                left.add(arr.get(i));
            } else if (pivot < arr.get(i)) {
             right.add(arr.get(i));
            } else {
                mid.add(arr.get(i));
            }
        }
        System.out.println(left);
        System.out.println(right); // 20, 18, 19 25, 40, 50

        // list를 합치는 연산
        return merge(sort(left), mid, sort(right)); // 재귀의 경우 retrun하기 전 작아진 단위를 sort해야 함.
        // mid에 sort하면 무한루프
    }

    public static void main(String[] args) {
        var arr = new int[]{20, 18, 5, 19, 5, 25, 40, 50};
        List<Integer> al = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            al.add(arr[i]);
        }
        QuickSortRecursive qr = new QuickSortRecursive();
        qr.sort(al);
    }
}

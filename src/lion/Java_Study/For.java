public class For {
    public static void main(String[] args) {


        1부터 6까지 각 자리수의 합을 구해보자

        int sum = 0;

        for (int i = 1 ; i <= 5 ; i++) {
            sum += i;
            System.out.printf("1부터 %d까지의 합 : %d%n" , i, sum);
        }

        for (int i = 0; i < 5; i++) { // 밑의 for문을 5번 반복해라
            for (int j = 0; j < 10; j++) {  //오른쪽으로 별 10개 찍어라
                System.out.print("*");
            }
            System.out.println(); // 줄바꿈만 하는 것
        }


        // 왼쪽 정렬 직각 삼각형 모양으로 별 찍기
        for (int i = 0; i < 5; i++) { //
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }


        // 오른쪽 정렬 직각삼각형
        for (int i = 1; i <= 5; i++) {   //다섯개의 줄 생성
            for (int j = 5; j > 0; j--) { // 5개의 줄이므로 5에서부터 줄어들며 반복 수행
                if (j > i) {  // 줄의 순서(ex n번째 줄)보다 클 경우 -> 공백인 부분
                    System.out.print(" "); // 공백 출력
                } else { // 줄의 순서보다 작거나 같을 경우 (별을 찍어야 하는 부분)
                    System.out.print("*"); // * 출력
                }
            }
            System.out.println(); // 줄 바꿈
        }


        for (int i = 0; i < 5; i++) {     // 줄 다섯개 생성
            for (int j = 0; j <= i; j++) { // i가 0일떄 i=j니까 참이므로 '한번' 반복. i가 1이면 j는 1이면 두번 반복.
                System.out.print("*");
            }
            System.out.println();
        }


        // 이중 for 문 - 왼쪽 정렬된 역 직각삼각형 형태 그리기(5*5)
        for (int i = 0; i < 5; i++) {
            for (int j = 5 ; j > i ; j--) {  // j가 5이면, i는 0. 따라서 j는 별을 다섯개 찍는다. i가 1이 되면 j는 별을 네개 찍는다.
                System.out.print("*");
            }
            System.out.println();
        }
        // 이중 for문의 구조.
        for (int i = 0; i < 5; i++) {
            System.out.print("i-for문 진입 i="+i + "|");
            for (int j = 5; j > i ; j--) {
                System.out.print(" j-for문 진입 j= "+j+", i="+i);
               // System.out.print("*");
            }
            System.out.println();
        }

        //외부 for문이 i-for문. 내부 for문이 j-for문.


//        Q. 두 번째 반복때 왜 별이 세개가 아니라 네개 찍히는가?
//         - for 문의 범위 설정에 대한 이해 부족. 내부의 for문인 j-for문은 반복이 끝나면 j=4가 되는 것이 아니라 5인 상태 그대로 있다.
//         - 외부의 for문인 i-for문이 재 실행될 때 초기화 되는 것. (i 값이 0에서 1로 i++에 의해 증가하는 것과는 다르다.)
//         - for문의 블럭을 보고 범위를 잘 파악하는 것이 중요하다. 내부의 for문은 반복이 끝나면 초기화 된다.
//         -


    }
}



        // 마름모형 도형 출력 (3 + 1 + 3) 1이 7칸 기준으로 2씩 줄어듬.

        int a = 1; // 회색 칸의 시작 개수
        int b = 3; // 공백의 시작 개수

        for (int i = 0; i < 7; i++) { // 7개의 줄 생성
            if (i < 3) {
                for (int j = b ; j > 0; j--) {
                    System.out.print(" ");
                }
                for (int j = 0; j < a ; j++) {
                    System.out.print("*");
                }
                for (int j = b ; j > 0; j--) {
                    System.out.print(" ");
                }
                System.out.println();

                a += 2; // a의 크기 2 증가 ( 가운뎃 줄 - 7칸 짜리 . 빈칸없이 꽉 차는 줄)
                b--; // b (공백)의 크기 1 감소
            } else {  // 가운뎃줄부터 시작
                for (int j = 0; j < b ; j++) { // b(흰부분, 공백)의 크기만큼 반복
                    System.out.print(" ");
                }
                for (int j = a ; j > 0 ; j--) { // a( *이 찍혀야 하는 부분)의 크기만큼 반복
                    System.out.print("*");
                }
                for (int j = 0; j < b ; j++) { // b (공백이어야 하는 곳 )의 크기만큼 반복
                    System.out.print(" ");
                }
                System.out.println();

                a -= 2; // a는 *이 찍혀야 하는 크기 -2
                b++; // b는 공백의 크기가 1씩 증가
            }
        }







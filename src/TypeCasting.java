public class TypeCasting {

    public void divide (int first, int second) {

        float fFirst = (float) first;
        float fSecond= (float) second;
        float result = fFirst / fSecond;
        System.out.println(result);
    }

    public static void main(String[] args) {

        TypeCasting tc = new TypeCasting();

        // static으로 만들지 않으면 Typecasting으로 divide를 호출하여 사용.

        float first = 2;
        float second = 3;
        // int 끼리의 연산은 int 타입으로 나옴. 그러나 얻고 싶은 값은 소수.
        // 소수는 Integer 타입으로 표현 불가.
        // 따라서 Type(형태의)Casting(변환)이 필요함.
        //1/2가 0.5가 나오게
        float result = first / second ;
        System.out.println( first / second );
    }
}

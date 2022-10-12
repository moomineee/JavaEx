
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class WhyClass {
    // 클래스는 무엇인가요?
    // Method는 무엇일까요?
    public static void main(String[] args) {

//        id(Pk) String
//        address
//        district
//        category
//        emergency_room
//        name
//        subdivision
//
//        A1120837	서울특별시 금천구 벚꽃로 286 삼성리더스타워 111~114호 (가산동)	C	의원	G099	응급의료기관 이외	2	외과: 상시진료 내과는 당분간 휴진	서울시 송파구 문정동 장지동 법조단지 위례 가락동 가락시장역 위치 삼성서울병원 외래교수 출신 구강외과 전문의 진료 진료과목 - 임플란트 치조골 뼈이식 수술 매복 사랑니 발치 턱관절 악관절 질환의 치료 교정 치료 및 기타 보존 보철(크라운 브릿지 인레이) 신경치료	방이역 1번출구 바로옆 굿모닝 신한증권 뒷건물	가산기대찬의원	02-6267-2580	02-920-5374	1930	1930	1930	1930	1930	1500	1500	1500	900	900	900	900	900	900	1000	1000	85

        String[] arr = new String[7];
        arr[0] = "A1120837";
        arr[1] = "서울특별시 금천구 벚꽃로 286 삼성리더스타워 111~114호 (가산동)";
        arr[2] = "서울특별시 금천구";
        arr[3] = "C";
        arr[4] = "2";

        int emergencyRoom = Integer.parseInt(arr[4]);

        Hospital hospital = new Hospital(
                "A1120837",
                "서울특별시 금천구 벚꽃로 286 삼성리더스타워 111~114호 (가산동)",
                "C",
                2,
                "365병원",
                null
        );

        System.out.println(hospital.getDistrict());

        List list = new Vector();
        list.add("hello");
        list.add(2);

        String a = (String) list.get(0);
        int b = (int) list.get(1);

        List<String> l2 = new ArrayList<>();
        l2.add("hello");

        String c = l2.get(0);
    }
}
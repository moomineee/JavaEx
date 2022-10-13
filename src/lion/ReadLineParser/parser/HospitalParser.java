package com.line.parser;

import com.line.domain.Hospital;

public class HospitalParser implements Parser<Hospital> {

    public String getSubdivision(String name) {
        String[] subdivisions = {"소아과", "피부과", "성형외과", "정형외과", "산부인과", "관절", "봉합", "화상", "골절", "영유아", "안과", "가정의학과", "비뇨기과", "치과", "내과", "외과" };
        for (String subdivision : subdivisions) {
            if (name.contains(subdivision)) {
                return subdivision;
            }
        }
        return "";
    }

    @Override
    public Hospital parse(String str) {
        str = str.replaceAll("\"", "");
        String[] splitted = str.split(",");
//        address;
//        district;
//        category;
//        Integer emergencyRoom;
//        name;
//        subdivision;

        String name = splitted[10];
        String subdivision = getSubdivision(name);
        // subdivision 파싱을 할거냐, 넣을때 set을 해서 좋겠냐.  parsing을 해서 넣는 것이 좋을 듯.
        // district는 주소가지고 자르는게 예외 케이스가 없음. 근데 subdivision은 예외가 많이 나올것 같아서.

        return new Hospital(splitted[0], splitted[1], splitted[2], Integer.parseInt(splitted[6]),
                name, subdivision);
    }
}

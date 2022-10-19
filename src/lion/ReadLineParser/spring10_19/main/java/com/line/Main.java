package com.line;

import com.line.domain.Hospital;
import com.line.parser.HospitalParser;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
//        LineReader<Hospital> hospitalLineReader = new LineReader<>(new HospitalParser());
        FileController<Hospital> hospitalFileController = new FileController<>(new HospitalParser());
        String filename = "/Users/moomin/Downloads/seoul_hospital_infos.csv";
//        List<Hospital> hospitals = hospitalLineReader.readLines(filename);
          List<Hospital> hospitals = hospitalFileController.readLines(filename);


        System.out.println(hospitals.size());
        List<String> sqlStatements = new ArrayList<>();
        for (Hospital hospital : hospitals) { // hospitals에서 하나씩 꺼내겠다.
            sqlStatements.add(hospital.getSqlInsertQuery());
//            System.out.printf("%s,%s,%s,%s,%d,%s,%s\n", hospital.getId(), hospital.getAddress(), hospital.getDistrict(),
//                    hospital.getCategory(), hospital.getEmergencyRoom(), hospital.getName(), hospital.getSubdivision());
//                System.out.println(hospital.getSqlInsertQuery());
            }
        String sqlFilename = "seoul_hospital_insert.sql";
        hospitalFileController.createANewFile(sqlFilename); // 파일을 만듦.
        hospitalFileController.writeLines(sqlStatements, sqlFilename); //앞에서 생성한 sql구문들을 sqlfilename에다가 write를 해라.
    }
}

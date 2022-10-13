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
        List<String> lines = new ArrayList<>();
        for (Hospital hospital : hospitals) {
            lines.add(hospital.getSqlInsertQuery());
//            System.out.printf("%s,%s,%s,%s,%d,%s,%s\n", hospital.getId(), hospital.getAddress(), hospital.getDistrict(),
//                    hospital.getCategory(), hospital.getEmergencyRoom(), hospital.getName(), hospital.getSubdivision());
//                System.out.println(hospital.getSqlInsertQuery());
            }
        String sqlFilename = "hospital_insert.sql";
        hospitalFileController.createANewFile(sqlFilename);
        hospitalFileController.writeLines(lines, sqlFilename);
    }
}

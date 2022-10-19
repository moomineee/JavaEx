package com.line;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LineReaderBeforeRefac {
    List<String> readLines(String filename) throws IOException {
        List<String> result = new ArrayList<>();
        BufferedReader br = new BufferedReader((new FileReader(filename)));
        String str;
        while ((str = br.readLine()) !=null) {
            result.add(str);
        }
        return result;
    }

    public static void main(String[] args) throws IOException {
        String filename = "/Users/moomin/Downloads/seoul_hospital_infos.csv";
        LineReaderBeforeRefac lr = new LineReaderBeforeRefac();
        List<String> lines = lr.readLines(filename);
        System.out.println(lines.size());
    }
}

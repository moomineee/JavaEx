package com.line;

import com.line.parser.Parser;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LineReaderRE<T> {
    Parser<T> parser;

    public LineReaderRE(Parser<T> parser) {
        this.parser = parser;
    }

    List<T> readLines(String filename) throws IOException {
        List<T> result = new ArrayList<>();
        BufferedReader br = new BufferedReader((new FileReader(filename)));
        String str;
        while ((str = br.readLine()) !=null) {
            result.add(parser.parse(str));
        }
        return result;
    }

    public static void main(String[] args) throws IOException {
        String filename = "/Users/moomin/Downloads/서울시 병의원 위치 정보.csv";
        LineReaderRE lr = new LineReaderRE();
        List<String> lines = lr.readLines(filename);
        System.out.println(lines.size());
    }
}

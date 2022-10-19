package com.line.domain;

public class Hospital {
    private String id;
    private String address;
    private String district;
    private String category;
    private int emergencyRoom;
    private String name;
    private String subdivision;

    public Hospital(String id, String address, String category, int emergencyRoom, String name, String subdivision) {
        this.id = id; //.replaceAll("\"", "");; //[0]
        this.address = address;  //[1]
        this.setDistrict(); // [1]
        this.category = category; // [2]
        this.emergencyRoom = emergencyRoom; // [6]
        this.name = name; // [10]
        this.subdivision = subdivision; // [10]
    }

    public String getSqlInsertQuery() {
        String sql = String.format("INSERT INTO `likelion-db`.`seoul_hospital`\n" +
                "(`id`,`address`,`district`,`category`,`emergency_room`,`name`,`subdivision`)\n"+
                "VALUES\n" +
                "(\"%s\",\n" +
                "\"%s\",\n" +
                "\"%s\",\n" +
                "\"%s\",\n" +
                "%d,\n" +
                "\"%s\",\n" +
                "\"%s\");", this.id, this.address, this.district, this.category, this.emergencyRoom, this.name, this.subdivision);
        return sql;
    }
    // insert query 만드는 로직 튜닝
//    public String getTupleString() {
//        String sql = String.foramt()
//    }
    public String getSqlInsertQuery2() {
        String sql = String.format("INSERT INTO `likelion-db`.`seoul_hospital`(`id`,`address`,`district`,`category`,`emergency_room`,`name`,`subdivision`)\n"+
                "VALUES\n" +
                        "(\"%s\",\"%s\",\n" +
                        "\"%s\",\"%s\",%d,\"%s\",\"%s\");",
                this.id, this.address, this.district, this.category, this.emergencyRoom, this.name, this.subdivision);
        return sql;
    }

    public String getTupleString() {
        String sql = String.format(
                "(\"%s\",\"%s\"," +"\"%s\"," +
                        "\"%s\"," +"%d," +"\"%s\"," +"\"%s\");",
                this.id, this.address, this.district, this.category, this.emergencyRoom, this.name, this.subdivision);
        return sql;
    }


    private void setDistrict() {
        String[] splitted = this.address.split(" ");
        this.district =  String.format("%s %s", splitted[0], splitted[1]);
    }

//    public Hospital(String id, String address) {
//        this.id = id;
//        this.address = address;
//    }

//    public Hospital(String id) {
//        this.id = id.replaceAll("\"", "");
//        // id set할 때 .를 빈칸으로
//    }

    public String getId() {

        return id;
    }

    public String getAddress() {

        return address;
    }

    public String getDistrict() {

        return district;
    }

    public String getCategory() {

        return category;
    }

    public Integer getEmergencyRoom() {

        return emergencyRoom;
    }

    public String getName() {

        return name;
    }

    public String getSubdivision() {

        return subdivision;
    }
}
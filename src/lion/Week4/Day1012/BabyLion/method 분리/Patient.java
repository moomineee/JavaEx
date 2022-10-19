
public class Patient {
    // 생성자가 없으면 java가 parameter가 없는 생성자를 실행합니다.
    private String id;

    public Patient() {
    }

    public void setId(String id) {
        this.id = id;
    }

    public Patient(String id) {
        this.id = id;
    }

    public static void main(String[] args) {
        Patient patient = new Patient();
        patient.setId("11");
    }
}


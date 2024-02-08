package Quiz.WeeklyQuiz.Week3;

public class Contact{
    private String name;
    private String phoneNumber;

    public Contact(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }


    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public String toString() {
        String output = "이름: %s, 전화번호: %s".formatted(name, phoneNumber);
        return output;
    }
}

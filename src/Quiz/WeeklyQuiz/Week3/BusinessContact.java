package Quiz.WeeklyQuiz.Week3;

public class BusinessContact extends Contact{

    private String company;

    public BusinessContact(String name, String phoneNumber, String company) {
        super(name, phoneNumber);
        this.company = company;
    }

    public String getCompany() {
        return company;
    }

    @Override
    public String toString() {
        String output = "이름: %s, 전화번호: %s, 회사명: %s".formatted(getName(), getPhoneNumber(),getCompany());
        return output;
    }
}

public class Contact {
    private String name;
    private String electronicmail;
    private Integer age;
    private String phone;

    public Contact(String name, String electronicmail, int age, String phone) {
        this.name = name;
        this.electronicmail = electronicmail;
        this.age = age;
        this.phone = phone;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getElectricemail() {
        return electronicmail;
    }

    public void setEmail(String electronicmail) {
        this.electronicmail = electronicmail;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String print() {
        return "Contact{" +
                "name='" + name + '\'' +
                ", electronic mail='" + electronicmail + '\'' +
                ", age=" + age +
                ", phone='" + phone + '\'' +
                '}';
    }
}

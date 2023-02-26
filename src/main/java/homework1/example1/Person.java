package homework1.example1;

/*
1. Создать builder для класса Person со следующими полями: String firstName, String lastName, String middleName, String country, String address, String phone, int age, String gender.
 */
public class Person {

    private String firstName;
    private String lastName;
    private String middleName;
    private String county;
    private String address;
    private String phone;
    private int age;
    private String gender;

    public Person(PersonBuilder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.middleName = builder.middleName;
        this.county = builder.county;
        this.address = builder.address;
        this.phone = builder.phone;
        this.age = builder.age;
        this.gender = builder.gender;
    }

    static class PersonBuilder {
        private String firstName;
        private String lastName;
        private String middleName;
        private String county;
        private String address;
        private String phone;
        private int age;
        private String gender;


        public PersonBuilder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public PersonBuilder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public PersonBuilder setMiddleName(String middleName) {
            this.middleName = middleName;
            return this;
        }

        public PersonBuilder setCounty(String county) {
            this.county = county;
            return this;
        }

        public PersonBuilder setAddress(String address) {
            this.address = address;
            return this;
        }

        public PersonBuilder setPhone(String phone) {
            this.phone = phone;
            return this;
        }

        public PersonBuilder setAge(int age) {
            this.age = age;
            return this;
        }

        public PersonBuilder setGender(String gender) {
            this.gender = gender;
            return this;
        }

        public Person build() {
            return new Person(this);
        }
    }
}

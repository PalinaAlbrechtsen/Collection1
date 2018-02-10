package homework.second;

public class Student {

    private String name;
    private String surname;
    private Double averageScore;
    private Integer age;

    public Student(String name, String surname, Double averageScore, Integer age) {

        this.name = name;
        this.surname = surname;
        this.averageScore = averageScore;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + " " + surname + ", " + age + ". Средний балл за год: " + averageScore;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Double getAverageScore() {
        return averageScore;
    }

    public void setAverageScore(Double averageScore) {
        this.averageScore = averageScore;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}

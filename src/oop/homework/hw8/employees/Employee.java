package oop.homework.hw8.employees;

public class Employee {
    private String surname;
    private  String name;
    private  String post;
    private  int salary;

    public Employee(String surname, String name, String post, int salary) {
        this.surname = surname;
        this.name = name;
        this.post = post;
        this.salary = salary;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() { //гетер получить информацию
        return name;
    }

    public void setName(String name) { // сетер добавить информацию
        this.name = name;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", post='" + post + '\'' +
                ", salary=" + salary +
                '}';
    }
}

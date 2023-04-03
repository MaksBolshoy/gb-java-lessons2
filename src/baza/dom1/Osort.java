package baza.dom1;

//import com.google.gson.Gson;

import com.github.cliftonlabs.json_simple.JsonArray;
import netscape.javascript.JSObject;
import org.json.simple.JSONObject;

public class Osort {
   //JSONObject
//    public static void main(String[] args) {
//        String jsonString = "[{\"фамилия\":\"Иванов\",\"оценка\":\"5\",\"предмет\":\"Математика\"}, {\"фамилия\":\"Петрова\",\"оценка\":\"4\",\"предмет\":\"Информатика\"}, {\"фамилия\":\"Краснов\",\"оценка\":\"5\",\"предмет\":\"Физика\"}]";
//        Gson gson = new Gson();
//        Student[] students = gson.fromJson(jsonString, Student[].class);
//        StringBuilder builder = new StringBuilder();
//        for (Student student : students) {
//            builder.append("Студент ")
//                    .append(student.getLastName())
//                    .append(" получил ")
//                    .append(student.getGrade())
//                    .append(" по предмету ")
//                    .append(student.getSubject())
//                    .append(".\n");
//        }
//        System.out.println(builder.toString());
//    }

    private static class Student {
        private String lastName;
        private int grade;
        private String subject;

        public String getLastName() {
            return lastName;
        }

        public int getGrade() {
            return grade;
        }

        public String getSubject() {
            return subject;
        }

        @Override
        public String toString() {
            return "Студент{" +
                    "фамилия='" + lastName + '\'' +
                    ", оценка='" + grade + '\'' +
                    ", предмет='" + subject + '\'' +
                    '}';
        }
    }
}
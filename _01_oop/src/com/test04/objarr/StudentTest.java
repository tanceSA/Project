package com.test04.objarr;

/**
 * ClassName: TestStudent
 * Package: com.test04.objarr
 * Description:
 *
 * @Author: TANCE
 * @Create 2023/3/3 下午 03:15
 * @Version 1.0
 */
public class StudentTest {
    public static void main(String[] args) {

        Student[] students = new Student[20];

        for(int i=0;i<students.length;i++) {
            students[i] = new Student();
            students[i].number = i + 1;
            students[i].state = (int)(Math.random() * 6 + 1);
            students[i].score = (int)(Math.random() * 101);
        }

        StudentUtil util = new StudentUtil();
        util.listStudents(students);

        System.out.println("************************");

        //列出三年級的學生
        util.showStateStudents(students,3);

        System.out.println("************************");

        //利用泡泡排序按學生成績由大到小排序
        util.sortStudentsByScore(students);

        //列出所有學生訊息
        util.listStudents(students);

        System.out.println("************************");

        util.listStudents(students, 60);

    }
}

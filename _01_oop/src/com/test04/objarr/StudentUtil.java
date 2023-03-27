package com.test04.objarr;

/**
 * ClassName: StudentUtil
 * Package: com.test04.objarr
 * Description:
 *
 * @Author: TANCE
 * @Create 2023/3/3 下午 03:52
 * @Version 1.0
 */
public class StudentUtil {

    public void showStateStudents(Student[] students, int state){//列出指定年級的學生
        for(int i = 0; i < students.length; i++) {
            if (students[i].state == state) {
                String info = students[i].show();
                System.out.println(info);
            }
        }
    }


    public void sortStudentsByScore(Student[] students){//利用泡泡排序按學生成績由大到小排序
        for(int i = 0; i < students.length-1; i++){
            for(int j = 0; j < students.length - 1 - i; j++){
                if(students[j].score < students[j+1].score){
                    Student temp = students[j];
                    students[j] = students[j+1];
                    students[j+1] = temp;
                }
            }
        }
    }

    public void listStudents(Student[] students){
        //列出所有學生訊息
        for(int i = 0; i < students.length; i++){
            String info = students[i].show();
            System.out.println(info);
        }
    }

    public void listStudents(Student[] students, int score){
        //列出所有指定成績以上的學生訊息,
        for(int i = 0; i < students.length; i++){
            if(students[i].score >= score){
                String info = students[i].show();
                System.out.println(info);
            }
        }
    }
}

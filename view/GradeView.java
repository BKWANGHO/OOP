package view;

import model.Member;
import model.Subject;
import service.GradeService;
import service.UtilService;
import serviceImpl.GradeServiceImpl;
import serviceImpl.UtilServiceImpl;

import java.util.Scanner;

public class GradeView {
    public static void main(Scanner sc) {
        System.out.println("다음은 학생의 이름, 국어, 영어, 수학 점수를 입력하세요");
        System.out.println("이름을 입력하세요");


        UtilService util = UtilServiceImpl.getInstance();
        GradeService grade = GradeServiceImpl.getInstance();
        Member student = Member.builder()
                .name(sc.next())
                .build();
        Subject subjects = Subject.builder()
                .korean(util.createRandomInteger(0,100))
                .english(util.createRandomInteger(0,100))
                .math(util.createRandomInteger(0,100))
                .build();

        int totalScore = grade.getTotalScore(subjects);
        double average = grade.findAverage(totalScore);

        System.out.printf("------성적표------\n" +
                "Korean : %s \n " +
                "English : %s \n " +
                "Math : %s\n " +
                "Total : %s\n Average : %.4s\n",
                subjects.getKorean(),
                subjects.getEnglish(),
                subjects.getMath(),
                totalScore,
                average);


    }
}

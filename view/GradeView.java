package view;

import builder.MemberBuilder;
import builder.SubjectBuilder;
import model.MemberDTO;
import model.SubjectDTO;
import service.GradeService;
import service.UtilService;
import serviceImpl.GradeServiceImpl;
import serviceImpl.UtilServiceImpl;

import java.util.Scanner;

public class GradeView {
    public static void main(String[] args) {
        System.out.println("다음은 학생의 이름, 국어, 영어, 수학 점수를 입력하세요");
        System.out.println("평균 점수를 구하시오");

        Scanner sc = new Scanner(System.in);
        UtilService util = UtilServiceImpl.getInstance();
        GradeService grade = GradeServiceImpl.getInstance();
        MemberDTO student = new MemberBuilder()
                .name(sc.next())
                .build();
        SubjectDTO subjects = new SubjectBuilder()
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
                "Total : %s\n Average : %.4s",
                subjects.getKorean(),
                subjects.getEnglish(),
                subjects.getMath(),
                totalScore,
                average);


    }
}

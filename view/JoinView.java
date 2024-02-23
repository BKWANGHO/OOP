package view;

import builder.MemberBuilder;
import model.MemberDTO;
import service.UtilService;
import serviceImpl.UtilServiceImpl;

import java.util.Scanner;

public class JoinView {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("ID,비밀번호,비밀번호확인,이름,주민번호,전화번호,주소,직업을 입력해주세요");

        MemberDTO person = new MemberBuilder()
                .username(sc.next())
                .password(sc.next())
                .confirmPassword(sc.next())
                .name(sc.next())
                .personId(sc.nextInt())
                .phoneNumber(sc.nextInt())
                .address(sc.next())
                .job(sc.next())
                .height(sc.nextInt())
                .weight(sc.nextInt())
                .build();


        System.out.println(person.toString());
    }



}

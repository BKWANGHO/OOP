package view;

import controller.AuthController;

import java.util.Scanner;

public class AuthView {
    public static void main(Scanner sc) {
        AuthController ctrl = new AuthController();
        ctrl.addUsers();
        while (true) {
            System.out.println("[메뉴] 0-종료\n " +
                    "1-ID검색\n " +
                    "2-회원목록\n " +
                    "3-회원수" +
                    "4-회원가입");
            switch (sc.next()) {
                case "0":
                    System.out.println("종료");
                    return;
                case "2":
                    System.out.println("=== 회원목록 ===");
                    ctrl.getUserMap();

                    break;
                case "3":
                    System.out.println("=== 회원수 ===");
                    System.out.println("총 회원 수 : " + ctrl.count() + "명");
                    break;
                case "4":
                    System.out.println("=== 회원가입 ===");
                    System.out.println(ctrl.join(sc));
                    break;
            }


        }


    }
}
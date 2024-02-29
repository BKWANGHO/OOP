import serviceImpl.UserServiceImpl;
import view.*;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String result = "";
        double re = 1.5;
        String si = "sibal";
        String ree = re+"";

        for (int i = 0; i < 5; i++) {
            result += si + ree + "\n";
        }

        System.out.println(result);


        while (true) {
            System.out.println(
                    "0-종료 1-Auth관리 2-성적표 3-게시판 4-카우프 5-사용자관리(맵) 6-통장관리");
            switch (sc.next()) {
                case "0": return ;
                case "1": AuthView.main(sc); break;
                case "2": GradeView.main(sc); break;
                case "3": BoardView.main(); break;
                case "4": KaupView.main(sc);  break;
                case "5": UserView.main(sc);  break;
                case "6": AccountView.main(sc); break;
            }
        }
    }


}

package view;

import builder.BoardBuilder;
import model.BoardDTO;
import service.UtilService;
import serviceImpl.UtilServiceImpl;

import java.util.ArrayList;
import java.util.List;

public class BoardView {
    public static void main(String[] args) {
        List<BoardDTO> articles = new ArrayList<>();
        UtilService util = UtilServiceImpl.getInstance();

        for(int i=0;i<5;i++) {
            articles.add(new BoardBuilder()
                    .title(util.createRandomTitle())
                    .content(util.createRandomContent())
                    .writer(util.createRandomName())
                    .build());
        }
//        for(BoardDTO b : articles) {
////            System.out.println("제  목 : " + b.getTitle() + "\n" +
////                    "내  용 : "+ b.getContent() + "\n" +
////                    "작성자 : " + b.getWriter() + "\n");
//
//            System.out.println(b.toString());
//        }
        articles.forEach(i->{
            System.out.println(i.toString());
        });



    }
}

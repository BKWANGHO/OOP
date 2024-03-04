package serviceImpl;

import model.Subject;
import service.GradeService;

    public class GradeServiceImpl implements GradeService {

        private static GradeService instance = new GradeServiceImpl();

        private GradeServiceImpl(){}

        public static GradeService getInstance (){
            return instance;
        }


    @Override
    public int getTotalScore(Subject subjects) {
        int totalScore = subjects.getKorean()+subjects.getEnglish()+subjects.getMath();
        return totalScore;
    }

    @Override
    public double findAverage(double totalScore) {
        double av = totalScore/3;
        return av;
    }



}

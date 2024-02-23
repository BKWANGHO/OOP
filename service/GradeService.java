package service;

import model.SubjectDTO;

public interface GradeService {

    int getTotalScore (SubjectDTO subjects);

    double findAverage (double totalScore);


}

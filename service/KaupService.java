package service;

import model.MemberDTO;

public interface KaupService {
    String createBmi(MemberDTO user);
    String createBodyMass(String bmi);




}

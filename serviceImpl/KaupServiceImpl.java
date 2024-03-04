package serviceImpl;

import model.Member;
import service.KaupService;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class KaupServiceImpl implements KaupService {


    List<? extends Member> kaupList;
    Map<String,Member> kaupMap;

    private static KaupService instance = new KaupServiceImpl();

    private KaupServiceImpl(){
            this.kaupMap = new HashMap<>();
            this.kaupList = new ArrayList<>();
    }

    public static KaupService getInstance (){
        return instance;
    }

    @Override
    public String createBmi(Member user) {

        double bmi =(user.getWeight()/(user.getHeight()*user.getHeight())*10000);

        return String.valueOf(bmi);
    }

    @Override
    public String createBodyMass(String bmi) {
        double bmiDouble = Double.parseDouble(bmi);
        String result = "";
        if(bmiDouble<18.5){
            result = "저체중";
        }else if(18.5<=bmiDouble && bmiDouble<=23){
            result = "정상";
        }else if(23<bmiDouble && bmiDouble<25){
            result = "과체중";
        }else {
            result = "비만";
        }
        return result;
    }
}

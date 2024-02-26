package builder;

import model.MemberDTO;

public class MemberBuilder {
    private String username;
    private String password;
    private String confirmPassword;
    private String name;
    private int personId;
    private int phoneNumber;
    private String address;
    private String job;
    private double height;
    private double weight;

    public MemberBuilder username(String username){
     this.username = username;
     return this;
    }
    public MemberBuilder password(String password){
        this.password = password;
        return this;
    }
    public MemberBuilder confirmPassword(String confirmPassword){
        this.confirmPassword = confirmPassword;
        return this;
    }
    public MemberBuilder name(String name){
        this.name = name;
        return this;
    }
    public MemberBuilder personId(int personId){
        this.personId = personId;
        return this;
    }
    public MemberBuilder phoneNumber(int phoneNumber){
        this.phoneNumber = phoneNumber;
        return this;
    }
    public MemberBuilder address(String address){
        this.address = address;
        return this;
    }
    public MemberBuilder job(String job){
        this.job = job;
        return this;
    }
    public MemberBuilder height(double height){
        this.height = height;
        return this;
    }
    public MemberBuilder weight(double weight){
        this.weight = weight;
        return this;
    }
    public MemberDTO build(){
        return new MemberDTO(username,password,confirmPassword,name,personId,phoneNumber,address,job,height,weight);
    }


}
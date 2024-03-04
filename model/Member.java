package model;
import lombok.*;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@ToString(exclude = {"id"})

public class Member {
    private long id;
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

    @Builder(builderMethodName = "builder")
    public Member(long id, String username, String password,
                  String confirmPassword, String name, int personId,
                  int phoneNumber, String address, String job, double height,
                  double weight) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.confirmPassword = confirmPassword;
        this.name = name;
        this.personId = personId;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.job = job;
        this.height = height;
        this.weight = weight;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }
}

package model;
import lombok.*;
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@ToString(exclude = {"id"})

public class Subject {
    private long id;
    private int korean;
    private int english;
    private int math;

    @Builder(builderMethodName = "builder")
    public Subject(long id, int korean, int english, int math) {
        this.id = id;
        this.korean = korean;
        this.english = english;
        this.math = math;
    }
}

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ExamDTO {

    private String test;
    private int score;

    // alt + insert => getter and setter


   /* public String getTest() {
        return test;
    }

    public void setTest(String test) {
        this.test = test;
    }

    public int getScore(){
        return score;
    }

    public void setScore(){
    }*/
}

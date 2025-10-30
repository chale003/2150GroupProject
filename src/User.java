public class User {
    private final String name;
    private int correct = 0;
    private int wrong=0;

    public User(String name){
        this.name= name;
    }
    //getters
    public String getName(){
        return name;
    }
    public int getCorrect(){
        return correct;
    }
    public int getWrong(){
        return wrong;
    }
    public int getTotal(){
        return correct + wrong;
    }
    //add results
    public void incCorrect(){
        correct++;
    }
    public void incWrong(){
        wrong++;
    }
    // get percentage for results

}

public class Capital {
    private final String state;
    private final String capital;
    //should hold the values for the states and capitals
    public Capital(String state, String capital){
        this.state = state;
        this.capital = capital;
    }
    //need getters
    public String getState(){
        return state;
    }
    public String getCapital(){
        return capital;
    }
    @Override
    public String toString(){
        return state + "=" + capital;
    }
}


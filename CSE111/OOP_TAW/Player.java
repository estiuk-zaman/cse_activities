public class Player {
    public int run=0;
    public static int team_run=0;

    public void hit_four(){
        run+=4;
        team_run+=4;
    }
    public void hit_six(){
        run+=6;
        team_run+=6;
    }
}

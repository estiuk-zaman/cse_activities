//Assignment Task 03: Game Arena
class AssgnTask3{

    //Complete this method so that it gives the Expected Output
    //YOU ONLY HAVE TO SUBMIT THIS METHOD, NO OTHER DRIVER CODE
    public static void playGame( Integer[][] arena ){
        int rows = arena.length;
        int cols = arena[0].length;
        int count =0;
        for(int r=0;r<rows;r++){
            for(int c=0;c<cols;c++){
                int v = arena[r][c];
                if(v>0&&v%50==0){
                    if(r - 1 >= 0 && arena[r - 1][c] == 2){
                        count++;
                    }
                    if(r + 1 < rows && arena[r + 1][c] == 2){
                        count++;
                    }
                    if(c - 1 >= 0 && arena[r][c - 1] == 2){
                        count++;
                    }
                    if(c + 1 < cols && arena[r][c + 1] == 2){
                        count++;
                    }
                }
            }
        }
        int points = count*2;
        if(points>=10){
            System.out.println("Points Gained: " + points + ". Your team has survived the game.");
        }
        else{
            System.out.println("Points Gained: " + points + ". Your team is out.");
        }
    }
    public static void main(String[] args){
        Integer[][] arena = {
            {0,2,2,0},
            {50,1,2,0},
            {2,2,2,0},
            {1,100,2,0}
        };
        System.out.println("Given Arena: ");
        Arr.print2D(arena);
        
        System.out.println("\nExpected Output:");
        System.out.print("Points Gained: 6. Your team is out.\n");
        
        System.out.print("\nYour Output:\n");
        playGame( arena );

        System.out.print("\n======================\n");

        Integer[][] arena1 = {
            {0,2,2,0,2},
            {1,50,2,1,100},
            {2,2,2,0,2},
            {0,200,2,0,0}
        };
        System.out.println("\nGiven Arena: ");
        Arr.print2D(arena1);
        
        System.out.println("\nExpected Output:");
        System.out.print("Points Gained: 14. Your team has survived the game.\n");
        
        System.out.print("\nYour Output:\n");
        playGame( arena1 );
    }
}

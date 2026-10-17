//Assignment Task 04: Rotate Secret
class AssgnTask4{

    //Complete this method so that it gives the Expected Output
    //YOU ONLY HAVE TO SUBMIT THIS METHOD, NO OTHER DRIVER CODE
    //If needed you can create extra helper static methods
    //if extra helper methods are used then you must submit those as well
    public static void rotateSecret( Character[][] board ){
        int n = board.length;
        for(int i =0;i<n/2;i++){
            int rotations = n/2-i;
            int top = i;
            int bottom = n-1-i;
            int left=i;
            int right =n-1-i;
            for(int k=0;k<rotations;k++){
                Character temp = board[top+1][left];
                for(int r=top+1;r<bottom;r++){
                    board[r][left] = board[r + 1][left];
                }
                for (int c = left; c < right; c++)  {
                    board[bottom][c] = board[bottom][c + 1];
                }
                for (int r = bottom; r > top; r--) {
                    board[r][right] = board[r - 1][right];
                }
                for (int c = right; c > left; c--)  {
                     board[top][c] = board[top][c - 1];
                }
                board[top][left] = temp;  
            }
        }
        for(int r=0;r<n;r++){
            for(int c=0;c<n;c++){
                System.out.print(board[r][c]);
            }
        }
        System.out.println();
    }
    public static void main(String[] args){
        System.out.print("===========Test#1===========\n");
        Character[][] board = {
          {'T','A','U','S'},
          {'A','R','I','.'},
          {'D','T','T','N'},
          {'S','C','F','U'}
        };
        System.out.println("Given Board: ");
        Arr.print2D(board);

        System.out.println("\nExpected Output:");
        Character[][] outputBoard = {
            {'D','A','T','A'},
            {'S','T','R','U'},
            {'C','T','I','S'},
            {'F','U','N','.'}
        };
        System.out.print("DATASTRUCTISFUN.\n");
        Arr.print2D(outputBoard);
        
        System.out.print("\nYour Output:\n");
        rotateSecret( board );
        Arr.print2D(board);
        
        if( Arr.compare2D(outputBoard, board) ) System.out.print("Test 1 Success");
        else System.out.println("Test 1 FAILED");
        
        System.out.print("\n===========Test#2===========\n");

        board = new Character[][]{
          {'O','R','I','R','N','P'},
          {'G','S','A','A','L','R'},
          {'L','M','N','O','N','Y'},
          {'A','H','U','O','O','P'},
          {'T','F','C','T','H','S'},
          {'E','D','Y','O','C','K'}
        };
        System.out.println("Given Board: ");
        Arr.print2D(board);

        System.out.println("\nExpected Output:");
        outputBoard = new Character[][]{
            {'A','L','G','O','R','I'},
            {'T','H','M','S','A','R'},
            {'E','F','U','N','A','N'},
            {'D','C','O','O','L','P'},
            {'Y','T','H','O','N','R'},
            {'O','C','K','S','P','Y'}
        };
        System.out.print("ALGORITHMSAREFUNANDCOOLPYTHONROCKSPY\n");
        Arr.print2D(outputBoard);
        
        System.out.print("\nYour Output:\n");
        rotateSecret( board );
        Arr.print2D(board);
        
        if( Arr.compare2D(outputBoard, board) ) System.out.print("Test 2 Success");
        else System.out.println("Test 2 FAILED");
    }
}

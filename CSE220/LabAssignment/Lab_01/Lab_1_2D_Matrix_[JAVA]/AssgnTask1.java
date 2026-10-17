//Assignment Task 01: Row Rotation Policy
class AssgnTask1{

    //Complete this method so that it gives the Expected Output
    //YOU ONLY HAVE TO SUBMIT THIS METHOD, NO OTHER DRIVER CODE
    public static Integer rowRotation( Integer examWeek, String[][] matrix ){
        int rows = matrix.length;
        int cols = matrix[0].length;
        int aaRow = -1;
        for(int r=0;r<rows;r++){
            for (int c =0; c <cols; c++){
                if(matrix[r][c].equals("AA")){
                    aaRow=r;
                }
            }
        }
        int shift = (examWeek-1)%rows;
        String [] temp = new String[cols];
        for(int k =0; k<shift;k++){
            for(int c =0;c<cols;c++){
                temp[c]=matrix[rows-1][c];
            }
            for(int r=rows-1;r>0;r--){
                for(int c=0;c<cols;c++){
                    matrix[r][c]=matrix[r-1][c];
                }
            }
            for(int c =0;c<cols;c++){
                matrix[0][c]=temp[c];
            }
        }
        Arr.print2D(matrix);
        if (aaRow==-1){
            return -1;
        }
        return((aaRow+shift)%rows)+1;
    }

    //DO NOT CHANGE ANY DRIVER CODE BELOW THIS LINE
    public static void main(String[] args){
        String[][] seatStatus = {
                {"A" , "B"  , "C"  , "D"  , "E"},
                {"F" , "G"  , "H"  , "I"  , "J"},
                {"K" , "L"  , "M"  , "N"  , "O"},
                {"P" , "Q"  , "R"  , "S"  , "T"},
                {"U" , "V"  , "W"  , "X"  , "Y"},
                {"Z" , "AA" , "BB" , "CC" , "DD"}
        };
        System.out.println("Given Seat Status: ");
        Arr.print2D(seatStatus);
        
        System.out.println("\nExpected Output:");
        System.out.println("| U  | V  | W  | X  | Y  | ");
        System.out.println("| Z  | AA | BB | CC | DD | ");
        System.out.println("| A  | B  | C  | D  | E  | ");
        System.out.println("| F  | G  | H  | I  | J  | ");
        System.out.println("| K  | L  | M  | N  | O  | ");
        System.out.println("| P  | Q  | R  | S  | T  | ");
        System.out.println("Your friend AA will be on row 2");
        
        System.out.print("\nYour Output:\n");
        Integer examWeek = 3;
        //This following should print modified seat status after rotation and return the current exam week
        Integer rowNumber = rowRotation( examWeek, seatStatus );
        //The following should print Your friend AA will be on row 2
        System.out.println("Your friend AA will be on row "+rowNumber);
    }
}

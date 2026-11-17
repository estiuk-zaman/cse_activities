//YOU NEED TO RUN THIS CLASS TO TEST OUT THE METHODS
package AssignmentTask2;

public class HotPotato{

    public static String hotPotato(String[] players, int k) {
        
        if (players.length==0) {
            return null;
        }
        LinkedListQueue temp = new LinkedListQueue();
        for(int i =0;i<players.length;i++){
            temp.enqueue(players[i]);
        }
        int count = players.length;

        while (count>1) {
            for(int i =0;i<k;i++){
            temp.enqueue(temp.dequeue());
            }
            String eliminated = (String) temp.dequeue();
            System.out.println(eliminated+" eliminated");
            count--;
        }
        String winner = (String) temp.dequeue();
        return winner;
    }

    public static void main(String[] args) {

        System.out.println(".......Test Case #1.......");
        String[] players1 = {"Ali", "Ben", "Cia", "Dan", "Eli", "Faye"};
        int k1 = 3;
        String winner1 = hotPotato(players1, k1);
        System.out.println("Winner: " + winner1);

        System.out.println(".......Test Case #2.......");
        String[] players2 = {"Ali", "Rafi", "Sara", "Nina"};
        int k2 = 2;
        String winner2 = hotPotato(players2, k2);
        System.out.println("Winner: " + winner2);
    }
}

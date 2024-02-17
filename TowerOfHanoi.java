public class TowerOfHanoi {
    public static void main(String[] args) {
        int numDisks = 3;
        char sourceRod = 'A';
        char destinationRod = 'C';
        char auxiliaryRod = 'B';
        
        System.out.println("Moves to solve Tower of Hanoi with " + numDisks + " disks:");
        solveTowerOfHanoi(numDisks, sourceRod, destinationRod, auxiliaryRod);
    }
    
    public static void solveTowerOfHanoi(int numDisks, char sourceRod, char destinationRod, char auxiliaryRod) {
        if (numDisks == 1) {
            System.out.println("Move disk 1 from rod " + sourceRod + " to rod " + destinationRod);
            return;
        }
        
        solveTowerOfHanoi(numDisks - 1, sourceRod, auxiliaryRod, destinationRod);
        System.out.println("Move disk " + numDisks + " from rod " + sourceRod + " to rod " + destinationRod);
        solveTowerOfHanoi(numDisks - 1, auxiliaryRod, destinationRod, sourceRod);
    }
}

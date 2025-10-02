class Solution {
    public int maxBottlesDrunk(int numBottles, int numExchange) {
        int totalDrunk = numBottles;
        int empty = numBottles;
        while (empty >= numExchange) {
            empty -= numExchange; 
            numExchange++;          
            totalDrunk += 1;  
            empty += 1;          
        }
        return totalDrunk;
    }
}

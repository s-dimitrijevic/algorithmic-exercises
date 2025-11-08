public class Main {
    public static void main(String[] args) {
        //Sum of Array Singles
        System.out.println("\nExercise: Sum of Array Singles\n");
        int sum = SumOfArraySingles.repeats(new int[]{1, 3, 5, 7, 7, 2});
        System.out.println("Sum: " + sum);

        //Waiting Room
        System.out.println("\nExercise: Waiting Room\n");
        System.out.println("Last seat: " +WaitingRoom.lastChair(10));

        //Bit Counting
        System.out.println("\nExercise: Bit Counting\n");
        int n = 1234;
        String b = BitCounting.toBin(n);//should return "10011010010"
        int c = BitCounting.count1s(b);//should return "5"
        System.out.println("Binary: "+b);
        System.out.println("Number of 1s in number "+n+" is " +c+ ".");

        //Building Blocks
        System.out.println("\nExercise: Building Blocks\n");
        BuildingBlocks.Block block = new BuildingBlocks.Block(new int[]{2, 4, 6});
        System.out.println("Block width: " +block.getWidth());
        System.out.println("Block surface area: " +block.getSurfaceArea());

        //StockList
        System.out.println("\nExercise: StockList\n");
        String[] stock = {"ABART 20", "CDXEF 50", "BKWRK 25", "BTSQZ 89", "DRTYM 60"};
        String[] categories = {"A", "B", "C", "W"};
        System.out.println(StockList.stockSummary(stock, categories));
        // Output: (A : 20) - (B : 114) - (C : 50) - (W : 0)
    }
}
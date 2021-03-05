public class Main {
    public static void main(String[] args){

        ForTask1 forTask1 = new ForTask1() {
            @Override
            public void degrade() {
                System.out.println("Finally did it");
            }
        };
        forTask1.degrade();
        forTask1.growWiser();
    }
}

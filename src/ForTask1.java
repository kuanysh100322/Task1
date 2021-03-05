public interface ForTask1 {
    void degrade();

    default void growWiser(){
        System.out.println("Some words");
    }
}

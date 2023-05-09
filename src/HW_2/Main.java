package HW_2;

public class Main {
    public static void main(String[] args) {
        Aquarium aquarium = new Aquarium();
        aquarium.addList(new Duck("Pele"))
                .addList(new Shark("Baby"))
                .addList(new Fish("Klaus"))
                .addList(new SeaLion("Simba"))
                .addList(new Dolphin("Flipper"))
                .addList(new Crab("Mr.Crabs"));


        for (var item :
                aquarium.getListAnimal()) {
            System.out.println(item);
        }
        System.out.println("----------------");
        System.out.println("Winner - " + aquarium.speedWinner());
    }
}
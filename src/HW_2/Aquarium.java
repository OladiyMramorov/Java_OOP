package HW_2;

import java.util.ArrayList;
import java.util.List;

public class Aquarium {
    private List<MarineAnimal> listAnimal = new ArrayList<>();

    public Aquarium addList(MarineAnimal name){
        listAnimal.add(name);
        return this;
    }

    public List<MarineAnimal> getListAnimal() {
        return listAnimal;
    }

    public MarineAnimal speedWinner(){
        int index = 0;
        for (int i = 0; i < listAnimal.size(); i++) {
            if(getListAnimal().get(i).speed() > getListAnimal().get(index).speed())
                index = i;
        }
        return getListAnimal().get(index);
    }
}

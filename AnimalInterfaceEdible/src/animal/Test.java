package animal;

import animal.Animal;
import edible.Edible;
import fruit.Apple;
import fruit.Fruit;
import fruit.Orange;

public class Test {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        for (int i = 0; i< animals.length;i++){
            System.out.println(animals[i].makeSound());
            if (animals[i] instanceof Chicken){

                Chicken edible = (Chicken)animals[i];
                System.out.println(edible.howToEat());
            }
        }

        Fruit[] fruits = new Fruit[2];
        fruits[0] = new Apple();
        fruits[1] = new Orange();
        for (int j =0; j < fruits.length;j++){
            System.out.println(fruits[j].howToEat());
        }
        Chicken chicken1 = new Chicken();
        System.out.println(chicken1.howToEat());

    }
}

package useAnnocation;

import annocation.FruitColor;
import annocation.FruitColor.Color;
import annocation.FruitName;
import annocation.FruitNumber;
import annocation.FruitProver;
import jdk.nashorn.internal.objects.annotations.Constructor;

/**
 * Apple
 *
 * @author Administrator
 * @desc
 * @time 2020/12/16 12:03
 **/

public class Apple {

    @FruitColor(fruitColor = Color.BLUE)
    private String fruitColor;

    @FruitName(fruitName = "苹果")
    private String fruitName;

    @FruitNumber(number = 23)
    private int fruitNumber;

    @FruitProver(id = 2, name = "zz", address = "zz")
    private String fruitProver;

    public String getFruitProver() {
        return fruitProver;
    }

    public void setFruitProver(String fruitProver) {
        this.fruitProver = fruitProver;
    }

    public String getFruitColor() {
        return fruitColor;
    }

    public void setFruitColor(String fruitColor) {
        this.fruitColor = fruitColor;
    }

    public String getFruitName() {
        return fruitName;
    }

    public void setFruitName(String fruitName) {
        this.fruitName = fruitName;
    }

    public int getFruitNumber() {
        return fruitNumber;
    }

    public void setFruitNumber(int fruitNumber) {
        this.fruitNumber = fruitNumber;
    }
}

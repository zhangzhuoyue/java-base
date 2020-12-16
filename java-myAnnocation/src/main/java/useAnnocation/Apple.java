package useAnnocation;

import annocation.FruitColor;
import annocation.FruitColor.Color;
import annocation.FruitName;
import annocation.FruitNumber;
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

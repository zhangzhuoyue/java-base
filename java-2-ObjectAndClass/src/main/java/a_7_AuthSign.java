/**
 * @author ze666
 * @desc  权限修饰符
 * @date 2021/1/16 13:06
 */
public class a_7_AuthSign {


    //只有自己类，创建的对象能使用
    private void privateTest(){
        System.out.println("private");
    }
    //所有包内的类都可以访问
    public void publicTest(){
        System.out.println("public");
    }
    //默认权限修饰符 ，只能同一package下的类可以访问，以及同一package下的子类可以访问
     void defaultTest(){
        System.out.println("default");
    }

    //只能当前类在同一package下的类可以访问，或者不同package下的子类可以访问
    protected void protectedTest(){
        System.out.println("protected");
    }

}

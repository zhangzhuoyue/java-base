package a_1_ExtendsRelation;

import java.util.Objects;

/**
 * @author ze666
 * @desc
 * @date 2021/1/18 19:25
 */
public class Son extends Fatcher {
    private String address;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String getName() {
        return "子类实现方法";
    }

    @Override
    public String toString() {
        return "Son{" +
                "address='" + address + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Son son = (Son) o;
        return Objects.equals(address, son.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(address);
    }
}

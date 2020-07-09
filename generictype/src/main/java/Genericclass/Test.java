package Genericclass;

/**
 * @author zzy
 * @date 2020/7/9 23:06
 */
public class Test {

    public static void main(String[] args) {
        GenericPersion<String> stringGenericStudent = new GenericStudent<>();
        String name = stringGenericStudent.getName();
    }
}

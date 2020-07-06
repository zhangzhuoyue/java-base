package serializeable;

import com.sun.corba.se.spi.ior.ObjectKey;
import com.sun.xml.internal.messaging.saaj.util.ByteOutputStream;

import java.io.*;

/**
 * @author zzy
 * @date 2020/6/25 18:33
 */
public final class SerializeUtile {

    /**
     * 将对象进行序列化
     * @param object
     * @return
     */
    public static byte[] serialize(Object object)  {
        ObjectOutputStream oos = null;
        ByteArrayOutputStream baos = null;
        try {
            baos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(baos);
            oos.writeObject(object);
            byte[] bytes = baos.toByteArray();
            return bytes;
        } catch (Exception e) {
            throw  new RuntimeException(e);
        }
    }

    /**
     * 反序列化
     */
    public static Object unserialize(byte[] bytes){
        if (bytes == null){
            return null;
        }

        ByteArrayInputStream bais = null;
        try {
            bais = new ByteArrayInputStream(bytes);
            ObjectInputStream ois = new ObjectInputStream(bais);
            return ois.readObject();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}

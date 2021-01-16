#BigInteger
1. 整数范围超过了long型, java.math.BigInteger就是用来表示任意大小的整数。BigInteger内部用一个int[]数组来模拟一个非常大的整数：

2. 案例： 
    ```
   BigInteger bi = new BigInteger("1234567890");
   System.out.println(bi.pow(5)); // 2867971860299718107233761438093672048294900000
   对BigInteger做运算的时候，只能使用实例方法，例如，加法运算：
   和long型整数运算比，BigInteger不会有范围限制，但缺点是速度比较慢。
   ```
    
3. BigInteger转换成long型
   ```
     BigInteger i = new BigInteger("123456789000");
     System.out.println(i.longValue()); // 123456789000
     System.out.println(i.multiply(i).longValueExact()); // java.lang.ArithmeticException: BigInteger out of long range
    ```


4. BigInteger类型转换j

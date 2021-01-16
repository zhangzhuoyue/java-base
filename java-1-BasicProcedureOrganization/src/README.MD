# 1 数据类型

## 基本数据类型 4中整型、2中浮点型、1中字符类型char、1中标识真假的boolean类型
1. 4中整型：byte、short、int、long
    ```
   位（bit）：     二进制数中的一个数位，可以是0或者1，是计算机中数据的最小单位。
   字节（Byte，B）：计算机中数据的基本单位，每8位组成一个字节
    byte    1字节8byte=1字节】    -128～127（-2的7次方到2的7次方-1）
    short   2字节                -32768～32767（-2的15次方到2的15次方-1）
    int     4字节                -2147483648～2147483647（-2的31次方到2的31次方-1）
    long    8字节                -9223372036854774808～9223372036854774807（-2的63次方到2的63次方-1）
   int常用，long在后面加l或L，如：long lo = 12L
   byte 底层文件处理，short需要控制占用空间大小的大数组
   ```

2. 2中浮点型
    ```
   float    4字节
   double   8字节
   double精度是float的两倍，称为双精度数值。大部分程序使用double。如果使用float 后面加后缀F或f;
   
   Double和Float类中都有这两个方法，用于判断是否是无穷大及是否为非数字
   Double.isNaN(lo);//如果此值是一个非数字 (NaN) 值，则返回 true，否则返回false。
   Double.isInfinite(lo);//如果此对象表示的值是正无穷大或负无穷大，则返回 true；否则返回false。
   ```

2. char 单个字符
    ```
   大写比小写unicode小 32，空格的unicode是32，A ：65 、 Z :90
   ```

3. boolean
    ```
   boolean   1字节     true/fale
   ```

# 2 变量
1. 变量名必须是字母开头
2. java中变量的声明，尽可能靠近第一次使用的地方

## 初始化变量有两种方式：一种是声明时直接赋值，一种是先声明、后赋值
1. 局部变量一般直接赋值初始化
2. 成员变量一般使用构造器初始化，或者setXxx()进行初始化。如果对象创建后需要变量存在，可以使用直接赋值，或者使用static关键词


# 3 运算符

    ```
    //整数除法运算，得到商
    int i = 2 / 3;
    //整数的除法运算，得到余数
    int j = 2%3;

    //浮点数,除法，会得到小数点，需要设置精度，使用 DecimalFormat
    //DecimalFormat df = new DecimalFormat("#.##");保留2位小数，并去掉无效0；如20.10会去掉百分位的0
    //DecimalFormat df = new DecimalFormat("0.00");//保留2位小数，不够两位用0补；如20.10会去掉百分位的0
    DecimalFormat df = new DecimalFormat("0.00");//自动四色五入
    String d =df.format(1/2);
    ```

# 4 类型转换
1. 两个操作数运算，如果有一个是double、float、int，则结果向精度更高的转换

# 自增
1. ++i 先加1，再使用i值  ；i++ 先使用原值，再加1

# 三元操作符 ？ ：
1. a == b ? true : false

# 5 位运算符
1. 处理整型数据，可以直接对位进行操作
    ```
       int i = 121;
       int j = 129;
       System.out.println("与 &:" + (i & j));//两个操作数中位都为1，结果才为1，否则结果为0
       System.out.println("或 |:" + (i | j));//两个位只要有一个为1，那么结果就是1，否则就为0
       System.out.println("异或 ^:" + (i ^ j));//两个操作数的位中，相同则结果为0，不同则结果为1
       System.out.println("非 ~:" + (~j));//如果位为0，结果是1，如果位为1，结果是0   只有一个操作数
       //3 << 2 左移2位，既3乘以2的2次方    ； 3 >> 2 右移2位，既3乘以2的-2次方
       System.out.println(64 >> 3);
   ```

# 5 String API
1. String.join() 使用定界符拼接字符串

# 6 StringBuilder

    ```
        StringBuilder sb = new StringBuilder();
        sb.append("rtdrxdr");
        sb.insert(4,8);//指定位置插入数字
        System.out.println(sb.toString());
        sb.insert(4,"*****");//指定位置插入字符串
        System.out.println(sb.toString());
        sb.delete(4,7);//删除指定范围的字符
        System.out.println(sb.toString());
    ```

# Switch
1. case 标签  
   1. 基本数据类型：short、byte、int、char 字面值表达式  
   2. 枚举常量  
   3. java7 开始，case标签可以是字符串字面值
   
# 中断控制
1. break、continue，跳出所在循环
2. 跳转标签，跳转到指定循环外。标签一定是以冒号结尾

# 大数值处理
1. BigInteger 任意整型运算、BigDecimal 任意浮点型运算
2. DecimalFormat  对数据格式化，保留小数，百分号数据输出

# 数组初始化
1. int[] arr  只是声明数组，并没有初始化真正数组
2. int[] arr = new int[0],生成一个没有长度的数组，同时返回null数组不是好的选择，即使返回一个数组长度=0也会对算法有很大的帮助。

# Arrays API

1. Arrays.sort()  排序，使用Compartor接口排序
2. Arrays.fill()  给数组所有元素，赋相同的值
3. Arrays.equals() //比较两个数组完全相等
4. Arrays.binarySearch() //数组搜索






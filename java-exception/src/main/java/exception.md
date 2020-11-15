#异常处理机制
##声明异常
### 关注异常类型：
1. 用户输入错误  
2. 设备错误
3. 物理限制，例如磁盘满了
4. 代码错误 

###异常分类
1.  异常类：
    1. 所有异常都是由Throwable异常而来,分解两个分支：Error和Exception
    1. Error(不关注)：描述java运行时系统内部的错误和资源耗尽错误，程序会立即停止，无法对其进行处理
    2. Exception(关注)：分解为两个分支：RunntimeException和其他异常
        1.  划分标准：由程序本身引起的错误是RunntimeException；程序本身没有问题，由I/O这类错误引起的异常属于其他异常。
2. 异常语言规范：
    1. 派生于Error和RuntimeException的所有类称为非受检查异常
    2. 其他异常称为受检查异常

####声明受检查异常
1.  语法：在方法首部使用throws声明所有可能抛出的异常
2.  使用：
       1.  调用一个受检查异常
       2. 程序运行发生一个错误，利用throws抛出一个异常
       3. 抛出异常时为了让调用者知道除了什么问题
       4. 子类覆盖了超类方法，子类中声明的异常不能比超类方法中声明的异常更加通用，但合一更具体。
#####如果抛出异常
1. 抛出异常语句：
    1. throw new EOFException();
    2. EOFException e = new EOFException(); throw e;
#####创建异常类
1. 语法：定义一个派生于Exception或者派生于Exception子类的类，定义的类包含两个构造器，默认构造器和带有详细信息描述的狗再去(超类的Throwable的toString()方法会打印详细信息)
2. ```java
   // 抛出异常，则在方法首部添加throws
    try{
       ...
   }catch(Exception e){
      throw e;  //强捕获的异常声明出去，让调用者知道
   } 
   ```


---
##捕获异常
1. 语法：
    1. 捕获异常使用受检查异常，如果不进行处理，则继续传递。箱传递异常，则在方法首部添加throws
    2. 捕获多个异常：
       1. 添加多个catch；或者在一个catch中使用 | 来添加多个异常，同时各个异常之间没有子类关系
2. 再次抛出异常于异常链 try/catch
   1. 使用场景：
        1. 在catch中抛出一个异常，并改变异常类型。例如不想让另一个系统知道错误的具体细节
        2.  _`可以将一个方法的发生了受检查异常，而不允许抛出，则可以捕获异常，并包装成运行时异常。`_
   2. 代码：
      ```java
       //在catch中使用throw，该异常不会抛出，会变成一个运行时异常
        try { 
         ...
        }catch(SQLException e){
          Throwable se = new ServletException("database error");
          se.iniCause(se);
          throw se;
      }
      
      //调用者捕获异常，用户抛出子系统高级异常，而不会丢失原始异常细节
               try {
                  ...
              } catch (Throwable throwable) {
                  System.out.println(throwable.toString());//包装的异常信息
                  System.out.println(throwable.getCause().getStackTrace()[0]);//原始异常发生位置
                  System.out.println(throwable.getCause().toString());//原始的异常信息
              }
      
       ```
3. finally 子句
    1. 使用场景：代码发生异常或正常，释放资源。
    2. 语法：无论是否有异常被捕获，finally都会执行。
    3. try/catch  try/finally的解耦合使用
        ```java
       try{
         try{
              ...
          }finally{
              ...//关闭资源
          }
       }catch(Exception e){
           ...//捕获异常
       }
       //内层try只有一个职责，确保关闭资源，外层try只有一个职责，捕获异常
       ```
    4. finally中含有 return覆盖返回值 ： 
       1. 使用return从try中退出，则在方法推出前，finally内容将执行，如果finally中含有return，则这个返回值会覆盖原始的返回值。
            ```
           案例：
           public int test1() {
                   try {
                       int num = 3;
                       return num;
                   } finally {
                       return 7;
                   }
               }
           
           ```
    5. finally 覆盖异常 ： 覆盖抛出异常，但不会覆盖捕获的异常
        ```java
       //捕获异常不会被覆盖
            public void test1() {
               try {
                   try {
                       int[] ll = new int[1];
                       ll[2] = 9;
                   } catch (Exception e) {
                       e.printStackTrace();
                   }
               } finally {
                   try {
                       int[] ll = new int[2];
                       ll[1] = 0;
                       int i = 3 / ll[1];
                   } catch (Exception e) {
                       e.printStackTrace();
                   }
       
               }
           }
       
       //抛出异常会被覆盖,finally中也抛出异常时，会将原有的异常覆盖
       public void test1() {
               try {
                   try {
                       int[] ll = new int[1];
                       ll[2] = 9;
                   } catch (Exception e) {
                       throw  e;
                   }
               } finally {
                   try {
                       int[] ll = new int[2];
                       ll[1] = 0;
                       int i = 3 / ll[1];
                   } catch (Exception e) {
                       throw e;
                   }
       
               }
           }    
       ```
4. 带资源的try语句
   1. 资源实现了AutoCloseable ，提供close()方法,java 7 为这种代码提供了快捷模式：
       ```java
      //try中的资源，e无论是否有异常，都会调用AutoCloseable 提供close()方法关闭资源。
         public void test3(){
                 try (Scanner in = new Scanner(new FileInputStream("c:/"),"utf-8");
                      PrintStream out = new PrintStream("out.txt")){
                     while (in.hasNext()){
                         System.out.println(in.next());
                     }
                 } catch (FileNotFoundException e) {
                     e.printStackTrace();
                 }
             }
        ```
   2. 带资源的try可以抑制close方法抛出的异常，不会覆盖原有的异常。addSuppressed方法会将异常加入到异常列表。可以调用getSupressed得到异常

##Throwable
1. Throwable iniCause(Throwable cause) 设置异常原因
2. Throwable getCause( ) 获取对象的原因。
3. StackTraceElement[] getStackTrace()  获取构造该对象是调用堆栈跟踪
4. Throwable[] getSuppressed() 获取异常中所有"抑制"异常，一般只带资源的try语句中close方法抛出的异常


##断言

















































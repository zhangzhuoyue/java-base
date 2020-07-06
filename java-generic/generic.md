# 泛型综述

### 定义 
    ```
    1. 通用性：泛型就是编写模板代码来适应任意类型，增加了代码的重用性
    2. 安全性：泛型的好处是使用时不必对类型进行强制转换，它通过编译器对类型进行检查；只要在编译时期没有出现警告，那么运行时期就不会出现ClassCastException异常
    3. 注意泛型的继承关系：可以把ArrayList<Integer>向上转型为List<Integer>（T不能变！）【但是泛型中类型不能变】，但不能把ArrayList<Integer>向上转型为ArrayList<Number>（T不能变成父类）。
    ``` 
  --- 
### 泛型将运行期问题提前到编译器
        ```
       1. jdk1.5之前，集合中可以装配任意的对象类型，取出这样的对象只能用Object对象接受，但是当要明确其类型时，必须强制转换，而且强制转换的错误只能在
       运行期才能发现。
       2. jdk1.5新特性泛型彻底解决了这样的问题。
          泛型规定一个类只能装什么，取出时也无需强制转换，如果放入的对象不是限定的类型，在编译器就会报错。
       ```
   1. 什么是编译器，什么是运行期 ？？？？？？
---
# 泛型语法

### 泛型的向上转型
        ```
       1. 泛型子类可以向上转型为泛型父类，他的形式如下，例如：List<T>的子类ArrayList<T>【T不能变】
            public class ArrayList<T> implements List<T> {
                ...
            }
       2. 特别注意：ArrayList<Integer>和ArrayList<Number>两者完全没有继承关系。不能将ArrayList<Integer>向上转型为ArrayList<Number>
    
       ```
---
### 使用泛型
   ```
   1. 泛型使用：把泛型参数<T>替换为需要的class类型，例如：ArrayList<String>，ArrayList<Number>等；

   2. 泛型推断：可以省略编译器能自动推断出的类型，例如：List<String> list = new ArrayList<>();；

   3. 不指定泛型：编译器会给出警告，且只能将<T>视为Object类型；原因是泛型擦除

   4. 接口定义泛型：可以在接口中定义泛型类型，实现此接口的类必须实现正确的泛型类型。

   5. 泛型的使用案例：Collections.sort() 的排序 ，要手写一遍  #########################
   ```
---
### 上限 下限通配符
* 指定具体泛型后，只能接受固定类型的参数，通配符则扩展了接收类型的范围。
* extends ：通配符上限，<? extends T> 限定传入的参数只能是T 或 T的子类。可以使用在类和方法
    ```
  1. 何时使用extends，何时使用super？使用PECS原则：Producer Extends Consumer Super帮助记忆。
     1. 如果需要返回T，它是生产者（Producer），要使用extends通配符；如果需要写入T，它是消费者（Consumer），要使用super通配符。
        案例：Collections的copy()方法为例：
              public class Collections {
                  public static <T> void copy(List<? super T> dest, List<? extends T> src) {
                      for (int i=0; i<src.size(); i++) {
                          T t = src.get(i); // src是producer
                          dest.add(t); // dest是consumer
                      }
                  }
              }
     2. 返回T的src是生产者，因此声明为List<? extends T>，需要写入T的dest是消费者，因此声明为List<? super T>。
  特点：使用类似<? extends Number>通配符作为方法参数时表示：
         1.方法内部可以调用获取Number引用的方法，例如：Number n = obj.getFirst();；
         2.方法内部无法调用传入Number引用的方法（null除外），例如：obj.setFirst(Number n);。
         3.即一句话总结：使用extends通配符表示可以读，不能写。
     2.  案例：
         int sumOfList(List<? extends Integer> list) {
             int sum = 0;
             for (int i=0; i<list.size(); i++) {
                 Integer n = list.get(i);
                 sum = sum + n;
             }
             return sum;
         }       
         分析：方法参数类型List<? extends Integer>表明了该方法内部只会读取List的元素，不会修改List的元素（因为无法调用add(? extends Integer)、remove(? extends Integer)这些方法。
               换句话说，这是一个对参数List<? extends Integer>进行只读的方法（恶意调用set(null)除外）。   
  ```
* super 通配符下限，规定了传入类型的，<? super T> 只能传入T 或者T的父类
    ```
  案例： 
      希望接受Pair<Integer>类型，以及Pair<Number>、Pair<Object>，因为Number和Object是Integer的父类，
      setFirst(Number)和setFirst(Object)实际上允许接受Integer类型。
  特点： 使用<? super Integer>通配符表示：
             1.允许调用set(? super Integer)方法传入Integer的引用；
             2.不允许调用get()方法获得Integer的引用。
             3.唯一例外是可以获取Object的引用：Object o = p.getFirst()。
             4.换句话说，使用<? super Integer>通配符作为方法参数，表示方法内部代码对于参数只能写，不能读。
             
  ```
---

# 泛型分类

### 静态方法泛型类型 和 实例类型的泛型类型不同的泛型种类

* 案例如下：    
    
    ```
    1. 编写泛型时，需要定义泛型类型<T>
        1. 泛型类一般用在集合类【模板类】,如果编写泛型类，则先搞清楚类中那些事可变的，那些是不变的。
        public class Persion<T>{

            public T o1;
            public T o2;

            public void setO1(T t){
               this.o1 = t;
            }
            public T getO1(){
                return o1;
            }
        }

    2. 静态方法的泛型使用
          * 静态方法的泛型类型和实例类型的泛型类型区分开，二者编写不同，具体如下：
        
                     1.  // 编写泛型类时，要特别注意，泛型类型<T>不能用于静态方法静态方法使用<T>: 编译无法通过
                      public static Pair<T> create(T first, T last) {
                          return new Pair<T>(first, last);
                      }

                     2.  // 可以编译通过: 添加<T>;添加<T>后是另外一种泛型  ；<T>和Pair<T>类型的<T>已经没有任何关系了
                      public static <T> Pair<T> create(T first, T last) {
                          return new Pair<T>(first, last);
                      }
              }
    ```
---
### 多泛型  单泛型


---
### 静态方法 泛型


---
### 泛型与反射























































































1. **Collections.sort(List , comparator):集合比较尽量使用这个方法**

    ```
   问题：实现comparator接口，制定排序规则，如果排序参数中有可能有null，则会报java.lang.IllegalArgumentException: Comparison method violates its general contract!
   原因：代码报错可能因为我们比较器不够严谨，返回值需要包括1、-1、0；需要考虑参数为null的情况。
   解决实例：这段代码处理的是集合中出现为null的对象
   Collections.sort(list,new Comparator<Student>(){
         @Override
         public in compare(Student s1 ,Student s2){
               if(s1 == null && s2 == null) return 0;   
               if(s1 == null ) return 1;
               if(s2 == null) return 2;
               if(s1.getAge() == null && s2.getAge() == null) return 0;
               if(s1.getAge() == null ) return 1;
               if(s2.getAge() == null ) return -1;
               return s2.getAge().compareTo(s1.getAge(0);
         }
   });
   
   ```
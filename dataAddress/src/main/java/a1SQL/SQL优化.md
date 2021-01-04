* 联表查询
    1. 选择最有效率的表名顺序
        ```
         1. Oracle的解析器按照从右到左的顺序处理FROM子句中的表名，FROM子句中写在最后的表(基础表 driving table)将被最先处理，在FROM子句中包含多个表的情况下,你必须选择记录条数最少的表作为基础表。如果有3个以上的表连接查询, 那就需要选择交叉表(intersection table)作为基础表, 交叉表是指那个被其他表所引用的表。
       ```
    2. WHERE子句中的连接顺序
        ```
       1.  Oracle采用自下而上的顺序解析WHERE子句,表之间的连接必须写在其他WHERE条件之前, 那些可以过滤掉最大数量记录的条件必须写在WHERE子句的末尾
       2.  MySQL左到右的顺序处理条件,把能过滤更多数据的条件放在前面,过滤少的条件放后面 
       ```

* 查看、删除重复数据
    1. oracle
        1. DELETE FROM EMP E WHERE E.age > **(SELECT MIN(X.age) FROM EMP X WHERE X.EMP_NO = E.EMP_NO)**;
            ```
            1. 子句查询找出重复数据中最【字段】小值，然后where中的 > 条件将最小值【字段】保留，删除其他值
           ```
        2.    select * FROM EMP E WHERE E.age > **(SELECT MIN(X.age) FROM EMP X WHERE X.EMP_NO = E.EMP_NO)**;

    2. mysql
        1. 查看、删除重复数据
           ```
            1. SELECT *  FROM dept  WHERE  deptno NOT IN 
              ( SELECT dt.minno FROM  ( SELECT MIN(deptno) AS minno FROM dept GROUP BY dname  ) dt  )
              查询一个员工有多个部门号，展出除最小部门号外的数据
            
           1. delete FROM dept  WHERE  deptno NOT IN 
             ( SELECT dt.minno FROM  ( SELECT MIN(deptno) AS minno FROM dept GROUP BY dname  ) dt  )
             删除一个员工有多个部门号，展出除最小部门号外的数据
           ```
       
* 整合简单,无关联的数据库访问

























* StirngUtils  
  1. isEmpty  判断为空 为null
  2. isBlank  判断为空 为null  空格字符串

* DecimalFormat 数据展示格式
  1. 保留小数点两位
  2. 输出文字+数字
  3. 输出科学计数法

* BigDecimal
  1. 常用枚举对象  ONE TEN ZERO
  2. BigDecimal


* BigInteger
  1. 



* 排序
  排序：对参数为null的处理
  Collections.sort(list, new Comparator<Integer>() {
  		@Override
  		public int compare(Integer o1, Integer o2) {
  			// 写法1：
  			if (o1 != null && o2 != null) {
  				return o1.compareTo(o2);
  			} else {
  				return o1 == null ? 1 : -1;
  			}
  			// 写法2：
  			/*return o1 == null ?
  					1 :
  					(o2 == null ? -1 : o1.compareTo(o2));*/
  		}
  	});
  	
  	使用java8的Strean流实现
  	


































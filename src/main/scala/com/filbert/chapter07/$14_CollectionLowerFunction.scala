package com.filbert.chapter07

object $14_CollectionLowerFunction {

  def main(args: Array[String]): Unit = {

    val list = List(1,4,3,6,22,8,10)

    //获取最大值
    println(list.max)
    //获取最小值
    println(list.min)
    //求和
    println(list.sum)

    val list2 = List( ("lisi",20,1800),("wangwu",30,4500),("hanmeimei",18,10000) )
    //println(list2.max)
    val func = (x: (String,Int,Int) ) => x._2
    //TODO maxBy(func: 集合元素类型 => B ): 根据指定字段取集合最大元素
    //TODO maxBy里面的函数是针对每个元素操作
    //TODO maxBy是根据函数的返回值取最大元素
    println(list2.maxBy(func))
    //TODO 直接传递函数值
    println(list2.maxBy( (x: (String,Int,Int) ) => x._2 ))
    //TODO 省略参数类型
    println(list2.maxBy( ( x ) => x._2 ))
    //TODO 函数只有一个参数,省略参数列表的()
    println(list2.maxBy(  x  => x._2 ))
    //TODO 函数的参数只使用了一次,可以用_代替
    println(list2.maxBy(  _._2 ))
    //TODO minBy(func: 集合元素类型 => B ): 根据指定字段取集合最小元素
    //TODO minBy里面的函数是针对每个元素操作
    //TODO minBy是根据函数的返回值取最小元素
    println(list2.minBy(x => x._2))

    //排序
    //TODO sorted: 直接按照元素本身排序[默认升序]
    //升序
    println(list.sorted)
    //降序
    println(list.sorted.reverse)

    //TODO sortBy(func: 集合元素类型 => B ): 指定按照哪个字段排序[默认升序] *******
    // sortBy是根据函数的返回值排序,sortBy的函数是针对集合每个元素操作
    println(list2.sortBy( x => x._3 ))

    println(list.sortBy(x => x))

    //TODO sortWith(func: (集合元素类型,集合元素类型)=>Boolean ): 按照排序规则排序
    //升序
    println(list.sortWith((x, y) => x < y))
    //降序
    println(list.sortWith((x, y) => x > y))
  }
}

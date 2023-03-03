package com.filbert.chapter07

object $15_CollectionHightFunction {

  def main(args: Array[String]): Unit = {

    //TODO map(func: 集合元素类型 => B ) : 一对一映射[ 原集合一个元素经过计算之后得到新集合一个元素 ]
    // TODO      map里面的函数是针对每个元素操作,元素有多少个,函数就执行多少次
    //TODO       map会生成一个新集合,新集合元素个数 = 原集合元素个数
    //TODO       map的使用场景: 一般用于数据类型/值的转换[一对一转换]
    //TODO       map类似sql的select
    //TODO       map类似有yield关键字的for循环
    val list = List( 1,4,3,6,8,10 )
    val list2 = list.map( x=> {
      x * 10
    } )
    println(list2)

    //TODO foreach(func: 集合元素类型=>B):Unit : 对每个元素遍历
    //TODO foreach里面的函数是针对每个元素操作,元素有多少个,函数就执行多少次
    //TODO foreach与map的区别
    //TODO     foreach相当于没有yield关键字的for循环,foreach不会生成新集合
    //TODO     map相当于有yield关键字的for循环,map会生成新集合
    list.foreach(x=> println(x))
    list.foreach(println(_))
    list.foreach(println)

    //TODO flatten: 压平
    //TODO flatten针对是集合嵌套集合的数据类型
    //TODO flatten是将第二层集合压掉,保留元素
    //TODO flatten类似sql的explode
    //TODO flatten生成的新集合元素个数一般是 >= 原集合元素个数

    val list3: List[List[Int]] = List( List(1,2,3),List(4,5,6) )

    val list4 = list3.flatten
    println(list4)

    //list.flatten
    val list5:List[List[List[Int]]] = List(
      List(
        List(1,2),
        List(3,4)
      ),
      List(
        List(4,5),
        List(6,7)
      )
    )

    val list6 = list5.flatten
    println(list6)

    //TODO flatMap(func: 集合元素类型 => 集合 ) = map  + flatten : 数据转换+压平
    //TODO flatMap里面的函数是针对每个元素操作,元素有多少,函数就执行多少次
    //TODO flatMap是先执行类似map操作,然后对map返回的集合元素进行压平
    //TODO flatMap的应用场景: 一对多转换

    val list7 = List("hello java spark","hello java hadoop","hello java java")

    val list8 = list7.map(x=> x.split(" "))

    println(list8.flatten)

    //val func = (x:String) => x.split(" ")
    println( list7.flatMap(x=>x.split(" ")) )

    //TODO filter(func: 集合元素类型=>Boolean ): 按照指定条件过滤
    //TODO filter里面的函数是针对每个元素操作,元素有多少,函数就执行多少次
    //TODO filter保留的是函数返回值为true的数据
    //TODO filter类似sql的where
    //TODO filter的应用场景: 用于过滤脏数或者其他不符合要求的数据
    val list9 = List(10,4,2,6,8)
    println(list9.filter(x => x % 4 == 0))
    println(list9.filter(_ % 4 == 0))

    //TODO groupBy(func: 集合元素类型=> K ): 按照自定字段分组
    //TODO groupBy里面的函数是针对每个元素操作
    //TODO gorupBy是按照函数的返回值分组,值相同的在一组
    //TODO groupBy生成的是Map集合, K的是函数的返回值,V是K对应原集合中所有元素的集合
    val list10 = List( ("lisi","man","shenzhen"),("wangwu","woman","beijing"),("zhaoliu","man","beijing"),("qianqi","woman","guangzhou") )

    //统计每个地区人的个数
    val list11 = list10.groupBy( x => x._3 )

    val list12 = list11.map(x=> {
      //x = shenzhen -> List((lisi,man,shenzhen))

      (x._1 , x._2.size)
    })
    println(list12)

    //TODO 聚合函数
    //TODO  reduce(func: (集合元素类型，集合元素类型)=>集合元素类型): 从左向右对集合所有元素聚合
    //TODO  reduce函数第一个参数代表上一次的聚合结果,第一次聚合的时候,参数初始值 = 集合第一个元素
    //TODO  reduce函数第二个参数代表当前待聚合的元素
    val list13 = List(10,30,20,50,60)
    println( list13.reduce((tmp, curr) =>{
      println(s"tmp=${tmp} curr=${curr}")
      tmp + curr
    }) )

    //TODO  reduceRight(func: (集合元素类型，集合元素类型)=>集合元素类型): 从右向左对集合所有元素聚合
    //TODO  reduceRight函数第二个参数代表上一次的聚合结果,第一次聚合的时候,参数初始值 = 集合最后一个元素
    //TODO  reduceRight函数第一个参数代表当前待聚合的元素
    println( list13.reduceRight((curr, tmp) =>{
      println(s"tmp=${tmp} curr=${curr}")
      tmp + curr
    }) )
    //TODO  fold(默认值)(func: (集合元素类型，集合元素类型)=>集合元素类型): 从左向右对集合所有元素聚合
    //TODO  fold函数第一个参数代表上一次的聚合结果,第一次聚合的时候,参数初始值 = 默认值
    //TODO  fold函数第二个参数代表当前待聚合的元素
    println( list13.fold(0)((tmp, curr) =>{
      println(s"fold tmp=${tmp} curr=${curr}")
      tmp + curr
    }) )
    //TODO  foldRight(默认值)(func: (集合元素类型，集合元素类型)=>集合元素类型): 从右向左对集合所有元素聚合
    //TODO  foldRight函数第二个参数代表上一次的聚合结果,第一次聚合的时候,参数初始值 = 默认值
    //TODO  foldRight函数第一个参数代表当前待聚合的元素
    println( list13.foldRight(0)((curr, tmp) =>{
      println(s"foldRight tmp=${tmp} curr=${curr}")
      tmp + curr
    }) )
  }
}

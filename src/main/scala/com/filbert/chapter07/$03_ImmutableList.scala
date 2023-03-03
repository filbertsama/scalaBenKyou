package com.filbert.chapter07

object $03_ImmutableList {

  def main(args: Array[String]): Unit = {

    //TODO 不可变List的创建方式: List[元素类型](初始元素,....)
    var list = List[Int](1,5,4,3)

    //TODO 添加元素
      //TODO  :: 是添加单个元素,等价于+:
      val list2 = list.::(30)
      println(list2)
      println(list)

      //list :: 30
      val list3 = 40 :: 30 :: list
      println(list3)
      //TODO Nil相当于空的不可变List, ::方法在使用空格调用的时候,在最右边必须是不可变List或者Nil
      val list4 = 40 :: 30 :: Nil
      println(list4)
      //TODO  ::: 是添加一个集合所有元素,等价于++:
      val list5 = List(111,222,333) ::: List(555,666,777)
      val list6 = List(555,666,777).:::(List(111,222,333))
      println(list6)

    //TODO 删除元素

    //TODO 获取角标元素: 集合名(角标)
    println(list6(0))

    //TODO 修改指定角标的元素
    //list6(0) = 100
    val list7 = list6.updated(0,100)
    println(list7)
    println(list6)

    list+:=(30)

    println(list)
  }
}

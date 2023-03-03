package com.filbert.chapter07

import scala.collection.mutable.ListBuffer

object $04_MutableList {

  def main(args: Array[String]): Unit = {

    //TODO 可变List的创建方式1: ListBuffer[元素类型](初始元素,...)
    val list = ListBuffer[Int](1,4,3,2)
    println(list)

    //TODO 可变List的创建方式: new ListBuffer[元素类型]()
    val list2 = new ListBuffer[Int]()
    println(list2)

    //
    var list3 = ListBuffer[Int](4,5,6)

    println(list3.hashCode())

    list3+:=(40)     // 等价于 list3 = list3.+:(40)

    println(list3.hashCode())
    println(list3)

    //TODO 添加、删除元素与可变数组一致

    //TODO 获取指定角标元素
    println(list3(0))

    //TODO 修改指定角标元素
    list3(0) = 4000
    println(list3)
  }
}

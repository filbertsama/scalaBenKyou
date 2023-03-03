package com.filbert.chapter07

import scala.collection.mutable

object $11_MutableQueue {

  def main(args: Array[String]): Unit = {

    //TODO 创建可变队列: mutable.Queue[元素类型](初始元素,...)
    val q1 = mutable.Queue[Int](1,4,3,2)
    println(q1)

    //TODO 添加元素
    q1.enqueue(110,11,22)
    println(q1)

    //TODO 删除元素
    q1.dequeue()
    println(q1)

    //TODO 获取角标元素
    println(q1(0))

    //TODO 修改角标元素
    q1(0) = 100
    println(q1)
  }
}

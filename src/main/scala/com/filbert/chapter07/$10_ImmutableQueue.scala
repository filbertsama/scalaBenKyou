package com.filbert.chapter07

import scala.collection.immutable.Queue

object $10_ImmutableQueue {

  def main(args: Array[String]): Unit = {
    //TODO 队列: 先进先出
    //TODO 不可变队列的创建方式: Queue[元素类型](初始元素,....)
    val q1 = Queue[Int](1,4,3,2,5)
    println(q1)

    //TODO 添加元素
    val q2 = q1.enqueue(10)
    println(q2)

    //TODO 删除元素
    println(q1.dequeue)

    //TODO 根据角标获取值
    println(q1(0))

    //TODO 修改角标的值
    println(q1.updated(0, 10))
  }
}

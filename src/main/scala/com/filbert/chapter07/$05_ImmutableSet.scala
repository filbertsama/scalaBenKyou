package com.filbert.chapter07

object $05_ImmutableSet {

  def main(args: Array[String]): Unit = {
    //TODO set元素不重复,无序
    //TODO 不可变Set的创建: Set[元素类型](初始元素,....)
    val s1 = Set(1,10,4,3,2,1)
    println(s1)

    //TODO 添加元素
    val s2 = s1.+(20)
    println(s2)

    val s3 = s1.++(List(11,44,22,33))
    println(s3)

    val s4 = s1.++:(List(11,44,22,33))
    println(s4)

    //TODO 删除元素
    val s5 = s1.-(1)
    println(s5)

    val s6 = s1.--(List(2,3,4))
    println(s6)


  }
}

package com.filbert.chapter08

import scala.util.Random

object $01_MatchDefined {

  /**
    * 模式匹配的语法:
    *     变量 match {
    *       case 条件1 => {.....}
    *       case 条件2 => {.....}
    *       case 条件3 => {.....}
    *       ......
    *     }
    * 模式匹配有返回值,返回值就是符合条件的分支的块表达式的结果值
    *
    */
  def main(args: Array[String]): Unit = {

    val list = List(1,10,3.3,"hello",false,true,"spark")

    val index = Random.nextInt( list.length )
    println(index)

    val r = list(6) match {
      case 1 =>
        println("1.....")
        10
      case 3.3 =>
        println("3.3.....")
        20
      case "spark" =>    // =>右边的{}可以省略
        val a = 10
        val b = 30
        println(a+b)
        println("spark.....")
        30
      case "hello" =>
        println("hello.....")
        40
      case false =>
        println("false....")
        50
      //case x =>  println(s"${x}.....+") //相当于switch的default
      case _ =>
        println(s"其他.....+") //如果x变量在=>右边不使用,可以使用_代替
        -1
    }
  }
}

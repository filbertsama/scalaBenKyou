package com.filbert.chapter08

import scala.util.Random

object $02_MatchType {

  class Person
  class Student
  /**
    * 匹配类型语法
    *     变量 match {
    *
    *         case x:类型1 => ...
    *         case x:类型2 => ...
    *         case x:类型3 => ...
    *     }
    *
    */
  def main(args: Array[String]): Unit = {
    val list = List(1,10,3.3,"hello",false,true,"spark",new Person,new Student)

    val index = Random.nextInt( list.length )
    println(index)

    list(index) match {
      case _:Int =>
        println("int....")
      case _:Double =>
        println("double.....")
      case _:Person =>
        println("Person....")
      case x:Boolean =>
        println("boolean")
      case x =>
        println("其他类型....")
    }
  }
}

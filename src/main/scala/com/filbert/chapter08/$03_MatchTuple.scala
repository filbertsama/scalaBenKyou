package com.filbert.chapter08

object $03_MatchTuple {

  def main(args: Array[String]): Unit = {

    val t = ("lisi",20,"深圳")

    //TODO 元组在匹配的时候,变量是几元元组,匹配条件就只能是几元元组
    t match {
      case (x,_,z) =>
        println(x)
        println(z)
    }

    val list4 = List(
      ("宝安区",("宝安中学", ("王者峡谷班",("安其拉",18)))),
      ("宝安区",("宝安中学", ("王者峡谷班",("甄姬",18)))),
      ("宝安区",("宝安中学", ("王者峡谷班",("妲己",18)))),
      ("宝安区",("宝安中学", ("王者峡谷班",("王昭君",18)))),
      ("宝安区",("宝安中学", ("王者峡谷班",("扁鹊",18))))
    )

    val list5 = list4.map(x=> {

      x match {
        case (_, (_, (_ , (stuName,_))) ) => stuName
      }
    })

    println(list5)
  }
}

package com.atguigu.sparkmall0705.util

import scala.util.Random

object RandomNum {

  def apply(fromNum:Int,toNum:Int): Int =  {10
    fromNum+ new Random().nextInt(toNum-fromNum+1)
  }
  def multi(fromNum:Int,toNum:Int,amount:Int,delimiter:String,canRepeat:Boolean) ={
    // 实现方法  在fromNum和 toNum之间的 多个数组拼接的字符串 共amount个
    //用delimiter分割  canRepeat为false则不允许重复
    "1,2"
}

  def main(args: Array[String]): Unit = {
    println(new Random().nextInt(2))
  }

}


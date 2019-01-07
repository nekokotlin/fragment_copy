package com.example.nb201803m079.testfragment
import java.lang.Math.abs

class ClsListData {

    private var itemCount = 10
    private val dummyList :ArrayList<String> = ArrayList()
    init {
        dummyList.add("サンプル 001")
        dummyList.add("サンプル 002")
        dummyList.add("サンプル 003")
        dummyList.add("サンプル 004")
        dummyList.add("サンプル 005")
        dummyList.add("サンプル 006")
        dummyList.add("サンプル 007")
        dummyList.add("サンプル 008")
        dummyList.add("サンプル 009")
        dummyList.add("サンプル 010")
    }

    var size: Int = 0
    get(){
        return dummyList.size
    }

    val ListData: ArrayList<String>
    get(){
        return dummyList
    }

    fun putItem(){
        itemCount ++
        val itemData: String = String.format("サンプル %03d", itemCount)
        dummyList.add(itemData)
    }

    fun getItem( Idx:Int): String{
        return dummyList[Idx]
    }

    fun deleteItem(Idx: Int){
        dummyList.removeAt(Idx)
    }

    fun moveItem(formIdx:Int, toIdx:Int){
        when{
            1 == abs(formIdx-toIdx) -> {
                exchangeItem(formIdx, toIdx)
            }

            formIdx < toIdx -> {
                val tmp = dummyList[formIdx]
                val ePosition = toIdx-1
                for(i:Int in formIdx..ePosition){
                    exchangeItem(i, i+1)
                }
                dummyList[toIdx] = tmp
            }

            else -> {
                val tmp = dummyList[toIdx]
                val ePosition = formIdx+1
                for(i:Int in toIdx..ePosition){
                    exchangeItem(i, i-1)
                }
                dummyList[toIdx] = tmp
            }
        }
    }

    private fun exchangeItem(formIdx: Int, toIdx: Int){
        val tmp: String = dummyList[toIdx]
        dummyList[toIdx] = dummyList[formIdx]
        dummyList[formIdx] = tmp
    }

}
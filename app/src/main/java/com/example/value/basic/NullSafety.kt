package com.example.value.basic
// null dữ liệu
class NullSafety {
    fun main(){
        var ten : String = "Hoa"
        // cách để kiểm tra xem biến có null hay không
        //ten = null
        //khi gõ như trên sẽ báo lỗi
        // có thể set cái biến đó về null = cách dùng ?
        var age : Int? = 9
        age = null

        // khi muốn xđ 1 value nào đó k muốn nó null thì dùng !!
        // !! k dc phépnull
        var adress : String = "Hòa Xuân"!!
        // có 1 trường hợp đb nó sẽ k lỗi compile nhưng lỗi syntax
        var address : String = null!!
        address = "Cẩm Lệ"

    }
}
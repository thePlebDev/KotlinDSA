package KotlinDSA.linkedList

class LinkedList<T> {

    data class Node<T>(var value:T, var next:Node<T>? = null){
        override fun toString(): String {
            return if (next != null) {
                "$value -> ${next.toString()}"
            } else {
                "$value"
            }
        }

    }

    private var head: Node<T>? = null
    private var tail:Node<T>? = null
    private var size = 0

    private fun isEmpty():Boolean{
        return size ==0
    }

    fun push(value:T):LinkedList<T>{
        head = Node(value=value, next = head)
        if(tail == null){
            tail = head
        }
        size++
        return this
    }
    fun append(value:T):LinkedList<T>{
        //1
        if(isEmpty()){
            return push(value)
        }
        //2
        tail?.next = Node(value = value)

        //3
        tail = tail?.next
        size++
        return this


    }


    override fun toString(): String {
        return if(isEmpty()){
            "EMPTY LIST!!!"
        }else{
            head.toString()
        }
    }

}
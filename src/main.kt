fun main() {
    val student:Student? = null

    val unit = student?.let{ st ->  //не возвращает обратного значения
                                    // работаем с объектом через ключевое слово
        st.hi()
        st.bye()
        st.name = "Masha"
    }
    println(student?.name)
    val student2 = student?.apply { //возвращает измененный объект
                                    //работаем с содержимым объекта
        hi()
        bye()
        name = "LolKek"
    }
    println(student?.name)
    println(student2?.name)
    val count = Student().run { //возвращает обратное значение с посленей строки
                                //работаем с содержимым объекта
        hi()
        bye()
        countOfDebts = 15
        countOfDebts
    }
    println(count)

    val str = with(Student()) { //возвращает обратное значение с посленей строки
                      //работаем с содержимым объекта
        hi()
        bye()
        name = "Pasha"
        name
    }
    println(str)

    val student3 = Student().also {st -> // возвращает измененный объект
                                         // работаем с объектом через ключевое слово
        st.hi()
        st.bye()
        st.countOfDebts = 5
    }
    println(student3.countOfDebts)
}
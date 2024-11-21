package ru.example.a2111

class cities {
    val cityNames = arrayListOf(
        "Москва",
        "Калининград",
        "Волжск",
        "Дмитриевград",
        "Архангельск",
        "Киров",
        "Воронеж",
        "Жуковский",
        "Йошкар-Ола",
        "Антверпен",
        "Архангельск",
        "Биробиджан",
        "Бологое",
        "Бонн",
        "Екатеринбург",
        "Нижнекамск"
    )
    var checked = mutableListOf<String>()
    fun nextCity(str: String, i:Int): String {
        if (checked.size > 0 && cityNames.contains(str) && !checked.contains(str)) {
            var prev = checked[checked.size - 1]
            if (str[0] == prev[prev.length - 1]) {
                checked.add(str)
                return "Continue"
            } else {
                return "Победил ${(i-1)%2+1} игрок "
                checked.clear()
            }
        } else {
            if(cityNames.contains(str)) {
                checked.add(str)
                return "Continue"
            }
            else{
                return "Нет такого слова, победил игрок ${(i-1)%2+1}"
                checked.clear()
            }
        }

    }
}

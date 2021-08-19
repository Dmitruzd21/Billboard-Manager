import ru.netology.Manager;
import ru.netology.domain.Film;

public class Main {
    public static void main(String[] args) {
        Film f1 = new Film(1, "Бладшот", "боевик", "https://github.com/netology-code/javaqa-homeworks/blob/master/dependency/pic/afisha.png", false);
        Film f2 = new Film(2, "Вперед", "мульфильм", "https://github.com/netology-code/javaqa-homeworks/blob/master/dependency/pic/afisha.png", false);
        Film f3 = new Film(3, "Отель Белград", "комедия", "https://github.com/netology-code/javaqa-homeworks/blob/master/dependency/pic/afisha.png", false);
        Film f4 = new Film(4, "Джентельмены", "боевик", "https://github.com/netology-code/javaqa-homeworks/blob/master/dependency/pic/afisha.png", false);
        Film f5 = new Film(5, "Человек-Неведимка", "ужасы", "https://github.com/netology-code/javaqa-homeworks/blob/master/dependency/pic/afisha.png", false);
        Film f6 = new Film(6, "Тролли", "мультфильм", "https://github.com/netology-code/javaqa-homeworks/blob/master/dependency/pic/afisha.png", false);
        Film f7 = new Film(7, "Номер один", "комедия", "https://github.com/netology-code/javaqa-homeworks/blob/master/dependency/pic/afisha.png", false);
        Film f8 = new Film(8, "Кунгфу Панда", "мульфильм", "https://github.com/netology-code/javaqa-homeworks/blob/master/dependency/pic/afisha.png", false);
        Film f9 = new Film(9, "Кунгфу Панда 2", "мульфильм", "https://github.com/netology-code/javaqa-homeworks/blob/master/dependency/pic/afisha.png", false);
        Film f10 = new Film(10, "Кунгфу Панда 3", "мульфильм", "https://github.com/netology-code/javaqa-homeworks/blob/master/dependency/pic/afisha.png", false);
        Film f11 = new Film(11, "Шрек", "боевик", "https://github.com/netology-code/javaqa-homeworks/blob/master/dependency/pic/afisha.png", false);
        Film f12 = new Film(12, "Шрек 2", "мульфильм", "https://github.com/netology-code/javaqa-homeworks/blob/master/dependency/pic/afisha.png", false);
        Film f13 = new Film(13, "Щрек 3", "мульфильм", "https://github.com/netology-code/javaqa-homeworks/blob/master/dependency/pic/afisha.png", false);
        Film f14 = new Film(14, "Главный Герой", "фантастика", "https://github.com/netology-code/javaqa-homeworks/blob/master/dependency/pic/afisha.png", false);
        Film f15 = new Film(15, "Бросок Кобры", "фантастика", "https://github.com/netology-code/javaqa-homeworks/blob/master/dependency/pic/afisha.png", false);

       Manager repo = new Manager();
       repo.save(f1);
       repo.save(f2);
       repo.save(f3);


    }

}

package ru.netology;

import com.sun.tools.javac.Main;
import ru.netology.Manager;
import ru.netology.domain.Film;

public class Manager {
    private Film[] films = new Film[0];

    // Добавление фильма
    public void save(Film film) {
        Film[] tmp = new Film[films.length + 1];
        for (int i = 0; i < films.length; i++) {
            tmp[i] = films[i];
        }
        tmp[tmp.length - 1] = film;
        films = tmp;

    }

    // Возвращает массив всех хранящихся в массиве объектов (в обратном порядке)
    private int numberOfDisplayedFilms = 10;

    public Manager(int numberOfDisplayedFilms) {
        this.numberOfDisplayedFilms = numberOfDisplayedFilms;
    }

    public Manager() {
        this.numberOfDisplayedFilms = numberOfDisplayedFilms;
    }


    public Film[] findLessOrEqual10() {
        int resultLength;
        if (films.length < numberOfDisplayedFilms) {
            resultLength = films.length;
        } else {
            resultLength = numberOfDisplayedFilms;
        }
        Film[] result = new Film[resultLength];
        for (int i = 0; i < resultLength; i++) {
            int index = resultLength - 1 - i;
            result[i] = films[index];
        }
        return result;
    }

    // ***Удаление фильма
    public void removeById(int id) {
        Film[] tmp2 = new Film[films.length - 1];
        int index = 0;
        for (Film film2 : films) {
            if (film2.getId() != id) {
                tmp2[index] = film2;
                index++;
            }
        }
        films = tmp2;
    }

    // ***Возвращает весь массив в прямом порядке
    public Film[] findAll() {
        Film[] result = new Film[films.length];
        for (int i = 0; i < films.length; i++) {
            result[i] = films[i];
        }
        return result;
    }

    // ***Возвращает массив всех хранящихся в массиве объектов (в обратном порядке)
    public Film[] findAllInReverse() {
        Film[] result = new Film[films.length];
        for (int i = 0; i < films.length; i++) {
            int index = films.length - 1 - i;
            result[i] = films[index];
        }
        return result;
    }

    // ***Полное удаление элементов репозитория
    public Film[] removeAll() {
        Film[] empty = new Film[0];
        films = empty;
        return films;
    }

}


//Film f1 = new Film(1, "Бладшот", "боевик", "https://github.com/netology-code/javaqa-homeworks/blob/master/dependency/pic/afisha.png", false);
// Film f2 = new Film(2, "Вперед", "мульфильм", "https://github.com/netology-code/javaqa-homeworks/blob/master/dependency/pic/afisha.png", false);
// Film f3 = new Film(3, "Отель Белград", "комедия", "https://github.com/netology-code/javaqa-homeworks/blob/master/dependency/pic/afisha.png", false);
// Film f4 = new Film(4, "Джентельмены", "боевик", "https://github.com/netology-code/javaqa-homeworks/blob/master/dependency/pic/afisha.png", false);
// Film f5 = new Film(5, "Человек-Неведимка", "ужасы", "https://github.com/netology-code/javaqa-homeworks/blob/master/dependency/pic/afisha.png", false);
// Film f6 = new Film(6, "Тролли", "мультфильм", "https://github.com/netology-code/javaqa-homeworks/blob/master/dependency/pic/afisha.png", false);
// Film f7 = new Film(7, "Номер один", "комедия", "https://github.com/netology-code/javaqa-homeworks/blob/master/dependency/pic/afisha.png", false);
// Film f8 = new Film(8, "Кунгфу Панда", "мульфильм", "https://github.com/netology-code/javaqa-homeworks/blob/master/dependency/pic/afisha.png", false);
// Film f9 = new Film(9, "Кунгфу Панда 2", "мульфильм", "https://github.com/netology-code/javaqa-homeworks/blob/master/dependency/pic/afisha.png", false);
// Film f10 = new Film(10, "Кунгфу Панда 3", "мульфильм", "https://github.com/netology-code/javaqa-homeworks/blob/master/dependency/pic/afisha.png", false);
// Film f11 = new Film(11, "Шрек", "боевик", "https://github.com/netology-code/javaqa-homeworks/blob/master/dependency/pic/afisha.png", false);
// Film f12 = new Film(12, "Шрек 2", "мульфильм", "https://github.com/netology-code/javaqa-homeworks/blob/master/dependency/pic/afisha.png", false);
// Film f13 = new Film(13, "Щрек 3", "мульфильм", "https://github.com/netology-code/javaqa-homeworks/blob/master/dependency/pic/afisha.png", false);
// Film f14 = new Film(14, "Главный Герой", "фантастика", "https://github.com/netology-code/javaqa-homeworks/blob/master/dependency/pic/afisha.png", false);
// Film f15 = new Film(15, "Бросок Кобры", "фантастика", "https://github.com/netology-code/javaqa-homeworks/blob/master/dependency/pic/afisha.png", false);

//System.arraycopy (items,0,tmp, 0, items.length)
//(из какого массива, с какого места, куда копировать,с какого места всавлять, количество элементов которые хотим скопировать)


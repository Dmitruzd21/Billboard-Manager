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

    //Удаление фильма
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


    //Возвращает массив всех хранящихся в массиве объектов (в обратном порядке)
    //public Film[] findAll () {

    // return
    // }

    private int numberOfDisplayedFilms = 10;

    public Manager(int numberOfDisplayedFilms) {
        this.numberOfDisplayedFilms = numberOfDisplayedFilms;
    }

    public Manager() {
        this.numberOfDisplayedFilms = numberOfDisplayedFilms;
    }


    public void returFilmsInReverseOrder() {

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

//  String[] films = new String[15];
// films[0] =films.f1;
//  films[1] = "f2";
//  films[2] = "f3";
//  films[3] = "f4";
//  films[4] = "f5";
//  films[5] = "f6";
//  films[6] = "f7";
//   films[7] = "f8";
// films[8] = "f9";
//  films[9] = "f10";
//  films[10] = "f11";
//   films[11] = "f12";
//  films[12] = "f13";
//  films[13] = "f14";
//  films[14] = "f15";

// Добавление фильма

//public void addNewFilm (films);
// String newFilm = "f16";
// String[] tmp = new String[films.length + 1];
// for (int i = 0; i < films.length; i++) {
//      tmp[i] = films[i];
//  }
//  tmp[tmp.length - 1] = newFilm;
//  films = tmp;


//Выдать фильмы в обратном порядке


//Удаление фильма

// String removeFilm = "f3";
// String[] tmp2 = new String[films.length - 1];
// int index = 0;
//   for (String film : films) {
//   if (!film.equals(removeFilm)) {
//       tmp[index] = film;
//      index++;
//   }
// }
// films = tmp2;

// private int numberOfDisplayedFilms = 10;

//  public Manager(int numberOfDisplayedFilms) {
//      this.numberOfDisplayedFilms = numberOfDisplayedFilms;
//  }

//    public Manager() {
//      this.numberOfDisplayedFilms = numberOfDisplayedFilms;


//System.arraycopy (items,0,tmp, 0, items.length)
//(из какого массива, с какого места, куда копировать,с какого места всавлять, количество элементов которые хотим скопировать)
//}


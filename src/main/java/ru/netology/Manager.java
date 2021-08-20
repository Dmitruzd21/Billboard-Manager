package ru.netology;

import com.sun.tools.javac.Main;
import ru.netology.Manager;
import ru.netology.domain.Film;

public class Manager {
    private Film[] films = new Film[0];
    private int numberOfDisplayedFilms = 10;

    public Manager(int numberOfDisplayedFilms) {
        this.numberOfDisplayedFilms = numberOfDisplayedFilms;
    }

    public Manager() {
        this.numberOfDisplayedFilms = numberOfDisplayedFilms;
    }


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

    // ***Возвращает весь массив в прямом порядке
    public Film[] findAll() {
        Film[] result = new Film[films.length];
        for (int i = 0; i < films.length; i++) {
            result[i] = films[i];
        }
        return result;
    }

    // Возвращает объект по идентификатору (либо null, если такого объекта нет)

    public Film[] findById(int id) {
        Film[] result = new Film[1];
        int i = 0;
        for (Film film : films) {
            if (film.getId() == id) {
                result[i] = film;
                i++;
            }
        }
        return result;
    }

    // ***Удаление фильма
    public void removeById(int id) {
        Film[] tmp2 = new Film[films.length - 1];
        int index = 0;
        for (Film film : films) {
            if (film.getId() != id) {
                tmp2[index] = film;
                index++;
            }
        }
        films = tmp2;
    }

    // ***Полное удаление элементов репозитория
    public void removeAll() {
        Film[] empty = new Film[0];
        films = empty;
    }

    // ***НЕТ В ДЗ!!!Возвращает массив всех хранящихся в массиве объектов (в обратном порядке)
    public Film[] findAllInReverse() {
        Film[] result = new Film[films.length];
        for (int i = 0; i < films.length; i++) {
            int index = films.length - 1 - i;
            result[i] = films[index];
        }
        return result;
    }
}
//System.arraycopy (items,0,tmp, 0, items.length)
//(из какого массива, с какого места, куда копировать,с какого места всавлять, количество элементов которые хотим скопировать)


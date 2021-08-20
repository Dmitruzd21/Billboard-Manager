package ru.netology;

import org.junit.jupiter.api.Test;
import ru.netology.domain.Film;

import static org.junit.jupiter.api.Assertions.*;

class ManagerTest {
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


    //Проверка добавления фильма
    @Test
    public void shouldSaveIfNoOneFilmsExist() {
        Manager manager = new Manager();
        manager.save(f1);
        Film[] expected = new Film[]{f1};
        Film[] actual = manager.findAll();
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldSaveIfSomeFilmsExist() {
        Manager manager = new Manager();
        manager.save(f1);
        manager.save(f2);
        manager.save(f3);
        Film[] expected = new Film[]{f1, f2, f3};
        Film[] actual = manager.findAll();
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldSaveIfTheSameFilmExist() {
        Manager manager = new Manager();
        Film f1 = new Film(1, "Бладшот", "боевик", "https://github.com/netology-code/javaqa-homeworks/blob/master/dependency/pic/afisha.png", false);
        Film f2 = new Film(2, "Вперед", "мульфильм", "https://github.com/netology-code/javaqa-homeworks/blob/master/dependency/pic/afisha.png", false);
        Film f3 = new Film(3, "Отель Белград", "комедия", "https://github.com/netology-code/javaqa-homeworks/blob/master/dependency/pic/afisha.png", false);
        Film f4 = new Film(3, "Отель Белград", "комедия", "https://github.com/netology-code/javaqa-homeworks/blob/master/dependency/pic/afisha.png", false);
        manager.save(f1);
        manager.save(f2);
        manager.save(f3);
        manager.save(f4);
        Film[] expected = new Film[]{f1, f2, f3, f4};
        Film[] actual = manager.findAll();
        assertArrayEquals(expected, actual);
    }

    //Проверка выдачи последних 10 добавленных фильмов обратном порядке или сколько есть
    @Test
    public void shouldFindLessOrEqual10If9() {
        Manager manager = new Manager();
        manager.save(f1);
        manager.save(f2);
        manager.save(f3);
        manager.save(f4);
        manager.save(f5);
        manager.save(f6);
        manager.save(f7);
        manager.save(f8);
        manager.save(f9);
        Film[] expected = new Film[]{f9, f8, f7, f6, f5, f4, f3, f2, f1};
        Film[] actual = manager.findLessOrEqual10();
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLessOrEqual10IfEqual10() {
        Manager manager = new Manager();
        manager.save(f1);
        manager.save(f2);
        manager.save(f3);
        manager.save(f4);
        manager.save(f5);
        manager.save(f6);
        manager.save(f7);
        manager.save(f8);
        manager.save(f9);
        manager.save(f10);
        Film[] expected = new Film[]{f10, f9, f8, f7, f6, f5, f4, f3, f2, f1};
        Film[] actual = manager.findLessOrEqual10();
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLessOrEqual10If11() {
        Manager manager = new Manager();
        manager.save(f1);
        manager.save(f2);
        manager.save(f3);
        manager.save(f4);
        manager.save(f5);
        manager.save(f6);
        manager.save(f7);
        manager.save(f8);
        manager.save(f9);
        manager.save(f10);
        manager.save(f11);
        Film[] expected = new Film[]{f10, f9, f8, f7, f6, f5, f4, f3, f2, f1};
        Film[] actual = manager.findLessOrEqual10();
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLessOrEqual10IfNoOneExist() {
        Manager manager = new Manager();
        Film[] expected = new Film[0];
        Film[] actual = manager.findLessOrEqual10();
        assertArrayEquals(expected, actual);

    }

    //  Проверка возвращения объекта по идентификатору (либо null, если такого объекта нет)
    @Test
    public void shoildfindByIdIfIdExist() {
        Manager manager = new Manager();
        manager.save(f1);
        manager.save(f2);
        manager.save(f3);
        manager.save(f4);
        manager.save(f5);
        Film[] expected = new Film[]{f3};
        Film[] actual = manager.findById(3);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shoildfindByIdIfIdNoExist() {
        Manager manager = new Manager();
        manager.save(f1);
        manager.save(f2);
        manager.save(f4);
        manager.save(f5);
        Film[] expected = new Film[]{null};
        Film[] actual = manager.findById(3);
        assertArrayEquals(expected, actual);
    }

    //Проверка удаления объекта по идентификатору
    @Test
    public void shouldRemoveByIdIfManyFilmsExist() {
        Manager manager = new Manager();
        manager.save(f1);
        manager.save(f2);
        manager.save(f3);
        manager.save(f4);
        manager.save(f5);
        manager.save(f6);
        manager.save(f7);
        manager.removeById(4);
        Film[] expected = new Film[]{f1, f2, f3, f5, f6, f7};
        Film[] actual = manager.findAll();
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldRemoveByIdIfOneFilmExist() {
        Manager manager = new Manager();
        manager.save(f1);
        manager.removeById(1);
        Film[] expected = new Film[0];
        Film[] actual = manager.findAll();
        assertArrayEquals(expected, actual);
    }

    //Проверка полного очищения репозитория
    @Test
    public void shouldRemoveAll() {
        Manager manager = new Manager();
        manager.save(f1);
        manager.save(f2);
        manager.save(f3);
        manager.save(f4);
        manager.save(f5);
        manager.save(f6);
        manager.save(f7);
        manager.save(f8);
        manager.save(f9);
        manager.removeAll();
        Film[] expected = new Film[0];
        Film[] actual =manager.findAll();
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldRemoveAllIfNoOneExist() {
        Manager manager = new Manager();
        manager.removeAll();
        Film[] expected = new Film[0];
        Film[] actual = manager.findAll();
        assertArrayEquals(expected, actual);
    }

//НЕТ В ДЗ!!! Проверка возвращения всех элементов массива в прямом порядке
    @Test
    public void shouldFindAllInReverseIfManyFilmsExist() {
        Manager manager = new Manager();
        manager.save(f1);
        manager.save(f2);
        manager.save(f3);
        manager.save(f4);
        manager.save(f5);
        manager.save(f6);
        manager.save(f7);
        manager.save(f8);
        manager.save(f9);
        Film[] expected = new Film[]{f9, f8, f7, f6, f5, f4, f3, f2, f1};
        Film[] actual = manager.findAllInReverse();
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindAllInReverseIfOneExist() {
        Manager manager = new Manager();
        manager.save(f1);
        Film[] expected = new Film[]{f1};
        Film[] actual = manager.findAllInReverse();
        assertArrayEquals(expected, actual);

    }

    @Test
    public void shouldFindAllInReverseIfNoOneExist() {
        Manager manager = new Manager();
        Film[] expected = new Film[0];
        Film[] actual = manager.findAllInReverse();
        assertArrayEquals(expected, actual);
    }

}

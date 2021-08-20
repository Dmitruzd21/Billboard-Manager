package ru.netology;

import org.junit.jupiter.api.Test;
import ru.netology.domain.Film;

import static org.junit.jupiter.api.Assertions.*;

class ManagerTest {

    @Test
    public void shouldsaveIfNoOneFilmsExist() {
        Manager manager = new Manager();
        Film f1 = new Film(1, "Бладшот", "боевик", "https://github.com/netology-code/javaqa-homeworks/blob/master/dependency/pic/afisha.png", false);
        manager.save(f1);
        Film[] expected = new Film[]{f1};
        Film[] actual = manager.findAll();
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldsaveIfSomeFilmsExist() {
        Manager manager = new Manager();
        Film f1 = new Film(1, "Бладшот", "боевик", "https://github.com/netology-code/javaqa-homeworks/blob/master/dependency/pic/afisha.png", false);
        Film f2 = new Film(2, "Вперед", "мульфильм", "https://github.com/netology-code/javaqa-homeworks/blob/master/dependency/pic/afisha.png", false);
        Film f3 = new Film(3, "Отель Белград", "комедия", "https://github.com/netology-code/javaqa-homeworks/blob/master/dependency/pic/afisha.png", false);
        manager.save(f1);
        manager.save(f2);
        manager.save(f3);
        Film[] expected = new Film[]{f1, f2, f3};
        Film[] actual = manager.findAll();
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldsaveIfTheSameFilmExist() {
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

    @Test
    public void shouldfindLessOrEqual10If9() {
        Manager manager = new Manager();
        Film f1 = new Film(1, "Бладшот", "боевик", "https://github.com/netology-code/javaqa-homeworks/blob/master/dependency/pic/afisha.png", false);
        Film f2 = new Film(2, "Вперед", "мульфильм", "https://github.com/netology-code/javaqa-homeworks/blob/master/dependency/pic/afisha.png", false);
        Film f3 = new Film(3, "Отель Белград", "комедия", "https://github.com/netology-code/javaqa-homeworks/blob/master/dependency/pic/afisha.png", false);
        Film f4 = new Film(4, "Джентельмены", "боевик", "https://github.com/netology-code/javaqa-homeworks/blob/master/dependency/pic/afisha.png", false);
        Film f5 = new Film(5, "Человек-Неведимка", "ужасы", "https://github.com/netology-code/javaqa-homeworks/blob/master/dependency/pic/afisha.png", false);
        Film f6 = new Film(6, "Тролли", "мультфильм", "https://github.com/netology-code/javaqa-homeworks/blob/master/dependency/pic/afisha.png", false);
        Film f7 = new Film(7, "Номер один", "комедия", "https://github.com/netology-code/javaqa-homeworks/blob/master/dependency/pic/afisha.png", false);
        Film f8 = new Film(8, "Кунгфу Панда", "мульфильм", "https://github.com/netology-code/javaqa-homeworks/blob/master/dependency/pic/afisha.png", false);
        Film f9 = new Film(9, "Кунгфу Панда 2", "мульфильм", "https://github.com/netology-code/javaqa-homeworks/blob/master/dependency/pic/afisha.png", false);
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
    public void shouldfindLessOrEqual10IfEqual10() {
        Manager manager = new Manager();
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
    public void shouldfindLessOrEqual10If11() {
        Manager manager = new Manager();
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
    public void shouldfindLessOrEqual10IfNoOneExist() {
        Manager manager = new Manager();
        Film[] expected = new Film[0];
        Film[] actual = manager.findLessOrEqual10();
        assertArrayEquals(expected, actual);

    }


}
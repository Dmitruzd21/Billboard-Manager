package ru.netology;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import ru.netology.manager.Manager;
import ru.netology.repository.FilmRepository;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
public class ManagerTest {
    @Mock
    private FilmRepository repository;
    @InjectMocks
    private Manager manager;
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
    Film f11 = new Film(11, "Шрек", "мульфильм", "https://github.com/netology-code/javaqa-homeworks/blob/master/dependency/pic/afisha.png", false);
    Film f12 = new Film(11, "Шрек 2", "мульфильм", "https://github.com/netology-code/javaqa-homeworks/blob/master/dependency/pic/afisha.png", false);
    Film f13 = new Film(11, "Шрек 3", "мультфильм", "https://github.com/netology-code/javaqa-homeworks/blob/master/dependency/pic/afisha.png", false);

    //Проверка выдачи последних 10 добавленных фильмов обратном порядке или сколько есть
    @Test
    public void shouldFindLessOrEqual10If9() {
        //настройка заглушки
        Film[] returned = new Film[]{f1, f2, f3, f4, f5, f6, f7, f8, f9};
        Mockito.doReturn(returned).when(repository).findAll();
        Film[] expected = new Film[]{f9, f8, f7, f6, f5, f4, f3, f2, f1};
        Film[] actual = manager.findLessOrEqualFixedAmount();
        assertArrayEquals(expected, actual);
        //удостоверяемся, что заглушка была вызвана
        Mockito.verify(repository).findAll();
    }

    @Test
    public void shouldFindLessOrEqual10IfEqual10() {
        //настройка заглушки
        Film[] returned = new Film[]{f1, f2, f3, f4, f5, f6, f7, f8, f9, f10};
        Mockito.doReturn(returned).when(repository).findAll();
        Film[] expected = new Film[]{f10, f9, f8, f7, f6, f5, f4, f3, f2, f1};
        Film[] actual = manager.findLessOrEqualFixedAmount();
        assertArrayEquals(expected, actual);
        //удостоверяемся, что заглушка была вызвана
        Mockito.verify(repository).findAll();
    }

    @Test
    public void shouldFindLessOrEqual10If11() {
        //настройка заглушки
        Film[] returned = new Film[]{f1, f2, f3, f4, f5, f6, f7, f8, f9, f10, f11};
        Mockito.doReturn(returned).when(repository).findAll();
        Film[] expected = new Film[]{f11, f10, f9, f8, f7, f6, f5, f4, f3, f2};
        Film[] actual = manager.findLessOrEqualFixedAmount();
        assertArrayEquals(expected, actual);
        //удостоверяемся, что заглушка была вызвана
        Mockito.verify(repository).findAll();
    }

    @Test
    public void shouldFindLessOrEqual10If12() {
        //настройка заглушки
        Film[] returned = new Film[]{f1, f2, f3, f4, f5, f6, f7, f8, f9, f10, f11, f12};
        Mockito.doReturn(returned).when(repository).findAll();
        Film[] expected = new Film[]{f12, f11, f10, f9, f8, f7, f6, f5, f4, f3};
        Film[] actual = manager.findLessOrEqualFixedAmount();
        assertArrayEquals(expected, actual);
        //удостоверяемся, что заглушка была вызвана
        Mockito.verify(repository).findAll();
    }

    @Test
    public void shouldFindLessOrEqual10If13() {
        //настройка заглушки
        Film[] returned = new Film[]{f1, f2, f3, f4, f5, f6, f7, f8, f9, f10, f11, f12, f13};
        Mockito.doReturn(returned).when(repository).findAll();
        Film[] expected = new Film[]{f13, f12, f11, f10, f9, f8, f7, f6, f5, f4};
        Film[] actual = manager.findLessOrEqualFixedAmount();
        assertArrayEquals(expected, actual);
        //удостоверяемся, что заглушка была вызвана
        Mockito.verify(repository).findAll();
    }

    @Test
    public void shouldFindLessOrEqual10IfNoOneExist() {
        Film[] returned = new Film[]{};
        Mockito.doReturn(returned).when(repository).findAll();
        Film[] expected = new Film[0];
        Film[] actual = manager.findLessOrEqualFixedAmount();
        assertArrayEquals(expected, actual);
        //удостоверяемся, что заглушка была вызвана
        Mockito.verify(repository).findAll();

    }
}


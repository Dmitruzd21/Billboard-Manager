package ru.netology.repository;

import org.junit.jupiter.api.Test;
import ru.netology.domain.Film;

import static org.junit.jupiter.api.Assertions.*;

class FilmRepositoryTest {
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

    FilmRepository repository = new FilmRepository();

    //Проверка добавления фильма
    @Test
    public void shouldSaveIfNoOneFilmsExist() {
        repository.save(f1);
        Film[] expected = new Film[]{f1};
        Film[] actual = repository.findAll();
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldSaveIfSomeFilmsExist() {
        repository.save(f1);
        repository.save(f2);
        repository.save(f3);
        Film[] expected = new Film[]{f1, f2, f3};
        Film[] actual = repository.findAll();
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldSaveIfTheSameFilmExist() {
        Film f1 = new Film(1, "Бладшот", "боевик", "https://github.com/netology-code/javaqa-homeworks/blob/master/dependency/pic/afisha.png", false);
        Film f2 = new Film(2, "Вперед", "мульфильм", "https://github.com/netology-code/javaqa-homeworks/blob/master/dependency/pic/afisha.png", false);
        Film f3 = new Film(3, "Отель Белград", "комедия", "https://github.com/netology-code/javaqa-homeworks/blob/master/dependency/pic/afisha.png", false);
        Film f4 = new Film(3, "Отель Белград", "комедия", "https://github.com/netology-code/javaqa-homeworks/blob/master/dependency/pic/afisha.png", false);
        repository.save(f1);
        repository.save(f2);
        repository.save(f3);
        repository.save(f4);
        Film[] expected = new Film[]{f1, f2, f3, f4};
        Film[] actual = repository.findAll();
        assertArrayEquals(expected, actual);
    }

    //Проверка выдачи последних 10 добавленных фильмов обратном порядке или сколько есть
    //  @Test
    // public void shouldFindLessOrEqual10If9() {
    //     manager.save(f1);
    //     manager.save(f2);
    //     manager.save(f3);
    //    manager.save(f4);
    //      manager.save(f5);
    //    manager.save(f6);
    //    manager.save(f7);
    //    manager.save(f8);
    //    manager.save(f9);
    //     Film[] expected = new Film[]{f9, f8, f7, f6, f5, f4, f3, f2, f1};
    //     Film[] actual = manager.findLessOrEqual10();
    //      assertArrayEquals(expected, actual);
    //  }

    //   @Test
    //  public void shouldFindLessOrEqual10IfEqual10() {
    //      manager.save(f1);
    //      manager.save(f2);
    //      manager.save(f3);
    //      manager.save(f4);
    //      manager.save(f5);
    //      manager.save(f6);
    //      manager.save(f7);
    //     manager.save(f8);
    //     manager.save(f9);
    //      manager.save(f10);
    //       Film[] expected = new Film[]{f10, f9, f8, f7, f6, f5, f4, f3, f2, f1};
    //       Film[] actual = manager.findLessOrEqual10();
    //       assertArrayEquals(expected, actual);
    //   }

    //  @Test
    //  public void shouldFindLessOrEqual10If11() {
    //     manager.save(f1);
    //     manager.save(f2);
    //     manager.save(f3);
    //     manager.save(f4);
    //     manager.save(f5);
    //     manager.save(f6);
    //     manager.save(f7);
    //     manager.save(f8);
    //     manager.save(f9);
    //    manager.save(f10);
    //     manager.save(f11);
    //    Film[] expected = new Film[]{f10, f9, f8, f7, f6, f5, f4, f3, f2, f1};
    //    Film[] actual = manager.findLessOrEqual10();
    //     assertArrayEquals(expected, actual);
    //  }

    //   @Test
    //  public void shouldFindLessOrEqual10IfNoOneExist() {
    //     Film[] expected = new Film[0];
    //     Film[] actual = manager.findLessOrEqual10();
    //      assertArrayEquals(expected, actual);

    //   }

    //  Проверка возвращения объекта по идентификатору (либо null, если такого объекта нет)
    @Test
    public void shoildfindByIdIfIdExist() {
        repository.save(f1);
        repository.save(f2);
        repository.save(f3);
        repository.save(f4);
        repository.save(f5);
        Film[] expected = new Film[]{f3};
        Film[] actual = repository.findById(3);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shoildfindByIdIfIdNoExist() {

        repository.save(f1);
        repository.save(f2);
        repository.save(f4);
        repository.save(f5);
        Film[] expected = new Film[]{null};
        Film[] actual = repository.findById(3);
        assertArrayEquals(expected, actual);
    }

    //Проверка удаления объекта по идентификатору
    @Test
    public void shouldRemoveByIdIfManyFilmsExist() {
        repository.save(f1);
        repository.save(f2);
        repository.save(f3);
        repository.save(f4);
        repository.save(f5);
        repository.save(f6);
        repository.save(f7);
        repository.removeById(4);
        Film[] expected = new Film[]{f1, f2, f3, f5, f6, f7};
        Film[] actual = repository.findAll();
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldRemoveByIdIfOneFilmExist() {

        repository.save(f1);
        repository.removeById(1);
        Film[] expected = new Film[0];
        Film[] actual = repository.findAll();
        assertArrayEquals(expected, actual);
    }

    //Проверка полного очищения репозитория
    @Test
    public void shouldRemoveAll() {
        repository.save(f1);
        repository.save(f2);
        repository.save(f3);
        repository.save(f4);
        repository.save(f5);
        repository.save(f6);
        repository.save(f7);
        repository.save(f8);
        repository.save(f9);
        repository.removeAll();
        Film[] expected = new Film[0];
        Film[] actual = repository.findAll();
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldRemoveAllIfNoOneExist() {
        repository.removeAll();
        Film[] expected = new Film[0];
        Film[] actual = repository.findAll();
        assertArrayEquals(expected, actual);
    }

    //НЕТ В ДЗ!!! Проверка возвращения всех элементов массива в прямом порядке
    @Test
    public void shouldFindAllInReverseIfManyFilmsExist() {
        repository.save(f1);
        repository.save(f2);
        repository.save(f3);
        repository.save(f4);
        repository.save(f5);
        repository.save(f6);
        repository.save(f7);
        repository.save(f8);
        repository.save(f9);
        Film[] expected = new Film[]{f9, f8, f7, f6, f5, f4, f3, f2, f1};
        Film[] actual = repository.findAllInReverse();
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindAllInReverseIfOneExist() {

        repository.save(f1);
        Film[] expected = new Film[]{f1};
        Film[] actual = repository.findAllInReverse();
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindAllInReverseIfNoOneExist() {
        Film[] expected = new Film[0];
        Film[] actual = repository.findAllInReverse();
        assertArrayEquals(expected, actual);
    }

}

package ru.netology.manager;

import ru.netology.Film;
import ru.netology.repository.FilmRepository;

public class Manager {
    private FilmRepository repository;

    public Manager(FilmRepository repository) {
        this.repository = repository;
    }

    public void findAll() {
        repository.findAll();
    }

    public void save(Film film) {
        repository.save(film);
    }

    public void findById(int id) {
        repository.findById(id);
    }

    public void removeById(int id) {
        repository.removeById(id);
    }

    public void removeAll() {
        repository.removeAll();
    }

    private int numberOfDisplayedFilms = 10;

    public Manager(int numberOfDisplayedFilms) {
        this.numberOfDisplayedFilms = numberOfDisplayedFilms;
    }

    public Manager() {
    }

    // Возвращает фиксированное количество хранящихся в массиве объектов (в обратном порядке)

    public Film[] findLessOrEqualFixedAmount() {
       Film [] films = repository.findAll();
        int resultLength;
        if (films.length < numberOfDisplayedFilms) {
            resultLength = films.length;
        } else {
            resultLength = numberOfDisplayedFilms;
        }
        Film[] result = new Film[resultLength];
        for (int i = films.length-resultLength; i < films.length; i++) {
            int index = films.length - i + (films.length-resultLength-1);
            result[i-(films.length-resultLength)] = films[index];
        }
        return result;
    }
}
//System.arraycopy (items,0,tmp, 0, items.length)
//(из какого массива, с какого места, куда копировать,с какого места всавлять, количество элементов которые хотим скопировать)


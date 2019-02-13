package hw4;


public interface Sorter<T extends Comparable<T>> {
void sort(T[] list);
}
package mergeSort;


public interface Sorter<T extends Comparable<T>> {
void sort(T[] list);
}
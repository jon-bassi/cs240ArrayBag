/**
 * Created by jon on 4/4/2016.
 */
public interface IntArrayBagInterface {

    void add(int a);

    void addAll(IntArrayBagInterface arrayBag);

    void addMany(int ... elements);

    IntArrayBagInterface clone();

    int countOccurrences(int target);

    void ensureCapacity(int minimumCapacity);

    int getCapacity();

    boolean remove(int target);


}

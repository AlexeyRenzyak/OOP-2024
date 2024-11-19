public interface Collection {
    public boolean isEmpty();
    public int size();
    public boolean add(Object o);
    public boolean remove(Object o);
    public boolean has(Object o);
    public void clear();
    Object[] toArray();
}

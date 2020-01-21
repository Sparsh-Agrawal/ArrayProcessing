package dslab1.task2.implementation;

import dslab1.task2.adt.MyArrayADT;

public class MyArrayImplementation
{
    public static void main(String[] args)
    {
        int size=10;
        MyArrayADT l=new MyArrayADT(size);
        l.insert(33);
        l.traverse();
        l.insert(2);
        l.traverse();
        l.delete();
        l.traverse();
        System.out.println(l.search(3));
        l.insert(16);
        l.insert(98);
        l.insert(1);
        l.insert(23);
        l.traverse();
        l.arraySort();
        l.traverse();
    }
}

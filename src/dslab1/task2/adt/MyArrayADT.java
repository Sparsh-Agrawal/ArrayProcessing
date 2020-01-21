package dslab1.task2.adt;

import dslab1.task2.interfaces.MyArrayInterface;

public class MyArrayADT implements MyArrayInterface
{
    private int[] data;
    private int size;
    private int elementCount;

    public MyArrayADT(int size)
    {
        this.size=size;
        data=new int[size];
        elementCount=0;
    }

    @Override
    public boolean insert(int element)
    {
        boolean response=false;
        if(!isFull())
        {
            data[elementCount] = element;
            elementCount++;
            response=true;
        }
        return response;
    }

    @Override
    public int delete()
    {
        int response=0;
        if(!isEmpty())
        {
            elementCount--;
            response=data[elementCount];
        }
        return response;
    }

    @Override
    public void traverse()
    {
        for(int i=0;i<elementCount;i++)
        {
            System.out.print(data[i]);
            if(i!=elementCount-1)
                System.out.print(",");
        }
        System.out.println();
    }

    @Override
    public boolean search(int element)
    {
        boolean response=false;
        for(int i=0;i<elementCount;i++)
        {
            if(data[i]==element)
                response=true;
        }
        return response;
    }

    @Override
    public void arraySort()
    {
        int[] response=data;
        for(int i=0;i<elementCount-1;i++)
        {
            for (int j = 0; j < elementCount - 1 - i; j++)
            {
                if (data[j] > data[j + 1])
                {
                    int t = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = t;
                }
            }
        }
    }

    private boolean isFull()
    {
        boolean response=false;
        if(elementCount==size)
        {
            response=true;
        }
        return response;
    }

    private boolean isEmpty()
    {
        boolean response=false;
        if(elementCount==0)
        {
            response=true;
        }
        return response;
    }
}

package dk.dbd.assignment3.generated.valuedomains.impl;

import dk.dbd.assignment3.generated.valuedomains.Array;
import dk.dbd.assignment3.generated.valuedomains.Array.ArrayBuilder;
import dk.dbd.assignment3.generated.valuedomains.JsonObjectList;
import java.util.ArrayList;
import org.abstractica.edma.valuedomains.IValueInstance;

/**
 * 
 */
public class ArrayBuilderImpl implements ArrayBuilder
{
    private ArrayList<Object> valueList;



    /**
     * Constructor
     */
    public ArrayBuilderImpl()
    {
        valueList = new ArrayList<Object>();
    }

    /**
     * Adds an element to the list
     * @param jsonObjectList  The element to be added to the list
     * @return                An interface to the builder for chaining method
     *                        calls
     */
    public ArrayBuilder add(JsonObjectList jsonObjectList)
    {
        if(jsonObjectList == null) throw new NullPointerException();
        valueList.add(((IValueInstance) jsonObjectList).edma_getValue());
        return this;
    }

    /**
     * Builds the list with the added elements
     * @return  The builded list
     */
    public Array end()
    {
        Object[] res = new Object[valueList.size()];
        int pos = 0;
        for(Object o : valueList)
        {
            res[pos++] = o;
        }
        return new ArrayImpl(ArrayImpl.edma_create(res));
    }
}

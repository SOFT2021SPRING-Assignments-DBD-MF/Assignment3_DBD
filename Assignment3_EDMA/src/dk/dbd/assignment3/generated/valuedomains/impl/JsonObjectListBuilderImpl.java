package dk.dbd.assignment3.generated.valuedomains.impl;

import dk.dbd.assignment3.generated.valuedomains.JsonObjectList;
import dk.dbd.assignment3.generated.valuedomains.JsonObjectList.JsonObjectListBuilder;
import dk.dbd.assignment3.generated.valuedomains.Member;
import java.util.ArrayList;
import org.abstractica.edma.valuedomains.IValueInstance;

/**
 * 
 */
public class JsonObjectListBuilderImpl implements JsonObjectListBuilder
{
    private ArrayList<Object> valueList;



    /**
     * Constructor
     */
    public JsonObjectListBuilderImpl()
    {
        valueList = new ArrayList<Object>();
    }

    /**
     * Adds an element to the list
     * @param member  The element to be added to the list
     * @return        An interface to the builder for chaining method calls
     */
    public JsonObjectListBuilder add(Member member)
    {
        if(member == null) throw new NullPointerException();
        valueList.add(((IValueInstance) member).edma_getValue());
        return this;
    }

    /**
     * Builds the list with the added elements
     * @return  The builded list
     */
    public JsonObjectList end()
    {
        Object[] res = new Object[valueList.size()];
        int pos = 0;
        for(Object o : valueList)
        {
            res[pos++] = o;
        }
        return new JsonObjectListImpl(JsonObjectListImpl.edma_create(res));
    }
}

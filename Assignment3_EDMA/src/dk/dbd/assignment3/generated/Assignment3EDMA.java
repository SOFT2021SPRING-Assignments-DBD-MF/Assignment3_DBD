package dk.dbd.assignment3.generated;

import java.util.ArrayList;
import java.util.Collection;
import org.abstractica.edma.metamodel.IMetaEnvironment;
import org.abstractica.edma.metamodel.impl.MetaEnvironment;
import org.abstractica.edma.metamodel.impl.ValueDomainBuilder;
import org.abstractica.edma.metamodel.impl.ValueDomainBuilder.Field;
import org.abstractica.edma.runtime.implementations.mem.modelstore.speed.newindex.IndexUtil;
import org.abstractica.edma.runtime.intf.IRuntimeFactory;
import org.abstractica.edma.valuedomains.impl.Constraint;

/**
 * 
 */
public class Assignment3EDMA
{
    public static final IMetaEnvironment environment = generateEnvironment();



    /**
     * generate the environment
     * @return  
     */
    public static IMetaEnvironment generateEnvironment()
    {
        ValueDomainBuilder vdb = new ValueDomainBuilder();
        
        //String value domain: Name
        {
            ArrayList<Constraint> edma_constraints = null;
            vdb.newStringDomain("Name", null, 1, null, null, edma_constraints, false);
        }
        
        //String value domain: JsonString
        {
            ArrayList<Constraint> edma_constraints = null;
            vdb.newStringDomain("JsonString", null, 0, null, null, edma_constraints, false);
        }
        
        //Double value domain: JsonNumber
        {
            ArrayList<Constraint> edma_constraints = null;
            vdb.newDoubleDomain("JsonNumber", null, null, null, edma_constraints, false);
        }
        
        //Boolean value domain: JsonBoolean
        {
            ArrayList<Constraint> edma_constraints = null;
            vdb.newBooleanDomain("JsonBoolean", null, edma_constraints, false);
        }
        
        //Integer value domain: JsonNull
        {
            ArrayList<Constraint> edma_constraints = null;
            vdb.newIntegerDomain("JsonNull", null, 0, 0, edma_constraints, false);
        }
        
        //OneOf value domain: JsonObject
        {
            ArrayList<Constraint> edma_constraints = null;
            Collection<String> optionDomains = new ArrayList<String>(6);
            optionDomains.add("JsonObjectList");
            optionDomains.add("Array");
            optionDomains.add("JsonString");
            optionDomains.add("JsonNumber");
            optionDomains.add("JsonBoolean");
            optionDomains.add("JsonNull");
            vdb.newOneOfDomain("JsonObject", null, optionDomains, edma_constraints, false);
        }
        
        //List value domain: JsonObjectList
        {
            ArrayList<Constraint> edma_constraints = null;
            vdb.newListDomain("JsonObjectList", null, "Member", null, null, edma_constraints, false);
        }
        
        //Struct value domain: Member
        {
            ArrayList<Constraint> edma_constraints = null;
            Collection<Field> fields = new ArrayList<Field>();
            fields.add(vdb.newStructField("name", "Name", false));
            fields.add(vdb.newStructField("value", "JsonObject", false));
            vdb.newStructDomain("Member", null, fields, edma_constraints, false);
        }
        
        //List value domain: Array
        {
            ArrayList<Constraint> edma_constraints = null;
            vdb.newListDomain("Array", null, "JsonObjectList", null, null, edma_constraints, false);
        }
        MetaEnvironment edma_environment = new MetaEnvironment("Assignment3EDMA");
        vdb.buildWithEnvironment(edma_environment);
        //Hack to make serializeable work...
        IndexUtil.setValueDomainDefinitions(edma_environment.getValueDomainDefinitions());
        return edma_environment;
    }

    /**
     * Constructor
     * @param factory  The runtime factory
     */
    public Assignment3EDMA(IRuntimeFactory factory)
    {
        
    }
}

package dk.dbd.assignment3.play;

import dk.dbd.assignment3.generated.valuedomains.*;

public class Play {
    public static void main(String[] args) {
        Member jsonString1 = Member.create().name("String1").value(JsonObject.create(JsonString.create("1")));
        Member jsonString2 = Member.create().name("String2").value(JsonObject.create(JsonString.create("2")));
        Member jsonString3 = Member.create().name("String3").value(JsonObject.create(JsonString.create("3")));
        Member jsonNumber1 = Member.create().name("Number1").value(JsonObject.create(JsonNumber.create(1.0)));
        Member jsonNumber2 = Member.create().name("Number2").value(JsonObject.create(JsonNumber.create(2.0)));
        Member jsonNumber3 = Member.create().name("Number3").value(JsonObject.create(JsonNumber.create(3.0)));
        Member jsonBooleanTrue = Member.create().name("BooleanTrue").value(JsonObject.create(JsonBoolean.create(true)));
        Member jsonBooleanFalse = Member.create().name("BooleanFalse").value(JsonObject.create(JsonBoolean.create(false)));
        Member jsonNull = Member.create().name("Null").value(JsonObject.create(JsonNull.create(0)));

        JsonObjectList singleJsonObject = JsonObjectList.begin()
                .add(jsonString1)
                .add(jsonNumber1)
                .end();

        Member jsonMore = Member.create()
                .name("MultiJson")
                .value(JsonObject.create(Array.begin()
                .add(singleJsonObject)
                .add(singleJsonObject)
                .end()));

        JsonObjectList json = JsonObjectList.begin()
                .add(jsonString1)
                .add(jsonNumber1)
                .add(jsonBooleanTrue)
                .add(jsonMore)
                .end();

        System.out.println(json.toString());

    }
}

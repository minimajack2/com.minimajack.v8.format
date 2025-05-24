package com.minimajack.v8.metadata.inner.enums;

import com.minimajack.v8.metadata.inner.classes.V8ClassUUID;
import com.minimajack.v8.metadata.inner.classes.V8InnerClass;

@V8ClassUUID(uuid = "502b7765-f89c-4fd0-924f-0a28d3dc09b7")
public final class TypeReductionMode extends V8InnerClass {

    public Values value;

    public enum Values {
        TransformValues,
        DeleteData,
        Deny
    }
}

package apple.audiotoolbox;


import java.io.*;
import java.nio.*;
import java.util.*;
import com.google.j2objc.annotations.*;
import com.google.j2objc.runtime.*;
import com.google.j2objc.runtime.block.*;
import apple.audiotoolbox.*;
import apple.corefoundation.*;
import apple.coregraphics.*;
import apple.coreservices.*;
import apple.foundation.*;
import apple.opengles.*;
import apple.coreaudio.*;
import apple.coremedia.*;





@Mapping("ParameterEvent")
public class ParameterEvent 
    extends Struct 
     {

    
    protected ParameterEvent() {}
    
    
    @DotMapping("parameterID")
    public native int getParameterID();
    @DotMapping("scope")
    public native int getScope();
    @DotMapping("element")
    public native int getElement();
    @DotMapping("value")
    public native float getValue();
    
    public static native ParameterEvent create(int parameterID, int scope, int element, float value) /*-[
        ParameterEvent __new = { .parameterID = parameterID, .scope = scope, .element = element, .value = value };
        return __new;
    ]-*/;
    public static native ParameterEvent copyWithparameterID(ParameterEvent original, int parameterID) /*-[
        original.parameterID = parameterID;
        return __new;
    ]-*/;

    
    public static native ParameterEvent copyWithscope(ParameterEvent original, int scope) /*-[
        original.scope = scope;
        return __new;
    ]-*/;

    
    public static native ParameterEvent copyWithelement(ParameterEvent original, int element) /*-[
        original.element = element;
        return __new;
    ]-*/;

    
    public static native ParameterEvent copyWithvalue(ParameterEvent original, float value) /*-[
        original.value = value;
        return __new;
    ]-*/;

    
}

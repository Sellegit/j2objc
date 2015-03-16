package apple.coretext;


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





@Mapping("CTParagraphStyleSetting") @Library("CoreText/CoreText.h")
public class CTParagraphStyleSetting 
    extends Struct 
     {

    
    protected CTParagraphStyleSetting() {}
    
    
    @DotMapping("spec")
    public native CTParagraphStyleSpecifier getSpec();
    @DotMapping("valueSize")
    public native @MachineSizedUInt long getValueSize();
    @DotMapping("value")
    public native Todo getValue();
    
    public static native CTParagraphStyleSetting create(CTParagraphStyleSpecifier spec, @MachineSizedUInt long valueSize, Todo value) /*-[
        CTParagraphStyleSetting __new = { .spec = spec, .valueSize = valueSize, .value = value };
        return __new;
    ]-*/;
    public static native CTParagraphStyleSetting copyWithspec(CTParagraphStyleSetting original, CTParagraphStyleSpecifier spec) /*-[
        original.spec = spec;
        return original;
    ]-*/;

    
    public static native CTParagraphStyleSetting copyWithvalueSize(CTParagraphStyleSetting original, @MachineSizedUInt long valueSize) /*-[
        original.valueSize = valueSize;
        return original;
    ]-*/;

    
    public static native CTParagraphStyleSetting copyWithvalue(CTParagraphStyleSetting original, Todo value) /*-[
        original.value = value;
        return original;
    ]-*/;

    
}

package apple.foundation;


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
import apple.uikit.*;
import apple.coreanimation.*;
import apple.coredata.*;
import apple.coremedia.*;
import apple.security.*;
import apple.dispatch.*;





@Library("Foundation/Foundation.h") @Mapping("NSValue")
public class NSValue 
    extends NSObject 
    implements NSCopying {

    
    
    @Mapping("initWithCoder:")
    public NSValue(NSCoder aDecoder) { }
    @Mapping("init")
    public NSValue() { }
    
    
    @Mapping("objCType")
    public native Todo objCType();
    @Mapping("nonretainedObjectValue")
    public native Object objectValue();
    @Mapping("rangeValue")
    public native NSRange rangeValue();
    
    
    
    @Mapping("getValue:")
    public native void getValue(Todo value);
    @Mapping("valueWithBytes:objCType:")
    public static native NSValue valueOf(Todo value, Todo type);
    @Mapping("pointerValue")
    public native Todo pointerValue();
    @Mapping("isEqualToValue:")
    public native boolean isEqualTo(NSValue value);
    @Mapping("valueWithNonretainedObject:")
    public static native NSValue valueOf(Object anObject);
    @Mapping("valueWithRange:")
    public static native NSValue valueOf(NSRange range);
    @Mapping("copyWithZone:")
    public native Object copyWithZone$(NSZone zone);
    
}

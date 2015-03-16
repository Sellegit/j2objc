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



/**
 * @since Available in iOS 3.0 and later.
 */

@Library("Foundation/Foundation.h") @Mapping("NSValueTransformer")
public class NSValueTransformer 
    extends NSObject 
     {

    
    
    public NSValueTransformer() {}
    
    
    
    
    
    
    @Mapping("transformedValue:")
    public native Object getTransformedValue(Object value);
    @Mapping("reverseTransformedValue:")
    public native Object reverseTransformedValue(Object value);
    @Mapping("setValueTransformer:forName:")
    public static native void setValueTransformer(NSValueTransformer transformer, String name);
    @Mapping("valueTransformerForName:")
    public static native NSValueTransformer getValueTransformer(String name);
    @Mapping("valueTransformerNames")
    public static native NSArray<NSValueTransformer> getValueTransformers();
    @Mapping("allowsReverseTransformation")
    public static native boolean allowsReverseTransformation();
    
}

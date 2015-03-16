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
 * @since Available in iOS 5.0 and later.
 */

@Library("Foundation/Foundation.h") @Mapping("NSJSONSerialization")
public class NSJSONSerialization 
    extends NSObject 
     {

    
    
    public NSJSONSerialization() {}
    
    
    
    
    
    
    @Mapping("isValidJSONObject:")
    public static native boolean isValidJSONObject(Object obj);
    @Mapping("dataWithJSONObject:options:error:")
    protected static native NSData createJSONData(Object obj, @Representing("NSJSONWritingOptions") @MachineSizedUInt long opt, Todo error);
    @Mapping("JSONObjectWithData:options:error:")
    protected static native Object createJSONObject(NSData data, @Representing("NSJSONReadingOptions") @MachineSizedUInt long opt, Todo error);
    @Mapping("writeJSONObject:toStream:options:error:")
    protected static native @MachineSizedSInt long writeJSONObject(Object obj, NSOutputStream stream, @Representing("NSJSONWritingOptions") @MachineSizedUInt long opt, Todo error);
    @Mapping("JSONObjectWithStream:options:error:")
    protected static native Object readJSONObject(NSInputStream stream, @Representing("NSJSONReadingOptions") @MachineSizedUInt long opt, Todo error);
    
}

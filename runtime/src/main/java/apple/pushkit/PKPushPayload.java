package apple.pushkit;


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
import apple.dispatch.*;



/**
 * @since Available in iOS 8.0 and later.
 */

@Library("PushKit") @Mapping("PKPushPayload")
public class PKPushPayload 
    extends NSObject 
     {

    
    
    public PKPushPayload() {}
    
    
    @Mapping("type")
    public native String getType();
    @Mapping("dictionaryPayload")
    public native NSDictionary<?, ?> getDictionaryPayload();
    
    
    
    
    
}

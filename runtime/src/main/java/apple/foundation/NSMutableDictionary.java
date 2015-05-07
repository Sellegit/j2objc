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


@Library("Foundation/Foundation.h") @Mapping("NSMutableDictionary")
public class NSMutableDictionary <K, V>
    extends NSDictionary<K, V> 
     {

    
    
    @Mapping("init")
    public NSMutableDictionary() { }
    @Mapping("initWithCapacity:")
    public NSMutableDictionary(@MachineSizedUInt long numItems) { }

    


    
    
    @Mapping("removeObjectForKey:")
    public native void removeObject(Object aKey);
    @Mapping("setObject:forKey:")
    public native void setObject(Object anObject, Object aKey);
    @Mapping("removeAllObjects")
    public native void removeAllObjects();

}

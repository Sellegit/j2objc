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

@Library("Foundation/Foundation.h") @Mapping("NSMutableOrderedSet")
public class NSMutableOrderedSet 
    extends NSOrderedSet 
     {

    
    
    public NSMutableOrderedSet() {}
    @Mapping("initWithCapacity:")
    public NSMutableOrderedSet(@MachineSizedUInt long numItems) { }
    
    
    
    
    
    
    @Mapping("insertObject:atIndex:")
    public native void insertObject(Object object, @MachineSizedUInt long idx);
    @Mapping("removeObjectAtIndex:")
    public native void removeObject(@MachineSizedUInt long idx);
    @Mapping("replaceObjectAtIndex:withObject:")
    public native void replaceObject(@MachineSizedUInt long idx, Object object);
    @Mapping("removeAllObjects")
    public native void removeAllObjects();
    @Mapping("removeObject:")
    public native void removeObject(Object object);
    
}

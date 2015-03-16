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
    protected native void insertObject(Object object, @MachineSizedUInt long idx);
    @Mapping("removeObjectAtIndex:")
    protected native void removeObject(@MachineSizedUInt long idx);
    @Mapping("replaceObjectAtIndex:withObject:")
    protected native void replaceObject(@MachineSizedUInt long idx, Object object);
    @Mapping("removeAllObjects")
    protected native void removeAllObjects();
    @Mapping("removeObject:")
    protected native void removeObject(Object object);
    
}

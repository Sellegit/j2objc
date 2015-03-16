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





@Library("Foundation/Foundation.h") @Mapping("NSMutableArray")
public class NSMutableArray <T>
    extends NSArray 
     {

    
    
    public NSMutableArray() {}
    @Mapping("initWithCapacity:")
    public NSMutableArray(@MachineSizedUInt long numItems) { }
    
    
    
    
    
    
    @Mapping("insertObject:atIndex:")
    protected native void insertObject(Object anObject, @MachineSizedUInt long index);
    @Mapping("removeObjectAtIndex:")
    protected native void removeObject(@MachineSizedUInt long index);
    @Mapping("replaceObjectAtIndex:withObject:")
    protected native void replaceObject(@MachineSizedUInt long index, Object anObject);
    @Mapping("removeAllObjects")
    protected native void removeAllObjects();
    
}

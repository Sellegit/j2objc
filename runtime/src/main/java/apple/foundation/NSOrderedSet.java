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

@Library("Foundation") @Mapping("NSOrderedSet")
public class NSOrderedSet <T>
    extends NSObject 
    implements NSFastEnumeration {

    
    
    public NSOrderedSet() {}
    @Mapping("initWithObjects:count:")
    public NSOrderedSet(Todo objects, @MachineSizedUInt long cnt) { }
    @Mapping("initWithOrderedSet:")
    public NSOrderedSet(NSOrderedSet<?> set) { }
    @Mapping("initWithArray:")
    public NSOrderedSet(NSArray<?> array) { }
    
    
    @Mapping("count")
    protected native @MachineSizedUInt long getCount();
    @Mapping("firstObject")
    public native T getFirst();
    @Mapping("lastObject")
    public native T getLast();
    @Mapping("reversedOrderedSet")
    public native NSOrderedSet<T> getReversedOrderedSet();
    @Mapping("array")
    public native NSArray<T> getArray();
    @Mapping("set")
    public native NSSet<T> getSet();
    
    
    
    @Mapping("objectAtIndex:")
    protected native T getObjectAt(@MachineSizedUInt long idx);
    @Mapping("indexOfObject:")
    protected native @MachineSizedUInt long indexOfObject(Object object);
    @Mapping("objectsAtIndexes:")
    protected native NSArray<T> getObjectsAt(NSIndexSet indexes);
    @Mapping("containsObject:")
    protected native boolean containsObject(Object object);
    @Mapping("objectEnumerator")
    protected native NSEnumerator<T> objectEnumerator();
    
}

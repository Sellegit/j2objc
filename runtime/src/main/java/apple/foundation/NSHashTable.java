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
 * @since Available in iOS 6.0 and later.
 */

@Library("Foundation") @Mapping("NSHashTable")
public class NSHashTable <T>
    extends NSObject 
    implements NSCopying, NSCoding, NSFastEnumeration {

    
    
    public NSHashTable() {}
    @Mapping("initWithOptions:capacity:")
    public NSHashTable(NSHashTableOptions options, @MachineSizedUInt long initialCapacity) { }
    
    
    @Mapping("count")
    protected native @MachineSizedUInt long getCount();
    @Mapping("allObjects")
    public native NSArray<T> getValues();
    @Mapping("anyObject")
    public native T any();
    @Mapping("setRepresentation")
    public native NSSet<T> asSet();
    
    
    
    @Mapping("member:")
    protected native Object isMember(Object object);
    @Mapping("objectEnumerator")
    private native NSEnumerator<T> getObjectEnumerator();
    @Mapping("addObject:")
    private native void addObject(Object object);
    @Mapping("removeObject:")
    private native void removeObject(Object object);
    @Mapping("removeAllObjects")
    private native void removeAllObjects();
    @Mapping("containsObject:")
    private native boolean containsObject(Object anObject);
    @Mapping("intersectsHashTable:")
    public native boolean intersects(NSHashTable<T> other);
    @Mapping("isEqualToHashTable:")
    public native boolean isEqualTo(NSHashTable<T> other);
    @Mapping("isSubsetOfHashTable:")
    public native boolean isSubsetOf(NSHashTable<T> other);
    @Mapping("intersectHashTable:")
    public native void intersect(NSHashTable<T> other);
    @Mapping("unionHashTable:")
    public native void union(NSHashTable<T> other);
    @Mapping("minusHashTable:")
    public native void minus(NSHashTable<T> other);
    @Mapping("copyWithZone:")
    public native Object copyWithZone$(NSZone zone);
    @Mapping("encodeWithCoder:")
    public native void encode(NSCoder aCoder);
    
}

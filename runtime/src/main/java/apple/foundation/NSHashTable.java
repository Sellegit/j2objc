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
@Library("Foundation/Foundation.h") @Mapping("NSHashTable")
public class NSHashTable <T>
    extends NSObject 
    implements NSCopying, NSCoding, NSFastEnumeration {

    
    
    @Mapping("init")
    public NSHashTable() { }

    
    @Mapping("count")
    public native @MachineSizedUInt long getCount();
    @Mapping("allObjects")
    public native NSArray<T> getValues();
    @Mapping("anyObject")
    public native T any();
    @Mapping("setRepresentation")
    public native NSSet<T> asSet();

    
    
    @Mapping("member:")
    public native Object isMember(Object object);
    @Mapping("objectEnumerator")
    public native NSEnumerator<T> getObjectEnumerator();
    @Mapping("addObject:")
    public native void addObject(Object object);
    @Mapping("removeObject:")
    public native void removeObject(Object object);
    @Mapping("removeAllObjects")
    public native void removeAllObjects();
    @Mapping("containsObject:")
    public native boolean containsObject(Object anObject);
    @Mapping("intersectsHashTable:")
    public native boolean intersects(NSHashTable other);
    @Mapping("isEqualToHashTable:")
    public native boolean isEqualTo(NSHashTable other);
    @Mapping("isSubsetOfHashTable:")
    public native boolean isSubsetOf(NSHashTable other);
    @Mapping("intersectHashTable:")
    public native void intersect(NSHashTable other);
    @Mapping("unionHashTable:")
    public native void union(NSHashTable other);
    @Mapping("minusHashTable:")
    public native void minus(NSHashTable other);
    @Mapping("copyWithZone:")
    public native Object copyWithZone$(NSZone zone);
    @Mapping("encodeWithCoder:")
    public native void encode(NSCoder aCoder);

}

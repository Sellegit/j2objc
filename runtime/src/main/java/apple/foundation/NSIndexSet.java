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





@Library("Foundation/Foundation.h") @Mapping("NSIndexSet")
public class NSIndexSet 
    extends NSObject 
    implements NSCopying {

    
    
    @Mapping("initWithIndexesInRange:")
    public NSIndexSet(NSRange range) { }
    @Mapping("initWithIndexSet:")
    public NSIndexSet(NSIndexSet indexSet) { }
    @Mapping("initWithIndex:")
    public NSIndexSet(@MachineSizedUInt long value) { }
    @Mapping("init")
    public NSIndexSet() { }
    
    
    @Mapping("count")
    public native @MachineSizedUInt long size();
    @Mapping("firstIndex")
    public native @MachineSizedUInt long first();
    @Mapping("lastIndex")
    public native @MachineSizedUInt long last();
    
    
    
    @Mapping("isEqualToIndexSet:")
    public native boolean equals(NSIndexSet indexSet);
    @Mapping("indexGreaterThanIndex:")
    public native @MachineSizedUInt long greaterThan(@MachineSizedUInt long value);
    @Mapping("indexLessThanIndex:")
    public native @MachineSizedUInt long lessThan(@MachineSizedUInt long value);
    @Mapping("indexGreaterThanOrEqualToIndex:")
    public native @MachineSizedUInt long greaterThanOrEqual(@MachineSizedUInt long value);
    @Mapping("indexLessThanOrEqualToIndex:")
    public native @MachineSizedUInt long lessThanOrEqual(@MachineSizedUInt long value);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @Mapping("countOfIndexesInRange:")
    public native @MachineSizedUInt long getIndexCountInRange(NSRange range);
    @Mapping("containsIndex:")
    public native boolean containsIndex(@MachineSizedUInt long value);
    @Mapping("containsIndexesInRange:")
    public native boolean containsIndexesInRange(NSRange range);
    @Mapping("containsIndexes:")
    public native boolean containsIndexes(NSIndexSet indexSet);
    @Mapping("intersectsIndexesInRange:")
    public native boolean intersectsIndexesInRange(NSRange range);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Mapping("enumerateIndexesUsingBlock:")
    public native void enumerateIndexes(@Block("(@MachineSizedUInt,)") VoidBlock2<Long, Todo> block);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Mapping("enumerateIndexesWithOptions:usingBlock:")
    public native void enumerateIndexes(@Representing("NSEnumerationOptions") @MachineSizedUInt long opts, @Block("(@MachineSizedUInt,)") VoidBlock2<Long, Todo> block);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Mapping("enumerateIndexesInRange:options:usingBlock:")
    public native void enumerateIndexesInRange(NSRange range, @Representing("NSEnumerationOptions") @MachineSizedUInt long opts, @Block("(@MachineSizedUInt,)") VoidBlock2<Long, Todo> block);
    @Mapping("indexSet")
    public static native NSIndexSet create();
    @Mapping("indexSetWithIndex:")
    public static native NSIndexSet create(@MachineSizedUInt long value);
    @Mapping("indexSetWithIndexesInRange:")
    public static native NSIndexSet create(NSRange range);
    @Mapping("copyWithZone:")
    public native Object copyWithZone$(NSZone zone);
    
}

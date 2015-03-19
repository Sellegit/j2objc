package apple.photos;


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
import apple.corelocation.*;
import apple.uikit.*;
import apple.avfoundation.*;



/**
 * @since Available in iOS 8.0 and later.
 */

@Library("Photos/Photos.h") @Mapping("PHFetchResult")
public class PHFetchResult 
    extends NSObject 
    implements NSCopying, NSFastEnumeration {

    
    
    @Mapping("init")
    public PHFetchResult() { }
    
    
    @Mapping("count")
    public native @MachineSizedUInt long size();
    @Mapping("firstObject")
    public native PHObject first();
    @Mapping("lastObject")
    public native PHObject last();
    
    
    
    @Mapping("objectAtIndex:")
    public native PHObject get(@MachineSizedUInt long index);
    @Mapping("containsObject:")
    public native boolean contains(Object anObject);
    @Mapping("indexOfObject:")
    public native @MachineSizedUInt long indexOf(Object anObject);
    @Mapping("indexOfObject:inRange:")
    public native @MachineSizedUInt long indexOf(Object anObject, NSRange range);
    @Mapping("objectsAtIndexes:")
    public native NSArray<PHObject> getAll(NSIndexSet indexes);
    @Mapping("enumerateObjectsUsingBlock:")
    public native void enumerateObjects(@Block("(,@MachineSizedUInt,)") VoidBlock3<NSObject, Long, Todo> block);
    @Mapping("enumerateObjectsWithOptions:usingBlock:")
    public native void enumerateObjects(@Representing("NSEnumerationOptions") long opts, @Block("(,@MachineSizedUInt,)") VoidBlock3<NSObject, Long, Todo> block);
    @Mapping("enumerateObjectsAtIndexes:options:usingBlock:")
    public native void enumerateObjects(NSIndexSet s, @Representing("NSEnumerationOptions") long opts, @Block("(,@MachineSizedUInt,)") VoidBlock3<NSObject, Long, Todo> block);
    @Mapping("countOfAssetsWithMediaType:")
    public native @MachineSizedUInt long getCountOfAssetsWithMediaType(@Representing("PHAssetMediaType") long mediaType);
    @Mapping("copyWithZone:")
    public native Object copyWithZone$(NSZone zone);
    
}

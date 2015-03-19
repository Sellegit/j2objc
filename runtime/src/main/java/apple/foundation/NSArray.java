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





@Library("Foundation/Foundation.h") @Mapping("NSArray")
public class NSArray <T>
    extends NSObject 
    implements NSFastEnumeration, NSPropertyList {

    
    
    public NSArray() {}
    @Mapping("initWithObjects:count:")
    public NSArray(Todo objects, @MachineSizedUInt long cnt) { }
    @Mapping("initWithArray:")
    public NSArray(NSArray<?> array) { }
    
    
    @Mapping("count")
    public native @MachineSizedUInt long getCount();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Mapping("firstObject")
    public native T first();
    @Mapping("lastObject")
    public native T last();
    @Mapping("sortedArrayHint")
    public native NSData getSortedArrayHint();
    
    
    
    @Mapping("objectAtIndex:")
    public native T getObjectAt(@MachineSizedUInt long index);
    @Mapping("containsObject:")
    public native boolean containsObject(Object anObject);
    @Mapping("indexOfObject:")
    public native @MachineSizedUInt long indexOfObject(Object anObject);
    @Mapping("subarrayWithRange:")
    public native NSArray<T> getSubarray(NSRange range);
    @Mapping("writeToFile:atomically:")
    public native boolean writeFile(String path, boolean useAuxiliaryFile);
    @Mapping("writeToURL:atomically:")
    public native boolean write(NSURL url, boolean atomically);
    @Mapping("arrayWithContentsOfFile:")
    public static native NSArray<?> readFile(String path);
    @Mapping("arrayWithContentsOfURL:")
    public static native NSArray<?> read(NSURL url);
    @Mapping("addObserver:toObjectsAtIndexes:forKeyPath:options:context:")
    public native void addObserver(NSObject observer, NSIndexSet indexes, String keyPath, @Representing("NSKeyValueObservingOptions") long options, Todo context);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("removeObserver:fromObjectsAtIndexes:forKeyPath:context:")
    public native void removeObserver(NSObject observer, NSIndexSet indexes, String keyPath, Todo context);
    
}

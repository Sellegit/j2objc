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


@Library("Foundation/Foundation.h") @Mapping("NSSortDescriptor")
public class NSSortDescriptor 
    extends NSObject 
    implements NSCopying {

    
    
    @Mapping("initWithKey:ascending:")
    public NSSortDescriptor(String key, boolean ascending) { }
    @Mapping("initWithKey:ascending:selector:")
    public NSSortDescriptor(String key, boolean ascending, Selector selector) { }
    @Mapping("init")
    public NSSortDescriptor() { }

    
    @Mapping("key")
    public native String getKey();
    @Mapping("ascending")
    public native boolean isAscending();
    @Mapping("selector")
    public native Selector getSelector();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Mapping("comparator")
    public native @Block Block2<NSObject, NSObject, NSComparisonResult> getComparator();
    @Mapping("reversedSortDescriptor")
    public native NSSortDescriptor getReversedSortDescriptor();

    
    
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("allowEvaluation")
    public native void allowEvaluation();
    @Mapping("compareObject:toObject:")
    public native @Representing("NSComparisonResult") long compare(Object object1, Object object2);
    @Mapping("copyWithZone:")
    public native Object copyWithZone$(NSZone zone);

}

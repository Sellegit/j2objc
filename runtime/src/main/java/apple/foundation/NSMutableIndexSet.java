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





@Library("Foundation/Foundation.h") @Mapping("NSMutableIndexSet")
public class NSMutableIndexSet 
    extends NSIndexSet 
     {

    
    
    @Mapping("initWithIndexesInRange:")
    public NSMutableIndexSet(NSRange range) { }
    @Mapping("initWithIndexSet:")
    public NSMutableIndexSet(NSIndexSet indexSet) { }
    @Mapping("initWithIndex:")
    public NSMutableIndexSet(@MachineSizedUInt long value) { }
    @Mapping("init")
    public NSMutableIndexSet() { }
    
    
    
    
    
    
    @Mapping("addIndexes:")
    public native void addIndexes(NSIndexSet indexSet);
    @Mapping("removeIndexes:")
    public native void removeIndexes(NSIndexSet indexSet);
    @Mapping("removeAllIndexes")
    public native void removeAllIndexes();
    @Mapping("addIndex:")
    public native void addIndex(@MachineSizedUInt long value);
    @Mapping("removeIndex:")
    public native void removeIndex(@MachineSizedUInt long value);
    @Mapping("addIndexesInRange:")
    public native void addIndexes(NSRange range);
    @Mapping("removeIndexesInRange:")
    public native void removeIndexes(NSRange range);
    @Mapping("shiftIndexesStartingAtIndex:by:")
    public native void shiftIndexes(@MachineSizedUInt long index, @MachineSizedSInt long delta);
    
}

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





@Library("Foundation") @Mapping("NSIndexPath")
public class NSIndexPath 
    extends NSObject 
    implements NSCopying {

    
    
    public NSIndexPath() {}
    @Mapping("initWithIndexes:length:")
    public NSIndexPath(Todo indexes, @MachineSizedUInt long length) { }
    @Mapping("initWithIndex:")
    public NSIndexPath(@MachineSizedUInt long index) { }
    
    
    @Mapping("length")
    public native @MachineSizedUInt long getLength();
    
    
    
    @Mapping("indexPathByAddingIndex:")
    public native NSIndexPath addIndex(@MachineSizedUInt long index);
    @Mapping("indexPathByRemovingLastIndex")
    public native NSIndexPath removeLastIndex();
    @Mapping("indexAtPosition:")
    public native @MachineSizedUInt long getIndexAt(@MachineSizedUInt long position);
    @Mapping("getIndexes:")
    private native void getIndexes(Todo indexes);
    @Mapping("compare:")
    public native @Representing("NSComparisonResult") @MachineSizedSInt long compare(NSIndexPath otherObject);
    @Mapping("copyWithZone:")
    public native Object copyWithZone$(NSZone zone);
    
}

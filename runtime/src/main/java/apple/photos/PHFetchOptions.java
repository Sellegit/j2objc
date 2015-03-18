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

@Library("Photos/Photos.h") @Mapping("PHFetchOptions")
public class PHFetchOptions 
    extends NSObject 
    implements NSCopying {

    
    
    @Mapping("init")
    public PHFetchOptions() { }
    
    
    @Mapping("predicate")
    public native NSPredicate getPredicate();
    @Mapping("setPredicate:")
    public native void setPredicate(NSPredicate v);
    @Mapping("sortDescriptors")
    public native NSArray<NSSortDescriptor> getSortDescriptors();
    @Mapping("setSortDescriptors:")
    public native void setSortDescriptors(NSArray<NSSortDescriptor> v);
    @Mapping("includeHiddenAssets")
    public native boolean includesHiddenAssets();
    @Mapping("setIncludeHiddenAssets:")
    public native void setIncludesHiddenAssets(boolean v);
    @Mapping("includeAllBurstAssets")
    public native boolean includesAllBurstAssets();
    @Mapping("setIncludeAllBurstAssets:")
    public native void setIncludesAllBurstAssets(boolean v);
    @Mapping("wantsIncrementalChangeDetails")
    public native boolean wantsIncrementalChangeDetails();
    @Mapping("setWantsIncrementalChangeDetails:")
    public native void setWantsIncrementalChangeDetails(boolean v);
    
    
    
    @Mapping("copyWithZone:")
    public native Object copyWithZone$(NSZone zone);
    
}

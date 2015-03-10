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
 * @since Available in iOS 4.0 and later.
 */

@Library("Foundation") @Mapping("NSCache")
public class NSCache 
    extends NSObject 
     {

    
    
    public NSCache() {}
    
    
    @Mapping("name")
    public native String getName();
    public native void setName(String v);
    @Mapping("delegate")
    public native NSCacheDelegate getDelegate();
    public native void setDelegate(NSCacheDelegate v);
    @Mapping("totalCostLimit")
    public native @MachineSizedUInt long getTotalCostLimit();
    public native void setTotalCostLimit(@MachineSizedUInt long v);
    @Mapping("countLimit")
    public native @MachineSizedUInt long getCountLimit();
    public native void setCountLimit(@MachineSizedUInt long v);
    @Mapping("evictsObjectsWithDiscardedContent")
    public native boolean evictsObjectsWithDiscardedContent();
    public native void setEvictsObjectsWithDiscardedContent(boolean v);
    
    
    
    @Mapping("objectForKey:")
    public native Object get(Object key);
    @Mapping("setObject:forKey:")
    protected native void setObject(Object obj, Object key);
    @Mapping("setObject:forKey:cost:")
    protected native void setObject(Object obj, Object key, @MachineSizedUInt long g);
    @Mapping("removeObjectForKey:")
    public native void remove(Object key);
    @Mapping("removeAllObjects")
    public native void clear();
    
}

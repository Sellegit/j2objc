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

@Library("Foundation") @Mapping("NSMapTable")
public class NSMapTable <K, V>
    extends NSObject 
    implements NSCopying, NSCoding, NSFastEnumeration {

    
    
    public NSMapTable() {}
    @Mapping("initWithKeyOptions:valueOptions:capacity:")
    public NSMapTable(NSMapTableOptions keyOptions, NSMapTableOptions valueOptions, @MachineSizedUInt long initialCapacity) { }
    
    
    @Mapping("count")
    protected native @MachineSizedUInt long getCount();
    
    
    
    @Mapping("objectForKey:")
    protected native Object getObject(Object aKey);
    @Mapping("removeObjectForKey:")
    protected native void removeObject(Object aKey);
    @Mapping("setObject:forKey:")
    protected native void setObject(Object anObject, Object aKey);
    @Mapping("keyEnumerator")
    protected native NSEnumerator<K> getKeyEnumerator();
    @Mapping("objectEnumerator")
    protected native NSEnumerator<V> getObjectEnumerator();
    @Mapping("removeAllObjects")
    protected native void removeAllObjects();
    @Mapping("dictionaryRepresentation")
    public native NSDictionary<K, V> asDictionary();
    @Mapping("copyWithZone:")
    public native Object copyWithZone$(NSZone zone);
    @Mapping("encodeWithCoder:")
    public native void encode(NSCoder aCoder);
    
}

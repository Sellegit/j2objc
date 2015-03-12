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





@Library("Foundation") @Mapping("NSMutableDictionary")
public class NSMutableDictionary <K, V>
    extends NSDictionary 
     {

    
    
    @Mapping("initWithCapacity:")
    public NSMutableDictionary(@MachineSizedUInt long numItems) { }
    
    
    
    
    
    
    @Mapping("removeObjectForKey:")
    protected native void removeObject(Object aKey);
    @Mapping("setObject:forKey:")
    protected native void setObject(Object anObject, Cloneable aKey);
    @Mapping("removeAllObjects")
    protected native void removeAllObjects();
    
}

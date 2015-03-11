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


/*<javadoc>*/
/*</javadoc>*/
@Adapter
public abstract class NSCacheDelegateAdapter 
    extends Object 
    implements NSCacheDelegate {

    
    
    
    
    
    
    
    @NotImplemented("cache:willEvictObject:")
    public void willEvictObject(NSCache cache, Object obj) { throw new UnsupportedOperationException(); }
    
}

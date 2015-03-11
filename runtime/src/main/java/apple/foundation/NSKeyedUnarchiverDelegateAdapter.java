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

public abstract class NSKeyedUnarchiverDelegateAdapter 
    extends Object 
    implements NSKeyedUnarchiverDelegate {

    
    
    
    
    
    
    
    @NotImplemented("unarchiver:didDecodeObject:")
    public Object didDecodeObject(NSKeyedUnarchiver unarchiver, Object object) { throw new UnsupportedOperationException(); }
    @NotImplemented("unarchiver:willReplaceObject:withObject:")
    public void willReplaceObject(NSKeyedUnarchiver unarchiver, Object object, Object newObject) { throw new UnsupportedOperationException(); }
    @NotImplemented("unarchiverWillFinish:")
    public void willFinish(NSKeyedUnarchiver unarchiver) { throw new UnsupportedOperationException(); }
    @NotImplemented("unarchiverDidFinish:")
    public void didFinish(NSKeyedUnarchiver unarchiver) { throw new UnsupportedOperationException(); }
    
}

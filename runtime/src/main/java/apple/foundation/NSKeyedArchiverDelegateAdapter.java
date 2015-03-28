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
public abstract class NSKeyedArchiverDelegateAdapter 
    extends Object 
    implements NSKeyedArchiverDelegate {

    
    
    


    
    
    @NotImplemented("archiver:willEncodeObject:")
    public Object willEncodeObject(NSKeyedArchiver archiver, Object object) { throw new UnsupportedOperationException(); }
    @NotImplemented("archiver:didEncodeObject:")
    public void didEncodeObject(NSKeyedArchiver archiver, Object object) { throw new UnsupportedOperationException(); }
    @NotImplemented("archiver:willReplaceObject:withObject:")
    public void willReplaceObject(NSKeyedArchiver archiver, Object object, Object newObject) { throw new UnsupportedOperationException(); }
    @NotImplemented("archiverWillFinish:")
    public void willFinish(NSKeyedArchiver archiver) { throw new UnsupportedOperationException(); }
    @NotImplemented("archiverDidFinish:")
    public void didFinish(NSKeyedArchiver archiver) { throw new UnsupportedOperationException(); }

}

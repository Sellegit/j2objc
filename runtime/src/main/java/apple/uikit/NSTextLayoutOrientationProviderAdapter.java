package apple.uikit;


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
import apple.coreanimation.*;
import apple.coredata.*;
import apple.coreimage.*;
import apple.coretext.*;
import apple.corelocation.*;


/*<javadoc>*/
/*</javadoc>*/
@Adapter
public abstract class NSTextLayoutOrientationProviderAdapter 
    extends Object 
    implements NSTextLayoutOrientationProvider {

    
    
    
    /**
     * @since Available in iOS 7.0 and later.
     */
    @NotImplemented("layoutOrientation")
    public @Representing("NSTextLayoutOrientation") long getLayoutOrientation() { throw new UnsupportedOperationException(); }
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("setLayoutOrientation:")
    public void setLayoutOrientation(@Representing("NSTextLayoutOrientation") long v) { throw new UnsupportedOperationException(); }
    
    
    
    
    
}

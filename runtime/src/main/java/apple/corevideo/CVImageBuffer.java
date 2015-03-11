package apple.corevideo;


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
import apple.opengles.*;
import apple.coremedia.*;
import apple.metal.*;


/*<javadoc>*/
/*</javadoc>*/
@Library("CoreVideo")
public class CVImageBuffer 
    extends CVBuffer 
     {

    
    
    
    
    
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CVImageBufferGetEncodedSize")
    public native CGSize getEncodedSize();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CVImageBufferGetDisplaySize")
    public native CGSize getDisplaySize();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CVImageBufferGetCleanRect")
    public native CGRect getCleanRect();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CVImageBufferIsFlipped")
    public native boolean isFlipped();
    
}

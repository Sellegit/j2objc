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

/*<javadoc>*/
/*</javadoc>*/
@Mapping("CVImageBufferRef") @Library("CoreVideo/CoreVideo.h")
public class CVImageBuffer 
    extends CVBuffer 
     {

    
    
    protected CVImageBuffer() {}

    
    
    
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CVImageBufferGetEncodedSize")
    public static native CGSize getEncodedSize(CVImageBuffer imageBuffer);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CVImageBufferGetDisplaySize")
    public static native CGSize getDisplaySize(CVImageBuffer imageBuffer);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CVImageBufferGetCleanRect")
    public static native CGRect getCleanRect(CVImageBuffer imageBuffer);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CVImageBufferIsFlipped")
    public static native boolean isFlipped(CVImageBuffer imageBuffer);

}

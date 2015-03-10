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
public class CVBuffer 
    extends CFType 
     {

    
    
    
    
    
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CVBufferSetAttachment")
    public native void setAttachment(CFString key, CFType value, CVAttachmentMode attachmentMode);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CVBufferGetAttachment")
    protected native CFType getAttachment(CFString key, Todo attachmentMode);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CVBufferRemoveAttachment")
    public native void removeAttachment(CFString key);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CVBufferRemoveAllAttachments")
    public native void removeAllAttachments();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CVBufferGetAttachments")
    public native NSDictionary<NSString, ?> getAttachments(CVAttachmentMode attachmentMode);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CVBufferSetAttachments")
    public native void setAttachments(NSDictionary<NSString, ?> theAttachments, CVAttachmentMode attachmentMode);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CVBufferPropagateAttachments")
    public native void propagateAttachments(CVBuffer destinationBuffer);
    
}

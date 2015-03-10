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
public abstract class NSTextAttachmentContainerAdapter 
    extends Object 
    implements NSTextAttachmentContainer {

    
    
    
    
    
    
    
    /**
     * @since Available in iOS 7.0 and later.
     */
    @NotImplemented("imageForBounds:textContainer:characterIndex:")
    public UIImage getImageForBounds(CGRect imageBounds, NSTextContainer textContainer, @MachineSizedUInt long charIndex) { throw new UnsupportedOperationException(); }
    /**
     * @since Available in iOS 7.0 and later.
     */
    @NotImplemented("attachmentBoundsForTextContainer:proposedLineFragment:glyphPosition:characterIndex:")
    public CGRect getAttachmentBounds(NSTextContainer textContainer, CGRect lineFrag, CGPoint position, @MachineSizedUInt long charIndex) { throw new UnsupportedOperationException(); }
    
}

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





@Library("UIKit/UIKit.h") @Mapping("NSTextAttachmentContainer")
public interface NSTextAttachmentContainer 
    extends NSObjectProtocol {

    
    
    
    
    
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("imageForBounds:textContainer:characterIndex:")
    UIImage getImageForBounds(CGRect imageBounds, NSTextContainer textContainer, @MachineSizedUInt long charIndex);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("attachmentBoundsForTextContainer:proposedLineFragment:glyphPosition:characterIndex:")
    CGRect getAttachmentBounds(NSTextContainer textContainer, CGRect lineFrag, CGPoint position, @MachineSizedUInt long charIndex);
    
    /*<adapter>*/
    /*</adapter>*/
}

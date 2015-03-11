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



/**
 * @since Available in iOS 7.0 and later.
 */

@Library("UIKit") @Mapping("NSTextAttachment")
public class NSTextAttachment 
    extends NSObject 
    implements NSTextAttachmentContainer, NSCoding {

    
    public static final char AttachmentCharacter = 65532;
    
    
    public NSTextAttachment() {}
    @Mapping("initWithData:ofType:")
    public NSTextAttachment(NSData contentData, String uti) { }
    
    
    @Mapping("contents")
    public native NSData getContents();
    @Mapping("setContents:")
    public native void setContents(NSData v);
    @Mapping("fileType")
    public native String getFileType();
    @Mapping("setFileType:")
    public native void setFileType(String v);
    @Mapping("fileWrapper")
    public native NSFileWrapper getFileWrapper();
    @Mapping("setFileWrapper:")
    public native void setFileWrapper(NSFileWrapper v);
    @Mapping("image")
    public native UIImage getImage();
    @Mapping("setImage:")
    public native void setImage(UIImage v);
    @Mapping("bounds")
    public native CGRect getBounds();
    @Mapping("setBounds:")
    public native void setBounds(CGRect v);
    
    
    
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("imageForBounds:textContainer:characterIndex:")
    public native UIImage getImageForBounds(CGRect imageBounds, NSTextContainer textContainer, @MachineSizedUInt long charIndex);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("attachmentBoundsForTextContainer:proposedLineFragment:glyphPosition:characterIndex:")
    public native CGRect getAttachmentBounds(NSTextContainer textContainer, CGRect lineFrag, CGPoint position, @MachineSizedUInt long charIndex);
    @Mapping("encodeWithCoder:")
    public native void encode(NSCoder aCoder);
    
}

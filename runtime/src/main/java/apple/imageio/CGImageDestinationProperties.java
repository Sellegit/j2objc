package apple.imageio;


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


/*<javadoc>*/
/*</javadoc>*/
@Library("ImageIO/ImageIO.h")
public class CGImageDestinationProperties 
    extends CGImageProperties 
     {

    
    
    
    
    
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImageDestinationLossyCompressionQuality")
    protected static native CFString LossyCompressionQualityKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImageDestinationBackgroundColor")
    protected static native CFString BackgroundColorKey();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("kCGImageDestinationImageMaxPixelSize")
    protected static native CFString ImageMaxPixelSizeKey();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("kCGImageDestinationEmbedThumbnail")
    protected static native CFString EmbedThumbnailKey();
    
}

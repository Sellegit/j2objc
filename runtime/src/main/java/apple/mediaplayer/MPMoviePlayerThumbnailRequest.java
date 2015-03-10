package apple.mediaplayer;


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
import apple.uikit.*;


/*<javadoc>*/
/*</javadoc>*/
@Library("MediaPlayer")
public class MPMoviePlayerThumbnailRequest 
    extends Object 
     {

    
    
    
    
    
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalConstant("MPMoviePlayerThumbnailImageKey")
    protected static native NSString ImageKey();
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalConstant("MPMoviePlayerThumbnailTimeKey")
    protected static native NSString TimeKey();
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalConstant("MPMoviePlayerThumbnailErrorKey")
    protected static native NSString ErrorKey();
    
}

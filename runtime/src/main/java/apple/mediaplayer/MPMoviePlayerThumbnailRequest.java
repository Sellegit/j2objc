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
@Library("MediaPlayer/MediaPlayer.h")
public class MPMoviePlayerThumbnailRequest 
    extends Object 
     {

    
    
    
    
    
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalConstant("MPMoviePlayerThumbnailImageKey")
    public static native NSString ImageKey();
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalConstant("MPMoviePlayerThumbnailTimeKey")
    public static native NSString TimeKey();
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalConstant("MPMoviePlayerThumbnailErrorKey")
    public static native NSString ErrorKey();

}

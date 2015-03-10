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
public class MPMoviePlayerFullscreenAnimation 
    extends Object 
     {

    
    
    
    
    
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalConstant("MPMoviePlayerFullscreenAnimationDurationUserInfoKey")
    protected static native NSString DurationUserInfoKey();
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalConstant("MPMoviePlayerFullscreenAnimationCurveUserInfoKey")
    protected static native NSString CurveUserInfoKey();
    
}

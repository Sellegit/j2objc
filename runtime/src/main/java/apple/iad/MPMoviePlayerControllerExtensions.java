package apple.iad;


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
import apple.addressbook.*;
import apple.mediaplayer.*;
import apple.avkit.*;


/*<javadoc>*/
/*</javadoc>*/
@Library("iAd")
public final class MPMoviePlayerControllerExtensions 
    extends NSExtensions 
     {

    
    
    private MPMoviePlayerControllerExtensions() {}
    
    
    
    
    
    
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("playPrerollAdWithCompletionHandler:")
    public static native void playPrerollAd(MPMoviePlayerController thiz, @Block VoidBlock1<NSError> completionHandler);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("cancelPreroll")
    public static native void cancelPreroll(MPMoviePlayerController thiz);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("preparePrerollAds")
    public static native void preparePrerollAds();
    
}

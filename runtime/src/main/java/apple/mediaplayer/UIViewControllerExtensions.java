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
@Library("MediaPlayer/MediaPlayer.h") @Mapping("UIViewController")
public final class UIViewControllerExtensions 
    extends NSExtensions 
     {

    
    
    private UIViewControllerExtensions() {}

    


    
    
    @ExtensionMapping("presentMoviePlayerViewControllerAnimated:")
    public static native void presentMoviePlayerViewController(UIViewController thiz, MPMoviePlayerViewController moviePlayerViewController);
    @ExtensionMapping("dismissMoviePlayerViewControllerAnimated")
    public static native void dismissMoviePlayerViewController(UIViewController thiz);

}

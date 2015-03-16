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
@Library("UIKit/UIKit.h")
public class UIVideo 
    extends Object 
     {

    
    
    
    
    
    /**
     * @since Available in iOS 3.1 and later.
     */
    @GlobalFunction("UIVideoAtPathIsCompatibleWithSavedPhotosAlbum")
    protected static native boolean isCompatibleWithSavedPhotosAlbum(String videoPath);
    /**
     * @since Available in iOS 3.1 and later.
     */
    @GlobalFunction("UISaveVideoAtPathToSavedPhotosAlbum")
    public static native void saveToPhotosAlbum(String videoPath, Object completionTarget, Selector completionSelector, Todo contextInfo);
    
}

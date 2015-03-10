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



/**
 * @since Available in iOS 3.0 and later.
 */

@Library("MediaPlayer") @Mapping("MPMediaLibrary")
public class MPMediaLibrary 
    extends NSObject 
     {

    
    
    public MPMediaLibrary() {}
    
    
    @Mapping("lastModifiedDate")
    public native NSDate getLastModifiedDate();
    
    
    
    @GlobalConstant("MPMediaLibraryDidChangeNotification")
    public static native NSString DidChangeNotification();
    
    @Mapping("beginGeneratingLibraryChangeNotifications")
    public native void beginGeneratingLibraryChangeNotifications();
    @Mapping("endGeneratingLibraryChangeNotifications")
    public native void endGeneratingLibraryChangeNotifications();
    @Mapping("defaultMediaLibrary")
    public static native MPMediaLibrary getDefaultMediaLibrary();
    
}

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
@Library("MediaPlayer/MediaPlayer.h") @Mapping("MPMediaPickerController")
public class MPMediaPickerController 
    extends UIViewController 
     {

    
    
    @Mapping("initWithMediaTypes:")
    public MPMediaPickerController(@Representing("MPMediaType") long mediaTypes) { }
    @Mapping("initWithNibName:bundle:")
    public MPMediaPickerController(String nibNameOrNil, NSBundle nibBundleOrNil) { }
    @Mapping("init")
    public MPMediaPickerController() { }

    
    @Mapping("mediaTypes")
    public native @Representing("MPMediaType") long getMediaTypes();
    @Mapping("delegate")
    public native MPMediaPickerControllerDelegate getDelegate();
    @Mapping("setDelegate:")
    public native void setDelegate(MPMediaPickerControllerDelegate v);
    @Mapping("allowsPickingMultipleItems")
    public native boolean allowsPickingMultipleItems();
    @Mapping("setAllowsPickingMultipleItems:")
    public native void setAllowsPickingMultipleItems(boolean v);
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("showsCloudItems")
    public native boolean showsCloudItems();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("setShowsCloudItems:")
    public native void setShowsCloudItems(boolean v);
    @Mapping("prompt")
    public native String getPrompt();
    @Mapping("setPrompt:")
    public native void setPrompt(String v);

    
    


}

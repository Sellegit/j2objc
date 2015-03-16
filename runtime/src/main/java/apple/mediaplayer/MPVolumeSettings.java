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
public class MPVolumeSettings 
    extends Object 
     {

    
    
    
    
    
    @GlobalFunction("MPVolumeSettingsAlertShow")
    public static native void showAlert();
    @GlobalFunction("MPVolumeSettingsAlertHide")
    public static native void hideAlert();
    @GlobalFunction("MPVolumeSettingsAlertIsVisible")
    public static native boolean isAlertVisible();
    
}

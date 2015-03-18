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
 * @since Available in iOS 7.1 and later.
 */

@Library("MediaPlayer/MediaPlayer.h") @Mapping("MPRatingCommand")
public class MPRatingCommand 
    extends MPRemoteCommand 
     {

    
    
    @Mapping("init")
    public MPRatingCommand() { }
    
    
    @Mapping("minimumRating")
    public native float getMinimumRating();
    @Mapping("setMinimumRating:")
    public native void setMinimumRating(float v);
    @Mapping("maximumRating")
    public native float getMaximumRating();
    @Mapping("setMaximumRating:")
    public native void setMaximumRating(float v);
    
    
    
    
    
}

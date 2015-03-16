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
 * @since Available in iOS 4.2 and later.
 */

@Library("MediaPlayer/MediaPlayer.h") @Mapping("MPMediaQuerySection")
public class MPMediaQuerySection 
    extends NSObject 
    implements NSCopying {

    
    
    public MPMediaQuerySection() {}
    
    
    @Mapping("title")
    public native String getTitle();
    @Mapping("range")
    public native NSRange getRange();
    
    
    
    @Mapping("copyWithZone:")
    public native Object copyWithZone$(NSZone zone);
    
}
